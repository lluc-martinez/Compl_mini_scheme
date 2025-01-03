# Generated from scheme.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,24,126,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,4,0,18,8,0,11,0,12,0,19,1,0,1,0,1,1,1,1,1,1,3,1,27,
        8,1,1,2,1,2,1,2,4,2,32,8,2,11,2,12,2,33,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,4,2,48,8,2,11,2,12,2,49,1,2,1,2,1,2,1,2,
        1,2,1,2,4,2,58,8,2,11,2,12,2,59,1,2,1,2,1,2,1,2,1,2,1,2,1,2,5,2,
        69,8,2,10,2,12,2,72,9,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,5,2,86,8,2,10,2,12,2,89,9,2,1,2,3,2,92,8,2,1,3,1,3,1,4,1,
        4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,5,6,111,8,
        6,10,6,12,6,114,9,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
        0,0,8,0,2,4,6,8,10,12,14,0,1,1,0,7,16,136,0,17,1,0,0,0,2,26,1,0,
        0,0,4,91,1,0,0,0,6,93,1,0,0,0,8,95,1,0,0,0,10,100,1,0,0,0,12,105,
        1,0,0,0,14,119,1,0,0,0,16,18,3,2,1,0,17,16,1,0,0,0,18,19,1,0,0,0,
        19,17,1,0,0,0,19,20,1,0,0,0,20,21,1,0,0,0,21,22,5,0,0,1,22,1,1,0,
        0,0,23,27,3,4,2,0,24,27,3,12,6,0,25,27,3,14,7,0,26,23,1,0,0,0,26,
        24,1,0,0,0,26,25,1,0,0,0,27,3,1,0,0,0,28,29,5,1,0,0,29,31,3,6,3,
        0,30,32,3,4,2,0,31,30,1,0,0,0,32,33,1,0,0,0,33,31,1,0,0,0,33,34,
        1,0,0,0,34,35,1,0,0,0,35,36,5,2,0,0,36,92,1,0,0,0,37,38,5,1,0,0,
        38,39,5,3,0,0,39,40,3,4,2,0,40,41,3,4,2,0,41,42,3,4,2,0,42,43,5,
        2,0,0,43,92,1,0,0,0,44,45,5,1,0,0,45,47,5,4,0,0,46,48,3,8,4,0,47,
        46,1,0,0,0,48,49,1,0,0,0,49,47,1,0,0,0,49,50,1,0,0,0,50,51,1,0,0,
        0,51,52,5,2,0,0,52,92,1,0,0,0,53,54,5,1,0,0,54,55,5,5,0,0,55,57,
        5,1,0,0,56,58,3,10,5,0,57,56,1,0,0,0,58,59,1,0,0,0,59,57,1,0,0,0,
        59,60,1,0,0,0,60,61,1,0,0,0,61,62,5,2,0,0,62,63,3,4,2,0,63,64,5,
        2,0,0,64,92,1,0,0,0,65,66,5,1,0,0,66,70,5,22,0,0,67,69,3,4,2,0,68,
        67,1,0,0,0,69,72,1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,73,1,0,0,
        0,72,70,1,0,0,0,73,92,5,2,0,0,74,75,5,1,0,0,75,76,5,6,0,0,76,77,
        3,4,2,0,77,78,5,2,0,0,78,92,1,0,0,0,79,92,5,21,0,0,80,92,5,20,0,
        0,81,92,5,22,0,0,82,92,5,18,0,0,83,87,5,1,0,0,84,86,3,4,2,0,85,84,
        1,0,0,0,86,89,1,0,0,0,87,85,1,0,0,0,87,88,1,0,0,0,88,90,1,0,0,0,
        89,87,1,0,0,0,90,92,5,2,0,0,91,28,1,0,0,0,91,37,1,0,0,0,91,44,1,
        0,0,0,91,53,1,0,0,0,91,65,1,0,0,0,91,74,1,0,0,0,91,79,1,0,0,0,91,
        80,1,0,0,0,91,81,1,0,0,0,91,82,1,0,0,0,91,83,1,0,0,0,92,5,1,0,0,
        0,93,94,7,0,0,0,94,7,1,0,0,0,95,96,5,1,0,0,96,97,3,4,2,0,97,98,3,
        4,2,0,98,99,5,2,0,0,99,9,1,0,0,0,100,101,5,1,0,0,101,102,5,22,0,
        0,102,103,3,4,2,0,103,104,5,2,0,0,104,11,1,0,0,0,105,106,5,1,0,0,
        106,107,5,17,0,0,107,108,5,1,0,0,108,112,5,22,0,0,109,111,5,22,0,
        0,110,109,1,0,0,0,111,114,1,0,0,0,112,110,1,0,0,0,112,113,1,0,0,
        0,113,115,1,0,0,0,114,112,1,0,0,0,115,116,5,2,0,0,116,117,3,4,2,
        0,117,118,5,2,0,0,118,13,1,0,0,0,119,120,5,1,0,0,120,121,5,17,0,
        0,121,122,5,22,0,0,122,123,3,4,2,0,123,124,5,2,0,0,124,15,1,0,0,
        0,9,19,26,33,49,59,70,87,91,112
    ]

