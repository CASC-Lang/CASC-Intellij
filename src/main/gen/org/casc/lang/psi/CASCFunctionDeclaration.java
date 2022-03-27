// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCFunctionDeclaration extends PsiElement {

  @Nullable
  CASCComplexType getComplexType();

  @NotNull
  CASCParameterList getParameterList();

  @NotNull
  List<CASCStatement> getStatementList();

}
