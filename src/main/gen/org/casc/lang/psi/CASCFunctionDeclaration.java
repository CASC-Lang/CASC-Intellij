// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCFunctionDeclaration extends PsiElement {

  @Nullable
  CASCAccessModifiers getAccessModifiers();

  @Nullable
  CASCComplexType getComplexType();

  @Nullable
  CASCMutableModifier getMutableModifier();

  @Nullable
  CASCParameterList getParameterList();

  @NotNull
  List<CASCStatement> getStatementList();

}
