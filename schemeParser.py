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
        4,1,19,30,2,0,7,0,2,1,7,1,1,0,5,0,6,8,0,10,0,12,0,9,9,0,1,0,1,0,
        1,1,1,1,1,1,5,1,16,8,1,10,1,12,1,19,9,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,3,1,28,8,1,1,1,0,0,2,0,2,0,0,34,0,7,1,0,0,0,2,27,1,0,0,0,4,6,
        3,2,1,0,5,4,1,0,0,0,6,9,1,0,0,0,7,5,1,0,0,0,7,8,1,0,0,0,8,10,1,0,
        0,0,9,7,1,0,0,0,10,11,5,0,0,1,11,1,1,0,0,0,12,13,5,1,0,0,13,17,5,
        6,0,0,14,16,3,2,1,0,15,14,1,0,0,0,16,19,1,0,0,0,17,15,1,0,0,0,17,
        18,1,0,0,0,18,20,1,0,0,0,19,17,1,0,0,0,20,28,5,2,0,0,21,28,5,3,0,
        0,22,28,5,4,0,0,23,28,5,5,0,0,24,28,5,6,0,0,25,26,5,7,0,0,26,28,
        3,2,1,0,27,12,1,0,0,0,27,21,1,0,0,0,27,22,1,0,0,0,27,23,1,0,0,0,
        27,24,1,0,0,0,27,25,1,0,0,0,28,3,1,0,0,0,3,7,17,27
    ]

class schemeParser ( Parser ):

    grammarFileName = "scheme.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'('", "')'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'''", "'+'", "'-'", "'*'", 
                     "'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "NUMBER", "BOOLEAN", 
                      "STRING", "IDENTIFIER", "QUOTE", "PLUS", "MINUS", 
                      "STAR", "SLASH", "LT", "LE", "GT", "GE", "EQUAL", 
                      "NOT_EQUAL", "WS", "COMMENT" ]

    RULE_program = 0
    RULE_expr = 1

    ruleNames =  [ "program", "expr" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    NUMBER=3
    BOOLEAN=4
    STRING=5
    IDENTIFIER=6
    QUOTE=7
    PLUS=8
    MINUS=9
    STAR=10
    SLASH=11
    LT=12
    LE=13
    GT=14
    GE=15
    EQUAL=16
    NOT_EQUAL=17
    WS=18
    COMMENT=19

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

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


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
            self.state = 7
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 250) != 0):
                self.state = 4
                self.expr()
                self.state = 9
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 10
            self.match(schemeParser.EOF)
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

        def IDENTIFIER(self):
            return self.getToken(schemeParser.IDENTIFIER, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(schemeParser.ExprContext)
            else:
                return self.getTypedRuleContext(schemeParser.ExprContext,i)


        def NUMBER(self):
            return self.getToken(schemeParser.NUMBER, 0)

        def BOOLEAN(self):
            return self.getToken(schemeParser.BOOLEAN, 0)

        def STRING(self):
            return self.getToken(schemeParser.STRING, 0)

        def QUOTE(self):
            return self.getToken(schemeParser.QUOTE, 0)

        def getRuleIndex(self):
            return schemeParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpr" ):
                return visitor.visitExpr(self)
            else:
                return visitor.visitChildren(self)




    def expr(self):

        localctx = schemeParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.state = 27
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 12
                self.match(schemeParser.T__0)
                self.state = 13
                self.match(schemeParser.IDENTIFIER)
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 250) != 0):
                    self.state = 14
                    self.expr()
                    self.state = 19
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 20
                self.match(schemeParser.T__1)
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 21
                self.match(schemeParser.NUMBER)
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 3)
                self.state = 22
                self.match(schemeParser.BOOLEAN)
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 4)
                self.state = 23
                self.match(schemeParser.STRING)
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 5)
                self.state = 24
                self.match(schemeParser.IDENTIFIER)
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 6)
                self.state = 25
                self.match(schemeParser.QUOTE)
                self.state = 26
                self.expr()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





