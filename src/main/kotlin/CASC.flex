package org.casc.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import static org.casc.lang.psi.CASCTypes.*;

%%

%public
%class CASCLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

LineTerminator      = \r|\n|\r\n
InputCharacter      = [^\r\n]

Comment             = {EndOfLineComment}
EndOfLineComment    = "//" {InputCharacter}* {LineTerminator}?

IDENTIFIER          = [a-zA-Z_][a-zA-Z0-9_]*
WHITE_SPACE         = [ \t\n\x0B\f\r]+

%%
<YYINITIAL> {
    // Keywords
    "class"                 { return CLASS; }
    "comp"                  { return COMP; }
    "mut"                   { return MUT; }
    "pub"                   { return PUB; }
    "prot"                  { return PROT; }
    "intl"                  { return INTL; }
    "priv"                  { return PRIV; }
    "impl"                  { return IMPL; }

    // Symbols
    "{"                     { return OPEN_BRACE; }
    "}"                     { return CLOSE_BRACE; }
    "["                     { return OPEN_BRACKET; }
    "]"                     { return CLOSE_BRACKET; }
    ":"                     { return COLON; }

    {IDENTIFIER}            { return IDENTIFIER; }
    {WHITE_SPACE}           { return TokenType.WHITE_SPACE; }
    {Comment}               { return COMMENT; }
}

[^] { return TokenType.BAD_CHARACTER; }