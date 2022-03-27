// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCExpression extends PsiElement {

  @Nullable
  CASCArrayDeclaration getArrayDeclaration();

  @Nullable
  CASCArrayInitialization getArrayInitialization();

  @Nullable
  CASCConstructorCall getConstructorCall();

  @Nullable
  CASCLiteralExpression getLiteralExpression();

  @Nullable
  CASCMemberExpression getMemberExpression();

}
