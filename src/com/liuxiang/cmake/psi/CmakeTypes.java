// This is a generated file. Not intended for manual editing.
package com.liuxiang.cmake.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.liuxiang.cmake.psi.impl.*;

public interface CmakeTypes {

  IElementType METHOD = new CmakeElementType("METHOD");

  IElementType COMMENT = new CmakeTokenType("COMMENT");
  IElementType KEY = new CmakeTokenType("KEY");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == METHOD) {
        return new CmakeMethodImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
