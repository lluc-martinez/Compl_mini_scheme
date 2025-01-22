import sys
from antlr4 import FileStream, CommonTokenStream
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor


class SchemeInterpreter(schemeVisitor):
    def __init__(self):
        # Initialize the global environment with built-in functions
        self.global_env = {
            '+': lambda *args: sum(args),
            '-': lambda x, *args: x - sum(args),
            '*': lambda *args: eval('*'.join(map(str, args))),
            '/': lambda x, *args: x / eval('*'.join(map(str, args))) if all(args) else ZeroDivisionError("Division by zero"),
            '>': lambda x, y: x > y,
            '<': lambda x, y: x < y,
            '>=': lambda x, y: x >= y,
            '<=': lambda x, y: x <= y,
            '=': lambda x, y: x == y,
            'not': lambda x: not x,
            'and': lambda *args: all(args),
            'or': lambda *args: any(args),
            'car': lambda lst: lst[0] if lst else None,
            'cdr': lambda lst: lst[1:] if lst else [],
            'cons': lambda x, lst: [x] + lst,
            'null?': lambda lst: lst == [],
            'if': lambda cond, true_branch, false_branch: true_branch if cond else false_branch,
            'display': self.display_function,
            'newline': lambda: print(),
        }
        self.current_env = self.global_env

    def display_function(self, value):
        if isinstance(value, bool):
            print('#t' if value else '#f', end='')
        elif isinstance(value, (int, float)):
            print(value, end='')
        else:
            print(value, end='')

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
        return result

    def visitVarDef(self, ctx):
        name = ctx.IDENTIFIER().getText()
        value = self.visit(ctx.expr())
        self.global_env[name] = value

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()
        params = [p.getText() for p in ctx.IDENTIFIER()[1:]]
        body_exprs = ctx.expr()
        def_env = self.current_env.copy()

        def func_wrapper(*args):
            if len(args) != len(params):
                raise ValueError(f"Incorrect number of arguments for '{func_name}'")
            func_env = def_env.copy()
            func_env.update(zip(params, args))
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

    def visitQuoteExpr(self, ctx):
        return ctx.expr().getText()  # Returns quoted expression as-is

    def visitFunctionCall(self, ctx):
        func_name = ctx.IDENTIFIER().getText()
        args = [self.visit(expr) for expr in ctx.expr()]
        
        # Verifica si el operador es soportado
        if func_name in self.global_env:
            func = self.global_env[func_name]
            if callable(func):
                return func(*args)
            else:
                raise TypeError(f"'{func_name}' is no callable")
        else:
            raise NameError(f"Operator or function '{func_name}' not defined")

    def visitIdentifierExpr(self, ctx):
        var_name = ctx.IDENTIFIER().getText()
        return self.get_variable(var_name, self.current_env)

    def visitNumberExpr(self, ctx):
        return float(ctx.NUMBER().getText())

    def visit(self, ctx):
        if ctx is None:
            return None
        return super().visit(ctx)


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
