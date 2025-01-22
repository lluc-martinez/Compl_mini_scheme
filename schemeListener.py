# Generated from scheme.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .schemeParser import schemeParser
else:
    from schemeParser import schemeParser

# This class defines a complete listener for a parse tree produced by schemeParser.
class schemeListener(ParseTreeListener):

    # Enter a parse tree produced by schemeParser#program.
    def enterProgram(self, ctx:schemeParser.ProgramContext):
        pass

    # Exit a parse tree produced by schemeParser#program.
    def exitProgram(self, ctx:schemeParser.ProgramContext):
        pass


    # Enter a parse tree produced by schemeParser#expr.
    def enterExpr(self, ctx:schemeParser.ExprContext):
        pass

    # Exit a parse tree produced by schemeParser#expr.
    def exitExpr(self, ctx:schemeParser.ExprContext):
        pass



del schemeParser