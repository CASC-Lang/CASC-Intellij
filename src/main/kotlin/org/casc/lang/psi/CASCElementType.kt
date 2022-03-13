package org.casc.lang.psi

import com.intellij.psi.tree.IElementType
import org.casc.lang.CASCLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class CASCElementType(@NotNull @NonNls debugName: String): IElementType(debugName, CASCLanguage)