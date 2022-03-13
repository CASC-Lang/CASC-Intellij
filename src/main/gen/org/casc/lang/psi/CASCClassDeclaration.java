// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCClassDeclaration extends PsiElement {

  @Nullable
  CASCAccessModifiers getAccessModifiers();

  @NotNull
  List<CASCClassFields> getClassFieldsList();

  @Nullable
  CASCMutableModifier getMutableModifier();

  @NotNull
  PsiElement getIdentifier();

}
