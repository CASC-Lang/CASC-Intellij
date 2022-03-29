// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCIfExpression extends PsiElement {

  @NotNull
  CASCExpression getExpression();

  @NotNull
  List<CASCStatement> getStatementList();

}
