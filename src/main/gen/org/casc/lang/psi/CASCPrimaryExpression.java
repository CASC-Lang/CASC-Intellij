// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCPrimaryExpression extends PsiElement {

  @Nullable
  CASCArrayExpression getArrayExpression();

  @Nullable
  CASCConstructorCallExpression getConstructorCallExpression();

  @Nullable
  CASCIdentifierExpression getIdentifierExpression();

  @Nullable
  CASCIfExpression getIfExpression();

  @Nullable
  CASCLiteralExpression getLiteralExpression();

  @Nullable
  CASCParenthesizedExpression getParenthesizedExpression();

  @Nullable
  CASCSelfExpression getSelfExpression();

  @Nullable
  CASCSuperExpression getSuperExpression();

}
