// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CASCUsage extends PsiElement {

  @Nullable
  CASCType getType();

  @NotNull
  List<CASCUsage> getUsageList();

}
