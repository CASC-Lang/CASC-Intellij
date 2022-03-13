// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCClassFields extends PsiElement {

  @Nullable
  CASCAccessModifiers getAccessModifiers();

  @Nullable
  CASCClassFields getClassFields();

  @NotNull
  List<CASCField> getFieldList();

  @Nullable
  CASCMutableModifier getMutableModifier();

}
