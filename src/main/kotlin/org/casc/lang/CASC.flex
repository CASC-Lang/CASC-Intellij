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

COMMENT             = "//" {InputCharacter}* {LineTerminator}?
IDENTIFIER          = [a-zA-Z_][a-zA-Z0-9_]*
DIGIT               = [0-9]*
WHITE_SPACE         = [ \t\n\x0B\f\r]+

INTEGER_LITERAL     = {DIGIT}("B" | "S" | "I" | "L")?
FLOAT_LITERAL       = {DIGIT}"."{DIGIT}("F" | "D")?

%s STRING

%%
<YYINITIAL> {
    // Keywords
    "package"               { return PACKAGE; }
    "use"                   { return USE; }
    "class"                 { return CLASS; }
    "comp"                  { return COMP; }
    "mut"                   { return MUT; }
    "pub"                   { return PUB; }
    "prot"                  { return PROT; }
    "intl"                  { return INTL; }
    "priv"                  { return PRIV; }
    "impl"                  { return IMPL; }
    "fn"                    { return FN; }
    "new"                   { return NEW; }
    "super"                 { return SUPER; }
    "true"                  { return TRUE; }
    "false"                 { return FALSE; }
    "null"                  { return NULL; }
    "self"                  { return SELF; }
    "as"                    { return AS; }
    "ovrd"                  { return OVRD; }
    "for"                   { return FOR; }
    "if"                    { return IF; }
    "else"                  { return ELSE; }
    "return"                { return RETURN; }

    // Symbols
    "{"                     { return OPEN_BRACE; }
    "}"                     { return CLOSE_BRACE; }
    "["                     { return OPEN_BRACKET; }
    "]"                     { return CLOSE_BRACKET; }
    "("                     { return OPEN_PARENTHESES; }
    ")"                     { return CLOSE_PARENTHESES; }
    ":"                     { return COLON; }
    ";"                     { return SEMICOLON; }
    ":="                    { return COLON_EQUAL; }
    "::"                    { return DOUBLE_COLON; }
    ","                     { return COMMA; }
    "."                     { return DOT; }
    "+"                     { return PLUS; }
    "++"                    { return DOUBLE_PLUS; }
    "-"                     { return MINUS; }
    "--"                    { return DOUBLE_MINUS; }
    "~"                     { return TILDE; }
    "!"                     { return BANG; }
    "="                     { return EQUAL; }
    "=="                    { return EQUAL_EQUAL; }
    "!="                    { return BANG_EQUAL; }
    "*"                     { return STAR; }
    "/"                     { return SLASH; }
    "%"                     { return PERCENTAGE; }
    ">"                     { return GREATER; }
    ">>"                    { return DOUBLE_GREATER; }
    ">="                    { return GREATER_EQUAL; }
    ">>>"                   { return TRIPLE_GREATER; }
    "<"                     { return LESSER; }
    "<<"                    { return DOUBLE_LESSER; }
    "<="                    { return LESSER_EQUAL; }
    "&"                     { return AMPERSAND; }
    "&&"                    { return DOUBLE_AMPERSAND; }
    "^"                     { return HAT; }
    "|"                     { return PIPE; }
    "||"                    { return DOUBLE_PIPE; }

    "\""                    { yybegin(STRING); return DOUBLE_QUOTE; }
    "\'"                    { yybegin(STRING); return QUOTE; }

    {LineTerminator}        { return TokenType.WHITE_SPACE; }
    {IDENTIFIER}            { return IDENTIFIER; }
    {WHITE_SPACE}           { return TokenType.WHITE_SPACE; }
    {INTEGER_LITERAL}       { return INTEGER_LITERAL; }
    {FLOAT_LITERAL}         { return FLOAT_LITERAL; }
    {COMMENT}               { return COMMENT; }
}

<STRING> {
    "\""                    { yybegin(YYINITIAL); return DOUBLE_QUOTE; }
    "\'"                    { yybegin(YYINITIAL); return QUOTE; }
    "\\\\"                  { return ESCAPED_STRING_CHAR; }
    "\\t"                   { return ESCAPED_STRING_CHAR; }
    "\\b"                   { return ESCAPED_STRING_CHAR; }
    "\\n"                   { return ESCAPED_STRING_CHAR; }
    "\\r"                   { return ESCAPED_STRING_CHAR; }
    "\\f"                   { return ESCAPED_STRING_CHAR; }
    "\\\'"                  { return ESCAPED_STRING_CHAR; }
    "\\\""                  { return ESCAPED_STRING_CHAR; }
    \\u[0-9A-Fa-f]{4}       { return ESCAPED_STRING_CHAR; }
    [^]                     { return STRING_CHAR; }
}

[^] { return TokenType.BAD_CHARACTER; }