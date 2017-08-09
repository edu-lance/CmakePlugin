// This is a generated file. Not intended for manual editing.
package com.liuxiang.cmake.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.liuxiang.cmake.psi.CmakeTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.liuxiang.cmake.psi.*;

public class CmakeMethodImpl extends ASTWrapperPsiElement implements CmakeMethod {

  public CmakeMethodImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CmakeVisitor visitor) {
    visitor.visitMethod(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CmakeVisitor) accept((CmakeVisitor)visitor);
    else super.accept(visitor);
  }

}
