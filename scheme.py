import sys
from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor

class SchemeInterpreter(schemeVisitor):
    def __init__(self):
        self.global_env = {}

    def get_variable(self, name, env):
        if name in env:
            return env[name]
        elif name in self.global_env:
            return self.global_env[name]
        else:
            raise NameError(f"Undefined variable: {name}")

    def visitProgram(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()  # El primer IDENTIFIER es el nombre de la función
        params = [param.getText() for param in ctx.IDENTIFIER()[1:]]  # Los demás son parámetros
        body = ctx.expr()
        self.global_env[func_name] = (params, body)


    def visitConsDef(self, ctx):
        const_name = ctx.IDENTIFIER().getText()
        const_value = self.visit(ctx.expr())
        self.global_env[const_name] = const_value
        return const_value

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



    def visitFunctionCall(self, ctx):
        func_name = ctx.IDENTIFIER().getText()  # Get the function name
        args = [self.visit(expr, env=self.current_env) for expr in ctx.expr()]  # Pass current env

        if func_name in self.global_env:
            params, body = self.global_env[func_name]  # Retrieve function definition
            if len(args) != len(params):
                raise ValueError(f"Incorrect number of arguments for function '{func_name}'")

            # Create a local environment for the function call
            local_env = self.current_env.copy()
            local_env.update({param: arg for param, arg in zip(params, args)})

            # Evaluate the function body in the local environment
            return self.visit(body, env=local_env)
        else:
            raise NameError(f"Undefined function: {func_name}")



    def visitIdentifierExpr(self, ctx):
        var_name = ctx.IDENTIFIER().getText()
        return self.get_variable(var_name, self.current_env)

    def visit(self, ctx, env=None):
        if ctx is None:
            return None

        # Use the provided environment or default to global
        if env is None:
            env = self.global_env

        self.current_env = env  # Set the current environment
        return super().visit(ctx)


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = schemeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = schemeParser(stream)
    tree = parser.program()
    interpreter = SchemeInterpreter()
    try:
        interpreter.visit(tree)
    except Exception as e:
        print(f"Error: {e}")

if __name__ == '__main__':
    main(sys.argv)
