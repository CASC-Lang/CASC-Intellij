// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCPostfixUnarySuffix extends PsiElement {

  @Nullable
  CASCAssignSuffix getAssignSuffix();

  @Nullable
  CASCCallSuffix getCallSuffix();

  @Nullable
  CASCIndexSuffix getIndexSuffix();

  @Nullable
  CASCMemberSuffix getMemberSuffix();

}
