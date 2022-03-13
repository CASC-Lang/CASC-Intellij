package org.casc.lang.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.casc.lang.CASCLanguage
import org.casc.lang.filetypes.CASCFileType
import org.jetbrains.annotations.NotNull

class CASCFile(@NotNull viewProvider: FileViewProvider): PsiFileBase(viewProvider, CASCLanguage) {
    override fun getFileType(): FileType =
        CASCFileType

    override fun toString(): String =
        "CASC File"
}