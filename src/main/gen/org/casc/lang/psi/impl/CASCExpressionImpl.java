// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.casc.lang.psi.CASCTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.casc.lang.psi.*;

public class CASCExpressionImpl extends ASTWrapperPsiElement implements CASCExpression {

  public CASCExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCArrayDeclaration getArrayDeclaration() {
    return findChildByClass(CASCArrayDeclaration.class);
  }

  @Override
  @Nullable
  public CASCArrayInitialization getArrayInitialization() {
    return findChildByClass(CASCArrayInitialization.class);
  }

  @Override
  @Nullable
  public CASCConstructorCall getConstructorCall() {
    return findChildByClass(CASCConstructorCall.class);
  }

  @Override
  @Nullable
  public CASCLiteralExpression getLiteralExpression() {
    return findChildByClass(CASCLiteralExpression.class);
  }

  @Override
  @Nullable
  public CASCMemberExpression getMemberExpression() {
    return findChildByClass(CASCMemberExpression.class);
  }

}
