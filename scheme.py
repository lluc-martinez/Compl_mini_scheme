import sys
from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor

class SchemeInterpreter(schemeVisitor):
    def __init__(self):
        self.global_env = {
            'display': self.display_function,
            'read': input,
            'newline': lambda: print(),
            'mod': lambda x, y: x % y,
            'and': lambda *args: all(args),
            'or': lambda *args: any(args),
            'not': lambda x: not x,
            'car': lambda lst: lst[0] if lst else None,
            'cdr': lambda lst: lst[1:] if lst else [],
            'cons': lambda x, lst: [x] + (lst if isinstance(lst, list) else [lst]),
            'null?': lambda lst: lst == [] if isinstance(lst, list) else False
        }
        self.current_env = self.global_env

    def display_function(self, value):
        # Convert the value to string properly
        if isinstance(value, (int, float)):
            print(str(value), end='')
        else:
            print(value, end='')
        return None  # Return None instead of the value to avoid double printing

    def get_variable(self, name, env):
        if name in env:
            return env[name]
        elif name in self.global_env:
            return self.global_env[name]
        else:
            raise NameError(f"Undefined variable: {name}")

    def visitProgram(self, ctx):
        result = None
        for stmt in ctx.statement():
            result = self.visit(stmt)
        return result

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()  # El primer IDENTIFIER es el nombre de la función
        params = [param.getText() for param in ctx.IDENTIFIER()[1:]]  # Los demás son parámetros
        body = ctx.expr()
        self.global_env[func_name] = (params, body)


    def visitConsDef(self, ctx):
        const_name = ctx.IDENTIFIER().getText()
        const_value = self.visit(ctx.expr())
        self.global_env[const_name] = const_value
        # Don't return the value for define statements
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
        local_env = self.current_env.copy()  # Create a new local environment
        for binding in ctx.letBinding():
            var_name = binding.IDENTIFIER().getText()
            value = self.visit(binding.expr(), env=local_env)
            local_env[var_name] = value

        # Evaluate the body of the let expression in the updated environment
        return self.visit(ctx.expr(), env=local_env)

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
            # Direct evaluation of list elements
            return [self.visit(e) for e in expr.expr()]
        elif isinstance(expr, schemeParser.NumberExprContext):
            return int(expr.NUMBER().getText())
        elif isinstance(expr, schemeParser.IdentifierExprContext):
            return expr.IDENTIFIER().getText()
        return self.visit(expr)

    def visitListExpr(self, ctx):
        # Directly evaluate all expressions in the list
        return [self.visit(e) for e in ctx.expr()]

    def visitBooleanExpr(self, ctx):
        return ctx.BOOLEAN().getText() == '#t'

    def visitStringExpr(self, ctx):
        # Remove surrounding quotes and handle escape sequences
        return ctx.STRING().getText()[1:-1]

    def visitFunctionCall(self, ctx):
        func_name = ctx.IDENTIFIER().getText()
        args = [self.visit(expr) for expr in ctx.expr()]

        if func_name in self.global_env:
            func = self.global_env[func_name]
            if callable(func):
                # Handle built-in functions
                return func(*args)
            else:
                # Handle user-defined functions
                params, body = func
                if len(args) != len(params):
                    raise ValueError(f"Incorrect number of arguments for function '{func_name}'")
                local_env = self.current_env.copy()
                local_env.update({param: arg for param, arg in zip(params, args)})
                return self.visit(body, env=local_env)
        else:
            raise NameError(f"Undefined function: {func_name}")

    def visitIdentifierExpr(self, ctx):
        var_name = ctx.IDENTIFIER().getText()
        # Return the actual value when an identifier is referenced
        return self.get_variable(var_name, self.current_env)

    def visitNumberExpr(self, ctx):
        try:
            return int(ctx.NUMBER().getText())
        except ValueError:
            return float(ctx.NUMBER().getText())

    def visit(self, ctx, env=None):
        if ctx is None:
            return None

        # Use the provided environment or default to global
        if env is None:
            env = self.global_env

        self.current_env = env  # Set the current environment
        return super().visit(ctx)

    def visitExpressionStatement(self, ctx):
        result = self.visit(ctx.expr())
        return result

def main(argv):
    try:
        if len(argv) < 2:
            print("Error: Please provide a Scheme file as argument")
            return
        
        # Specify UTF-8 encoding when reading the file
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