class schemeParser ( Parser ):

    grammarFileName = "scheme.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "'if'", "'cond'", "'let'", 
                     "'quote'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
                     "'>='", "'<='", "'='", "'<>'", "'define'", "<INVALID>", 
                     "'''" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "BOOLEAN", "QUOTE", "STRING", 
                      "NUMBER", "IDENTIFIER", "WS", "COMMENT" ]

    RULE_program = 0
    RULE_statement = 1
    RULE_expr = 2
    RULE_operation = 3
    RULE_condClause = 4
    RULE_letBinding = 5
    RULE_funcDef = 6
    RULE_consDef = 7

    ruleNames =  [ "program", "statement", "expr", "operation", "condClause", 
                   "letBinding", "funcDef", "consDef" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    BOOLEAN=18
    QUOTE=19
    STRING=20
    NUMBER=21
    IDENTIFIER=22
    WS=23
    COMMENT=24

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(schemeParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.StatementContext)
            else:
                return self.getTypedRuleContext(schemeParser.StatementContext,i)


        def getRuleIndex(self):
            return schemeParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = schemeParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 16
                self.statement()
                self.state = 19 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 7602178) != 0)):
                    break

            self.state = 21
            self.match(schemeParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_statement

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ExpressionStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressionStatement" ):
                listener.enterExpressionStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressionStatement" ):
                listener.exitExpressionStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpressionStatement" ):
                return visitor.visitExpressionStatement(self)
            else:
                return visitor.visitChildren(self)


    class FunctionDefinitionContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def funcDef(self):
            return self.getTypedRuleContext(schemeParser.FuncDefContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDefinition" ):
                listener.enterFunctionDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDefinition" ):
                listener.exitFunctionDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionDefinition" ):
                return visitor.visitFunctionDefinition(self)
            else:
                return visitor.visitChildren(self)


    class ConstantDefinitionContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def consDef(self):
            return self.getTypedRuleContext(schemeParser.ConsDefContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConstantDefinition" ):
                listener.enterConstantDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConstantDefinition" ):
                listener.exitConstantDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConstantDefinition" ):
                return visitor.visitConstantDefinition(self)
            else:
                return visitor.visitChildren(self)



    def statement(self):

        localctx = schemeParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 26
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                localctx = schemeParser.ExpressionStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 23
                self.expr()
                pass

            elif la_ == 2:
                localctx = schemeParser.FunctionDefinitionContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 24
                self.funcDef()
                pass

            elif la_ == 3:
                localctx = schemeParser.ConstantDefinitionContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 25
                self.consDef()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class StringExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(schemeParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStringExpr" ):
                listener.enterStringExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStringExpr" ):
                listener.exitStringExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStringExpr" ):
                return visitor.visitStringExpr(self)
            else:
                return visitor.visitChildren(self)


    class IfExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfExpr" ):
                listener.enterIfExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfExpr" ):
                listener.exitIfExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfExpr" ):
                return visitor.visitIfExpr(self)
            else:
                return visitor.visitChildren(self)


    class NumberExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(schemeParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumberExpr" ):
                listener.enterNumberExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumberExpr" ):
                listener.exitNumberExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumberExpr" ):
                return visitor.visitNumberExpr(self)
            else:
                return visitor.visitChildren(self)


    class LetExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)

        def letBinding(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.LetBindingContext)
            else:
                return self.getTypedRuleContext(schemeParser.LetBindingContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLetExpr" ):
                listener.enterLetExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLetExpr" ):
                listener.exitLetExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLetExpr" ):
                return visitor.visitLetExpr(self)
            else:
                return visitor.visitChildren(self)


    class IdentifierExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IDENTIFIER(self):
            return self.getToken(schemeParser.IDENTIFIER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIdentifierExpr" ):
                listener.enterIdentifierExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIdentifierExpr" ):
                listener.exitIdentifierExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIdentifierExpr" ):
                return visitor.visitIdentifierExpr(self)
            else:
                return visitor.visitChildren(self)


    class QuoteExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterQuoteExpr" ):
                listener.enterQuoteExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitQuoteExpr" ):
                listener.exitQuoteExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitQuoteExpr" ):
                return visitor.visitQuoteExpr(self)
            else:
                return visitor.visitChildren(self)


    class OperationExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def operation(self):
            return self.getTypedRuleContext(schemeParser.OperationContext,0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperationExpr" ):
                listener.enterOperationExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperationExpr" ):
                listener.exitOperationExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperationExpr" ):
                return visitor.visitOperationExpr(self)
            else:
                return visitor.visitChildren(self)


    class FunctionCallContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IDENTIFIER(self):
            return self.getToken(schemeParser.IDENTIFIER, 0)
        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionCall" ):
                listener.enterFunctionCall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionCall" ):
                listener.exitFunctionCall(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunctionCall" ):
                return visitor.visitFunctionCall(self)
            else:
                return visitor.visitChildren(self)


    class ListExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterListExpr" ):
                listener.enterListExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitListExpr" ):
                listener.exitListExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitListExpr" ):
                return visitor.visitListExpr(self)
            else:
                return visitor.visitChildren(self)


    class CondExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def condClause(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.CondClauseContext)
            else:
                return self.getTypedRuleContext(schemeParser.CondClauseContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondExpr" ):
                listener.enterCondExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondExpr" ):
                listener.exitCondExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondExpr" ):
                return visitor.visitCondExpr(self)
            else:
                return visitor.visitChildren(self)


    class BooleanExprContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a schemeParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOLEAN(self):
            return self.getToken(schemeParser.BOOLEAN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBooleanExpr" ):
                listener.enterBooleanExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBooleanExpr" ):
                listener.exitBooleanExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBooleanExpr" ):
                return visitor.visitBooleanExpr(self)
            else:
                return visitor.visitChildren(self)



    def expr(self):

        localctx = schemeParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.state = 91
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                localctx = schemeParser.OperationExprContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.match(schemeParser.T__0)
                self.state = 29
                self.operation()
                self.state = 31 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 30
                    self.expr()
                    self.state = 33 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 7602178) != 0)):
                        break

                self.state = 35
                self.match(schemeParser.T__1)
                pass

            elif la_ == 2:
                localctx = schemeParser.IfExprContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.match(schemeParser.T__0)
                self.state = 38
                self.match(schemeParser.T__2)
                self.state = 39
                self.expr()
                self.state = 40
                self.expr()
                self.state = 41
                self.expr()
                self.state = 42
                self.match(schemeParser.T__1)
                pass

            elif la_ == 3:
                localctx = schemeParser.CondExprContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 44
                self.match(schemeParser.T__0)
                self.state = 45
                self.match(schemeParser.T__3)
                self.state = 47 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 46
                    self.condClause()
                    self.state = 49 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==1):
                        break

                self.state = 51
                self.match(schemeParser.T__1)
                pass

            elif la_ == 4:
                localctx = schemeParser.LetExprContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 53
                self.match(schemeParser.T__0)
                self.state = 54
                self.match(schemeParser.T__4)
                self.state = 55
                self.match(schemeParser.T__0)
                self.state = 57 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 56
                    self.letBinding()
                    self.state = 59 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==1):
                        break

                self.state = 61
                self.match(schemeParser.T__1)
                self.state = 62
                self.expr()
                self.state = 63
                self.match(schemeParser.T__1)
                pass

            elif la_ == 5:
                localctx = schemeParser.FunctionCallContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 65
                self.match(schemeParser.T__0)
                self.state = 66
                self.match(schemeParser.IDENTIFIER)
                self.state = 70
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 7602178) != 0):
                    self.state = 67
                    self.expr()
                    self.state = 72
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 73
                self.match(schemeParser.T__1)
                pass

            elif la_ == 6:
                localctx = schemeParser.QuoteExprContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 74
                self.match(schemeParser.T__0)
                self.state = 75
                self.match(schemeParser.T__5)
                self.state = 76
                self.expr()
                self.state = 77
                self.match(schemeParser.T__1)
                pass

            elif la_ == 7:
                localctx = schemeParser.NumberExprContext(self, localctx)
                self.enterOuterAlt(localctx, 7)
                self.state = 79
                self.match(schemeParser.NUMBER)
                pass

            elif la_ == 8:
                localctx = schemeParser.StringExprContext(self, localctx)
                self.enterOuterAlt(localctx, 8)
                self.state = 80
                self.match(schemeParser.STRING)
                pass

            elif la_ == 9:
                localctx = schemeParser.IdentifierExprContext(self, localctx)
                self.enterOuterAlt(localctx, 9)
                self.state = 81
                self.match(schemeParser.IDENTIFIER)
                pass

            elif la_ == 10:
                localctx = schemeParser.BooleanExprContext(self, localctx)
                self.enterOuterAlt(localctx, 10)
                self.state = 82
                self.match(schemeParser.BOOLEAN)
                pass

            elif la_ == 11:
                localctx = schemeParser.ListExprContext(self, localctx)
                self.enterOuterAlt(localctx, 11)
                self.state = 83
                self.match(schemeParser.T__0)
                self.state = 87
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 7602178) != 0):
                    self.state = 84
                    self.expr()
                    self.state = 89
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 90
                self.match(schemeParser.T__1)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OperationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return schemeParser.RULE_operation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperation" ):
                listener.enterOperation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperation" ):
                listener.exitOperation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOperation" ):
                return visitor.visitOperation(self)
            else:
                return visitor.visitChildren(self)




    def operation(self):

        localctx = schemeParser.OperationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_operation)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 130944) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondClauseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def getRuleIndex(self):
            return schemeParser.RULE_condClause

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondClause" ):
                listener.enterCondClause(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondClause" ):
                listener.exitCondClause(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondClause" ):
                return visitor.visitCondClause(self)
            else:
                return visitor.visitChildren(self)




    def condClause(self):

        localctx = schemeParser.CondClauseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_condClause)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(schemeParser.T__0)
            self.state = 96
            self.expr()
            self.state = 97
            self.expr()
            self.state = 98
            self.match(schemeParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LetBindingContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(schemeParser.IDENTIFIER, 0)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)


        def getRuleIndex(self):
            return schemeParser.RULE_letBinding

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLetBinding" ):
                listener.enterLetBinding(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLetBinding" ):
                listener.exitLetBinding(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLetBinding" ):
                return visitor.visitLetBinding(self)
            else:
                return visitor.visitChildren(self)




    def letBinding(self):

        localctx = schemeParser.LetBindingContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_letBinding)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(schemeParser.T__0)
            self.state = 101
            self.match(schemeParser.IDENTIFIER)
            self.state = 102
            self.expr()
            self.state = 103
            self.match(schemeParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(schemeParser.IDENTIFIER)
            else:
                return self.getToken(schemeParser.IDENTIFIER, i)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)


        def getRuleIndex(self):
            return schemeParser.RULE_funcDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncDef" ):
                listener.enterFuncDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncDef" ):
                listener.exitFuncDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncDef" ):
                return visitor.visitFuncDef(self)
            else:
                return visitor.visitChildren(self)




    def funcDef(self):

        localctx = schemeParser.FuncDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_funcDef)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(schemeParser.T__0)
            self.state = 106
            self.match(schemeParser.T__16)
            self.state = 107
            self.match(schemeParser.T__0)
            self.state = 108
            self.match(schemeParser.IDENTIFIER)
            self.state = 112
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==22:
                self.state = 109
                self.match(schemeParser.IDENTIFIER)
                self.state = 114
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 115
            self.match(schemeParser.T__1)
            self.state = 116
            self.expr()
            self.state = 117
            self.match(schemeParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConsDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(schemeParser.IDENTIFIER, 0)

        def expr(self):
            return self.getTypedRuleContext(schemeParser.ExprContext,0)


        def getRuleIndex(self):
            return schemeParser.RULE_consDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConsDef" ):
                listener.enterConsDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConsDef" ):
                listener.exitConsDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConsDef" ):
                return visitor.visitConsDef(self)
            else:
                return visitor.visitChildren(self)




    def consDef(self):

        localctx = schemeParser.ConsDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_consDef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 119
            self.match(schemeParser.T__0)
            self.state = 120
            self.match(schemeParser.T__16)
            self.state = 121
            self.match(schemeParser.IDENTIFIER)
            self.state = 122
            self.expr()
            self.state = 123
            self.match(schemeParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





