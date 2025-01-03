import sys
from antlr4 import FileStream, CommonTokenStream
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor


class SchemeInterpreter(schemeVisitor):
    def __init__(self):
        self.global_env = {
            'display': self.display_function,
            'read': self.read_function,
            'newline': lambda: print(),
            'mod': lambda x, y: x % y,
            'and': lambda *args: all(args),
            'or': lambda *args: any(args),
            'not': lambda x: not x,
            'car': lambda lst: lst[0] if lst else None,
            'cdr': lambda lst: lst[1:] if lst else [],
            'cons': lambda x, lst: [x] + (lst if isinstance(lst, list)
                                          else [lst]),
            'null?': lambda lst: (lst == [])
            if isinstance(lst, list)
            else False
        }
        self.current_env = self.global_env

    def display_function(self, value):
        # Convert the value to string properly
        if isinstance(value, (int, float)):
            print(str(value), end='')
        else:
            print(value, end='')
        return None

    def read_function(self):
        return int(input())

    def get_variable(self, name, env):
        if name in env:
            return env[name]
        if name in self.global_env:
            return self.global_env[name]
        raise NameError(f"Undefined variable: {name}")

    def visitProgram(self, ctx):
        result = None
        for expr in ctx.expr():
            result = self.visit(expr)
        if 'main' in self.global_env:
            main_func = self.global_env['main']
            if callable(main_func):
                try:
                    result = main_func()
                except Exception as e:
                    print(f"Error in main: {e}")
        return result

    def visitVarDef(self, ctx):
        name = ctx.IDENTIFIER().getText()
        value = self.visit(ctx.expr())
        self.global_env[name] = value
        return None

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()
        params = [p.getText() for p in ctx.IDENTIFIER()[1:]]
        body_exprs = ctx.expr()
        def_env = self.current_env.copy()

        def func_wrapper(*args):
            if len(args) != len(params):
                raise ValueError(f"Incorrect number of arguments "
                                 f"for function '{func_name}'")
            func_env = def_env.copy()
            for param, arg in zip(params, args):
                func_env[param] = arg
            prev_env = self.current_env
            self.current_env = func_env
            try:
                result = None
                for expr in body_exprs:
                    result = self.visit(expr)
                return result
            finally:
                self.current_env = prev_env

        self.global_env[func_name] = func_wrapper
        return None

    def visitOperationExpr(self, ctx):
        op = ctx.operation().getText()
        args = [self.visit(expr) for expr in ctx.expr()]
        if op == '+':
            return sum(args)
        elif op == '-':
            return args[0] - sum(args[1:])
        elif op == '*':
            result = 1
            for arg in args:
                result *= arg
            return result
        elif op == '/':
            if any(arg == 0 for arg in args[1:]):
                raise ZeroDivisionError("Division by zero")
            result = args[0]
            for arg in args[1:]:
                result /= arg
            return result
        elif op == '>':
            return args[0] > args[1]
        elif op == '<':
            return args[0] < args[1]
        elif op == '>=':
            return args[0] >= args[1]
        elif op == '<=':
            return args[0] <= args[1]
        elif op == '=':
            return args[0] == args[1]
        elif op == '<>':
            return args[0] != args[1]
        else:
            raise ValueError(f"Unknown operator: {op}")

    def visitLetExpr(self, ctx):
        new_env = self.current_env.copy()
        for binding in ctx.letBinding():
            var_name = binding.IDENTIFIER().getText()
            value = self.visit(binding.expr())
            new_env[var_name] = value
        prev_env = self.current_env
        self.current_env = new_env
        try:
            result = None
            for expr in ctx.expr():
                result = self.visit(expr)
            return result
        finally:
            self.current_env = prev_env

    def visitIfExpr(self, ctx):
        condition = self.visit(ctx.expr(0))
        if condition:
            return self.visit(ctx.expr(1))
        else:
            return self.visit(ctx.expr(2))

    def visitCondExpr(self, ctx):
        for clause in ctx.condClause():
            condition = self.visit(clause.expr(0))
            if condition:
                return self.visit(clause.expr(1))
        return None

    def visitQuoteExpr(self, ctx):
        expr = ctx.expr()
        if isinstance(expr, schemeParser.ListExprContext):
            return [self.visit(e) for e in expr.expr()]
        elif isinstance(expr, schemeParser.NumberExprContext):
            return int(expr.NUMBER().getText())
        elif isinstance(expr, schemeParser.IdentifierExprContext):
            return expr.IDENTIFIER().getText()
        return self.visit(expr)

    def visitListExpr(self, ctx):
        return [self.visit(e) for e in ctx.expr()]

    def visitBooleanExpr(self, ctx):
        return ctx.BOOLEAN().getText() == '#t'

    def visitStringExpr(self, ctx):
        return ctx.STRING().getText()[1:-1]

    def visitFunctionCall(self, ctx):
        func_name = ctx.IDENTIFIER().getText()
        args = [self.visit(expr) for expr in ctx.expr()]
        if func_name not in self.global_env:
            raise NameError(f"Undefined function: {func_name}")
        func = self.global_env[func_name]
        if callable(func):
            if (isinstance(func, type(lambda: None))
                    and not hasattr(func, '__defaults__')):
                return func(*args)
            new_env = self.current_env.copy()
            prev_env = self.current_env
            self.current_env = new_env
            try:
                return func(*args)
            finally:
                self.current_env = prev_env
        else:
            raise TypeError(f"'{func_name}' is not callable")

    def visitIdentifierExpr(self, ctx):
        var_name = ctx.IDENTIFIER().getText()
        try:
            return self.get_variable(var_name, self.current_env)
        except NameError:
            if var_name in self.global_env:
                return self.global_env[var_name]
            raise NameError(f"Undefined variable: {var_name}")

    def visitNumberExpr(self, ctx):
        try:
            return int(ctx.NUMBER().getText())
        except ValueError:
            return float(ctx.NUMBER().getText())

    def visit(self, ctx):
        if ctx is None:
            return None
        return super().visit(ctx)

    def visitExpressionStatement(self, ctx):
        result = self.visit(ctx.expr())
        return result


def main(argv):
    try:
        if len(argv) < 2:
            print("Error: Please provide a Scheme file as argument")
            return
        input_stream = FileStream(argv[1], encoding='utf8')
        lexer = schemeLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = schemeParser(stream)
        tree = parser.program()
        interpreter = SchemeInterpreter()
        interpreter.visit(tree)
    except Exception as e:
        print(f"Error: {e}")


if __name__ == '__main__':
    main(sys.argv)
