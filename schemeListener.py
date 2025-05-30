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


    # Enter a parse tree produced by schemeParser#FuncDef.
    def enterFuncDef(self, ctx:schemeParser.FuncDefContext):
        pass

    # Exit a parse tree produced by schemeParser#FuncDef.
    def exitFuncDef(self, ctx:schemeParser.FuncDefContext):
        pass


    # Enter a parse tree produced by schemeParser#VarDef.
    def enterVarDef(self, ctx:schemeParser.VarDefContext):
        pass

    # Exit a parse tree produced by schemeParser#VarDef.
    def exitVarDef(self, ctx:schemeParser.VarDefContext):
        pass


    # Enter a parse tree produced by schemeParser#LetExpr.
    def enterLetExpr(self, ctx:schemeParser.LetExprContext):
        pass

    # Exit a parse tree produced by schemeParser#LetExpr.
    def exitLetExpr(self, ctx:schemeParser.LetExprContext):
        pass


    # Enter a parse tree produced by schemeParser#IfExpr.
    def enterIfExpr(self, ctx:schemeParser.IfExprContext):
        pass

    # Exit a parse tree produced by schemeParser#IfExpr.
    def exitIfExpr(self, ctx:schemeParser.IfExprContext):
        pass


    # Enter a parse tree produced by schemeParser#CondExpr.
    def enterCondExpr(self, ctx:schemeParser.CondExprContext):
        pass

    # Exit a parse tree produced by schemeParser#CondExpr.
    def exitCondExpr(self, ctx:schemeParser.CondExprContext):
        pass


    # Enter a parse tree produced by schemeParser#LambdaExpr.
    def enterLambdaExpr(self, ctx:schemeParser.LambdaExprContext):
        pass

    # Exit a parse tree produced by schemeParser#LambdaExpr.
    def exitLambdaExpr(self, ctx:schemeParser.LambdaExprContext):
        pass


    # Enter a parse tree produced by schemeParser#OperationExpr.
    def enterOperationExpr(self, ctx:schemeParser.OperationExprContext):
        pass

    # Exit a parse tree produced by schemeParser#OperationExpr.
    def exitOperationExpr(self, ctx:schemeParser.OperationExprContext):
        pass


    # Enter a parse tree produced by schemeParser#FunctionCall.
    def enterFunctionCall(self, ctx:schemeParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by schemeParser#FunctionCall.
    def exitFunctionCall(self, ctx:schemeParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by schemeParser#QuoteExpr.
    def enterQuoteExpr(self, ctx:schemeParser.QuoteExprContext):
        pass

    # Exit a parse tree produced by schemeParser#QuoteExpr.
    def exitQuoteExpr(self, ctx:schemeParser.QuoteExprContext):
        pass


    # Enter a parse tree produced by schemeParser#NumberExpr.
    def enterNumberExpr(self, ctx:schemeParser.NumberExprContext):
        pass

    # Exit a parse tree produced by schemeParser#NumberExpr.
    def exitNumberExpr(self, ctx:schemeParser.NumberExprContext):
        pass


    # Enter a parse tree produced by schemeParser#StringExpr.
    def enterStringExpr(self, ctx:schemeParser.StringExprContext):
        pass

    # Exit a parse tree produced by schemeParser#StringExpr.
    def exitStringExpr(self, ctx:schemeParser.StringExprContext):
        pass


    # Enter a parse tree produced by schemeParser#IdentifierExpr.
    def enterIdentifierExpr(self, ctx:schemeParser.IdentifierExprContext):
        pass

    # Exit a parse tree produced by schemeParser#IdentifierExpr.
    def exitIdentifierExpr(self, ctx:schemeParser.IdentifierExprContext):
        pass


    # Enter a parse tree produced by schemeParser#BooleanExpr.
    def enterBooleanExpr(self, ctx:schemeParser.BooleanExprContext):
        pass

    # Exit a parse tree produced by schemeParser#BooleanExpr.
    def exitBooleanExpr(self, ctx:schemeParser.BooleanExprContext):
        pass


    # Enter a parse tree produced by schemeParser#ListExpr.
    def enterListExpr(self, ctx:schemeParser.ListExprContext):
        pass

    # Exit a parse tree produced by schemeParser#ListExpr.
    def exitListExpr(self, ctx:schemeParser.ListExprContext):
        pass


    # Enter a parse tree produced by schemeParser#operation.
    def enterOperation(self, ctx:schemeParser.OperationContext):
        pass

    # Exit a parse tree produced by schemeParser#operation.
    def exitOperation(self, ctx:schemeParser.OperationContext):
        pass


    # Enter a parse tree produced by schemeParser#condClause.
    def enterCondClause(self, ctx:schemeParser.CondClauseContext):
        pass

    # Exit a parse tree produced by schemeParser#condClause.
    def exitCondClause(self, ctx:schemeParser.CondClauseContext):
        pass


    # Enter a parse tree produced by schemeParser#letBinding.
    def enterLetBinding(self, ctx:schemeParser.LetBindingContext):
        pass

    # Exit a parse tree produced by schemeParser#letBinding.
    def exitLetBinding(self, ctx:schemeParser.LetBindingContext):
        pass



del schemeParser