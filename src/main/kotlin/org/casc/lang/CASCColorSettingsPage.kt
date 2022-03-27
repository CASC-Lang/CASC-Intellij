package org.casc.lang

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class CASCColorSettingsPage: ColorSettingsPage {
    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Type", CASCSyntaxHighlighter.TYPE),
            AttributesDescriptor("Comment", CASCSyntaxHighlighter.COMMENT),
            AttributesDescriptor("Bad character", CASCSyntaxHighlighter.BAD_CHARACTER)
        )
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> =
        DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> =
        ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String =
        "CASC"

    override fun getIcon(): Icon =
        CASCIcons.CLASS_FILE_ICON

    override fun getHighlighter(): SyntaxHighlighter =
        CASCSyntaxHighlighter()

    override fun getDemoText(): String =
        """
            pub mut class Main {
                priv mut:
                    count: i32
            }
            
            impl Main {
            
            }
        """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? =
        null
}