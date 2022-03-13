package org.casc.lang.filetypes

import com.intellij.openapi.fileTypes.LanguageFileType
import org.casc.lang.CASCIcons
import org.casc.lang.CASCLanguage
import javax.swing.Icon

object CASCFileType: LanguageFileType(CASCLanguage) {
    override fun getName(): String =
        "CASC Class File"

    override fun getDescription(): String =
        "CASC Lang source file"

    override fun getDefaultExtension(): String =
        "casc"

    override fun getIcon(): Icon =
        CASCIcons.CLASS_FILE_ICON
}