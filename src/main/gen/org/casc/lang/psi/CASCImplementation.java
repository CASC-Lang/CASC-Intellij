// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCImplementation extends PsiElement {

  @Nullable
  CASCCompanionBlock getCompanionBlock();

  @NotNull
  List<CASCConstructorDeclaration> getConstructorDeclarationList();

  @NotNull
  List<CASCFunctionDeclaration> getFunctionDeclarationList();

  @Nullable
  CASCType getType();

}
