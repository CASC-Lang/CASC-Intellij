// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCStatement extends PsiElement {

  @Nullable
  CASCBlockStatement getBlockStatement();

  @Nullable
  CASCExpression getExpression();

  @Nullable
  CASCIfStatement getIfStatement();

  @Nullable
  CASCJForStatement getJForStatement();

  @Nullable
  CASCReturnStatement getReturnStatement();

  @Nullable
  CASCVariableDeclaration getVariableDeclaration();

}
