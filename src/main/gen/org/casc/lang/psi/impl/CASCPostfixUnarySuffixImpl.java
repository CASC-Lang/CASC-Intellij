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

public class CASCPostfixUnarySuffixImpl extends ASTWrapperPsiElement implements CASCPostfixUnarySuffix {

  public CASCPostfixUnarySuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CASCVisitor visitor) {
    visitor.visitPostfixUnarySuffix(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CASCVisitor) accept((CASCVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CASCAssignSuffix getAssignSuffix() {
    return findChildByClass(CASCAssignSuffix.class);
  }

  @Override
  @Nullable
  public CASCCallSuffix getCallSuffix() {
    return findChildByClass(CASCCallSuffix.class);
  }

  @Override
  @Nullable
  public CASCIndexSuffix getIndexSuffix() {
    return findChildByClass(CASCIndexSuffix.class);
  }

  @Override
  @Nullable
  public CASCMemberSuffix getMemberSuffix() {
    return findChildByClass(CASCMemberSuffix.class);
  }

}
