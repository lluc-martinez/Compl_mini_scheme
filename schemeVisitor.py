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


    # Visit a parse tree produced by schemeParser#FuncDef.
    def visitFuncDef(self, ctx:schemeParser.FuncDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#VarDef.
    def visitVarDef(self, ctx:schemeParser.VarDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#LetExpr.
    def visitLetExpr(self, ctx:schemeParser.LetExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#IfExpr.
    def visitIfExpr(self, ctx:schemeParser.IfExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#CondExpr.
    def visitCondExpr(self, ctx:schemeParser.CondExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#LambdaExpr.
    def visitLambdaExpr(self, ctx:schemeParser.LambdaExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#OperationExpr.
    def visitOperationExpr(self, ctx:schemeParser.OperationExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#FunctionCall.
    def visitFunctionCall(self, ctx:schemeParser.FunctionCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#QuoteExpr.
    def visitQuoteExpr(self, ctx:schemeParser.QuoteExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#NumberExpr.
    def visitNumberExpr(self, ctx:schemeParser.NumberExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#StringExpr.
    def visitStringExpr(self, ctx:schemeParser.StringExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#IdentifierExpr.
    def visitIdentifierExpr(self, ctx:schemeParser.IdentifierExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#BooleanExpr.
    def visitBooleanExpr(self, ctx:schemeParser.BooleanExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#ListExpr.
    def visitListExpr(self, ctx:schemeParser.ListExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#operation.
    def visitOperation(self, ctx:schemeParser.OperationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#condClause.
    def visitCondClause(self, ctx:schemeParser.CondClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by schemeParser#letBinding.
    def visitLetBinding(self, ctx:schemeParser.LetBindingContext):
        return self.visitChildren(ctx)



del schemeParser