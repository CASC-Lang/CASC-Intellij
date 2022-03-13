package org.casc.lang.psi

import com.intellij.psi.tree.IElementType
import org.casc.lang.CASCLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class CASCTokenType(@NotNull @NonNls debugName: String): IElementType(debugName, CASCLanguage) {
    override fun toString(): String =
        "CASCTokenType${super.toString()}"
}