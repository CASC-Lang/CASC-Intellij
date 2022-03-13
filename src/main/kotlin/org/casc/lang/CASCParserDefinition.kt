package org.casc.lang

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.casc.lang.parser.CASCParser
import org.casc.lang.psi.CASCFile
import org.casc.lang.psi.CASCTypes

class CASCParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(CASCTypes.COMMENT)

        val FILE = IFileElementType(CASCLanguage)
    }

    override fun createLexer(project: Project?): Lexer =
        CASCLexerAdapter()

    override fun createParser(project: Project?): PsiParser =
        CASCParser()

    override fun getFileNodeType(): IFileElementType =
        FILE

    override fun getWhitespaceTokens(): TokenSet =
        WHITE_SPACES

    override fun getCommentTokens(): TokenSet =
        COMMENTS

    override fun getStringLiteralElements(): TokenSet =
        TokenSet.EMPTY

    override fun createElement(node: ASTNode?): PsiElement =
        CASCTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        CASCFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY
}