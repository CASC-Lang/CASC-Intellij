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

public class CASCPrimaryExpressionImpl extends ASTWrapperPsiElement implements CASCPrimaryExpression {

  public CASCPrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCArrayExpression getArrayExpression() {
    return findChildByClass(CASCArrayExpression.class);
  }

  @Override
  @Nullable
  public CASCConstructorCallExpression getConstructorCallExpression() {
    return findChildByClass(CASCConstructorCallExpression.class);
  }

  @Override
  @Nullable
  public CASCIdentifierExpression getIdentifierExpression() {
    return findChildByClass(CASCIdentifierExpression.class);
  }

  @Override
  @Nullable
  public CASCIfExpression getIfExpression() {
    return findChildByClass(CASCIfExpression.class);
  }

  @Override
  @Nullable
  public CASCLiteralExpression getLiteralExpression() {
    return findChildByClass(CASCLiteralExpression.class);
  }

  @Override
  @Nullable
  public CASCParenthesizedExpression getParenthesizedExpression() {
    return findChildByClass(CASCParenthesizedExpression.class);
  }

  @Override
  @Nullable
  public CASCSelfExpression getSelfExpression() {
    return findChildByClass(CASCSelfExpression.class);
  }

  @Override
  @Nullable
  public CASCSuperExpression getSuperExpression() {
    return findChildByClass(CASCSuperExpression.class);
  }

}
