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

public class CASCArrayInitializationImpl extends ASTWrapperPsiElement implements CASCArrayInitialization {

  public CASCArrayInitializationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitArrayInitialization(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CASCExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CASCExpression.class);
  }

  @Override
  @Nullable
  public CASCType getType() {
    return findChildByClass(CASCType.class);
  }

}
