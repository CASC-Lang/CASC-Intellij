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

public class CASCImplementationImpl extends ASTWrapperPsiElement implements CASCImplementation {

  public CASCImplementationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitImplementation(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCCompanionBlock getCompanionBlock() {
    return findChildByClass(CASCCompanionBlock.class);
  }

  @Override
  @NotNull
  public List<CASCConstructorDeclaration> getConstructorDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CASCConstructorDeclaration.class);
  }

  @Override
  @NotNull
  public List<CASCFunctionDeclaration> getFunctionDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CASCFunctionDeclaration.class);
  }

  @Override
  @Nullable
  public CASCType getType() {
    return findChildByClass(CASCType.class);
  }

}
