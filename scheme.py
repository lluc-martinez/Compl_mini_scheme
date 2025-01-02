import sys
from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor

class SchemeInterpreter(schemeVisitor):
    def __init__(self):
        self.global_env = {}

    def visitProgram(self, ctx):
        for stmt in ctx.statement():
            self.visit(stmt)

    def visitFuncDef(self, ctx):
        func_name = ctx.IDENTIFIER(0).getText()
        params = [param.getText() for param in ctx.IDENTIFIER()[1:]]
        body = ctx.expr()
        self.global_env[func_name] = (params, body)

    def visitConsDef(self, ctx):
        const_name = ctx.IDENTIFIER().getText()
        value = self.visit(ctx.expr())
        self.global_env[const_name] = value

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

    def visitIfExpr(self, ctx):
        condition = self.visit(ctx.expr(0))
        if condition:
            return self.visit(ctx.expr(1))
        else:
            return self.visit(ctx.expr(2))

    def visitCondExpr(self, ctx):
        for clause in ctx.condClause():
            if self.visit(clause.expr(0)):
                return self.visit(clause.expr(1))
        return None

    def visitLetExpr(self, ctx):
        local_env = self.global_env.copy()
        for binding in ctx.letBinding():
            var_name = binding.IDENTIFIER().getText()
            value = self.visit(binding.expr())
            local_env[var_name] = value
        return self.visit(ctx.expr())

    def visitFunctionCall(self, ctx):
        func_name = ctx.IDENTIFIER().getText()
        args = [self.visit(expr) for expr in ctx.expr()]
        if func_name in self.global_env:
            params, body = self.global_env[func_name]
            local_env = self.global_env.copy()
            for param, arg in zip(params, args):
                local_env[param] = arg
            return self.visit(body)
        elif func_name == 'display':
            print(args[0], end='')
        elif func_name == 'newline':
            print()
        elif func_name == 'read':
            return int(input())
        else:
            raise Exception(f"Undefined function: {func_name}")

    def visitQuoteExpr(self, ctx):
        return ctx.expr().getText()

    def visitNumberExpr(self, ctx):
        return int(ctx.NUMBER().getText())

    def visitIdentifierExpr(self, ctx):
        var_name = ctx.IDENTIFIER().getText()
        if var_name in self.global_env:
            return self.global_env[var_name]
        else:
            raise Exception(f"Undefined variable: {var_name}")

    def visitBooleanExpr(self, ctx):
        return ctx.boolean().getText() == 'true'

    def visitListExpr(self, ctx):
        return [self.visit(expr) for expr in ctx.expr()]

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = schemeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = schemeParser(stream)
    tree = parser.program()
    interpreter = SchemeInterpreter()
    interpreter.visit(tree)

if __name__ == '__main__':
    main(sys.argv)