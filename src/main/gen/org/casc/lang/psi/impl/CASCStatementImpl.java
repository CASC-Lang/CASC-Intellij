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

public class CASCStatementImpl extends ASTWrapperPsiElement implements CASCStatement {

  public CASCStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCBlockStatement getBlockStatement() {
    return findChildByClass(CASCBlockStatement.class);
  }

  @Override
  @Nullable
  public CASCExpression getExpression() {
    return findChildByClass(CASCExpression.class);
  }

  @Override
  @Nullable
  public CASCIfStatement getIfStatement() {
    return findChildByClass(CASCIfStatement.class);
  }

  @Override
  @Nullable
  public CASCJForStatement getJForStatement() {
    return findChildByClass(CASCJForStatement.class);
  }

  @Override
  @Nullable
  public CASCReturnStatement getReturnStatement() {
    return findChildByClass(CASCReturnStatement.class);
  }

  @Override
  @Nullable
  public CASCVariableDeclaration getVariableDeclaration() {
    return findChildByClass(CASCVariableDeclaration.class);
  }

}
