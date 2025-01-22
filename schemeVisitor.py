# Generated from scheme.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .schemeParser import schemeParser
else:
    from schemeParser import schemeParser

# This class defines a complete generic visitor for a parse tree produced by schemeParser.

class schemeVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by schemeParser#program.
    def visitProgram(self, ctx:schemeParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#expr.
    def visitExpr(self, ctx:schemeParser.ExprContext):
        return self.visitChildren(ctx)



del schemeParser