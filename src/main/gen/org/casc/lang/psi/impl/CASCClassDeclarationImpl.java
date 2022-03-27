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

public class CASCClassDeclarationImpl extends ASTWrapperPsiElement implements CASCClassDeclaration {

  public CASCClassDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitClassDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCAccessModifiers getAccessModifiers() {
    return findChildByClass(CASCAccessModifiers.class);
  }

  @Override
  @NotNull
  public List<CASCClassFields> getClassFieldsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CASCClassFields.class);
  }

  @Override
  @Nullable
  public CASCMutableModifier getMutableModifier() {
    return findChildByClass(CASCMutableModifier.class);
  }

}
