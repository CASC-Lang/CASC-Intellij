// This is a generated file. Not intended for manual editing.
package org.casc.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.casc.lang.psi.CASCTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CASCParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cascFile(b, l + 1);
  }

  /* ********************************************************** */
  // PUB | PROT | INTL | PRIV
  public static boolean accessModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessModifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACCESS_MODIFIERS, "<access modifiers>");
    r = consumeToken(b, PUB);
    if (!r) r = consumeToken(b, PROT);
    if (!r) r = consumeToken(b, INTL);
    if (!r) r = consumeToken(b, PRIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (classDeclaration )? implementation*
  static boolean cascFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cascFile_0(b, l + 1);
    r = r && cascFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (classDeclaration )?
  private static boolean cascFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_0")) return false;
    cascFile_0_0(b, l + 1);
    return true;
  }

  // (classDeclaration )
  private static boolean cascFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // implementation*
  private static boolean cascFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!implementation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cascFile_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // accessModifiers? mutableModifier? CLASS IDENTIFIER (OPEN_BRACE classFields+ CLOSE_BRACE)?
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_DECLARATION, "<class declaration>");
    r = classDeclaration_0(b, l + 1);
    r = r && classDeclaration_1(b, l + 1);
    r = r && consumeTokens(b, 0, CLASS, IDENTIFIER);
    r = r && classDeclaration_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessModifiers?
  private static boolean classDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_0")) return false;
    accessModifiers(b, l + 1);
    return true;
  }

  // mutableModifier?
  private static boolean classDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_1")) return false;
    mutableModifier(b, l + 1);
    return true;
  }

  // (OPEN_BRACE classFields+ CLOSE_BRACE)?
  private static boolean classDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4")) return false;
    classDeclaration_4_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE classFields+ CLOSE_BRACE
  private static boolean classDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && classDeclaration_4_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // classFields+
  private static boolean classDeclaration_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classFields(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!classFields(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_4_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (COMP OPEN_BRACE classFields CLOSE_BRACE) | (accessModifiers? mutableModifier? COLON field+)
  public static boolean classFields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_FIELDS, "<class fields>");
    r = classFields_0(b, l + 1);
    if (!r) r = classFields_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMP OPEN_BRACE classFields CLOSE_BRACE
  private static boolean classFields_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMP, OPEN_BRACE);
    r = r && classFields(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // accessModifiers? mutableModifier? COLON field+
  private static boolean classFields_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classFields_1_0(b, l + 1);
    r = r && classFields_1_1(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && classFields_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // accessModifiers?
  private static boolean classFields_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields_1_0")) return false;
    accessModifiers(b, l + 1);
    return true;
  }

  // mutableModifier?
  private static boolean classFields_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields_1_1")) return false;
    mutableModifier(b, l + 1);
    return true;
  }

  // field+
  private static boolean classFields_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classFields_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classFields_1_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (OPEN_BRACKET CLOSE_BRACKET)*
  public static boolean complexType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && complexType_1(b, l + 1);
    exit_section_(b, m, COMPLEX_TYPE, r);
    return r;
  }

  // (OPEN_BRACKET CLOSE_BRACKET)*
  private static boolean complexType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!complexType_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "complexType_1", c)) break;
    }
    return true;
  }

  // OPEN_BRACKET CLOSE_BRACKET
  private static boolean complexType_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON complexType
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && complexType(b, l + 1);
    exit_section_(b, m, FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // IMPL IDENTIFIER (OPEN_BRACE CLOSE_BRACE)?
  public static boolean implementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation")) return false;
    if (!nextTokenIs(b, IMPL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPL, IDENTIFIER);
    r = r && implementation_2(b, l + 1);
    exit_section_(b, m, IMPLEMENTATION, r);
    return r;
  }

  // (OPEN_BRACE CLOSE_BRACE)?
  private static boolean implementation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_2")) return false;
    implementation_2_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE CLOSE_BRACE
  private static boolean implementation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACE, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MUT
  public static boolean mutableModifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mutableModifier")) return false;
    if (!nextTokenIs(b, MUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUT);
    exit_section_(b, m, MUTABLE_MODIFIER, r);
    return r;
  }

}
