// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCPrefixUnaryExpression extends PsiElement {

  @NotNull
  CASCPostfixUnaryExpression getPostfixUnaryExpression();

  @NotNull
  List<CASCUnaryOperators> getUnaryOperatorsList();

}
