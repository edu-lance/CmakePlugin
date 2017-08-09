// This is a generated file. Not intended for manual editing.
package com.liuxiang.cmake.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.liuxiang.cmake.psi.CmakeTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CmakeParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == METHOD) {
      r = method(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cmakeFile(b, l + 1);
  }

  /* ********************************************************** */
  // (method|COMMENT)*
  static boolean cmakeFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmakeFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!cmakeFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cmakeFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // method|COMMENT
  private static boolean cmakeFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmakeFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEY
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    exit_section_(b, m, METHOD, r);
    return r;
  }

}
