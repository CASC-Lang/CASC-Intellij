package org.casc.lang

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.casc.lang.psi.CASCTypes


class CASCSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val KEYWORD =
            createTextAttributesKey("CASC_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENT =
            createTextAttributesKey("CASC_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val IDENTIFIER =
            createTextAttributesKey("CASC_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val BAD_CHARACTER =
            createTextAttributesKey("CASC_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)


        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val COMMENT_KEYS = arrayOf(COMMENT)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }

    override fun getHighlightingLexer(): Lexer =
        CASCLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> = when (tokenType) {
        null -> EMPTY_KEYS
        CASCTypes.PUB, CASCTypes.PROT, CASCTypes.INTL, CASCTypes.PRIV, CASCTypes.MUT, CASCTypes.CLASS, CASCTypes.IMPL -> KEYWORD_KEYS
        CASCTypes.IDENTIFIER -> IDENTIFIER_KEYS
        CASCTypes.COMMENT -> COMMENT_KEYS
        TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
        else -> EMPTY_KEYS
    }
}