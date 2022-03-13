package org.casc.lang

import com.intellij.lexer.FlexAdapter
import org.casc.lang.lexer.CASCLexer

class CASCLexerAdapter : FlexAdapter(CASCLexer(null)) {
}