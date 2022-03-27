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
  // type COLON (OPEN_BRACKET expression CLOSE_BRACKET)+ OPEN_BRACE CLOSE_BRACE
  public static boolean arrayDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && arrayDeclaration_2(b, l + 1);
    r = r && consumeTokens(b, 0, OPEN_BRACE, CLOSE_BRACE);
    exit_section_(b, m, ARRAY_DECLARATION, r);
    return r;
  }

  // (OPEN_BRACKET expression CLOSE_BRACKET)+
  private static boolean arrayDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayDeclaration_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!arrayDeclaration_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayDeclaration_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET expression CLOSE_BRACKET
  private static boolean arrayDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((type COLON (OPEN_BRACKET CLOSE_BRACKET)+) | COLON) OPEN_BRACE (expression (COMMA expression)*)? CLOSE_BRACE
  public static boolean arrayInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization")) return false;
    if (!nextTokenIs(b, "<array initialization>", COLON, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_INITIALIZATION, "<array initialization>");
    r = arrayInitialization_0(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && arrayInitialization_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (type COLON (OPEN_BRACKET CLOSE_BRACKET)+) | COLON
  private static boolean arrayInitialization_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayInitialization_0_0(b, l + 1);
    if (!r) r = consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // type COLON (OPEN_BRACKET CLOSE_BRACKET)+
  private static boolean arrayInitialization_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && arrayInitialization_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_BRACKET CLOSE_BRACKET)+
  private static boolean arrayInitialization_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arrayInitialization_0_0_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!arrayInitialization_0_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitialization_0_0_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET CLOSE_BRACKET
  private static boolean arrayInitialization_0_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_0_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expression (COMMA expression)*)?
  private static boolean arrayInitialization_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_2")) return false;
    arrayInitialization_2_0(b, l + 1);
    return true;
  }

  // expression (COMMA expression)*
  private static boolean arrayInitialization_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && arrayInitialization_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean arrayInitialization_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayInitialization_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitialization_2_0_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean arrayInitialization_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitialization_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // packageDeclaration? usage* classDeclaration? implementation*
  static boolean cascFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cascFile_0(b, l + 1);
    r = r && cascFile_1(b, l + 1);
    r = r && cascFile_2(b, l + 1);
    r = r && cascFile_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // packageDeclaration?
  private static boolean cascFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_0")) return false;
    packageDeclaration(b, l + 1);
    return true;
  }

  // usage*
  private static boolean cascFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!usage(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cascFile_1", c)) break;
    }
    return true;
  }

  // classDeclaration?
  private static boolean cascFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_2")) return false;
    classDeclaration(b, l + 1);
    return true;
  }

  // implementation*
  private static boolean cascFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cascFile_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!implementation(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cascFile_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // accessModifiers? mutableModifier? CLASS IDENTIFIER (OPEN_BRACE classFields* CLOSE_BRACE)?
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

  // (OPEN_BRACE classFields* CLOSE_BRACE)?
  private static boolean classDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4")) return false;
    classDeclaration_4_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE classFields* CLOSE_BRACE
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

  // classFields*
  private static boolean classDeclaration_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!classFields(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "classDeclaration_4_0_1", c)) break;
    }
    return true;
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
  // COMP OPEN_BRACE statement* CLOSE_BRACE
  public static boolean companionBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "companionBlock")) return false;
    if (!nextTokenIs(b, COMP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMP, OPEN_BRACE);
    r = r && companionBlock_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, COMPANION_BLOCK, r);
    return r;
  }

  // statement*
  private static boolean companionBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "companionBlock_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "companionBlock_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type (OPEN_BRACKET CLOSE_BRACKET)*
  public static boolean complexType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
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
  // NEW OPEN_PARENTHESES parameterList CLOSE_PARENTHESES (COLON (SELF | SUPER) OPEN_PARENTHESES parameterList CLOSE_PARENTHESES)? OPEN_BRACE statement* CLOSE_BRACE
  public static boolean constructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEW, OPEN_PARENTHESES);
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    r = r && constructorDeclaration_4(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && constructorDeclaration_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, CONSTRUCTOR_DECLARATION, r);
    return r;
  }

  // (COLON (SELF | SUPER) OPEN_PARENTHESES parameterList CLOSE_PARENTHESES)?
  private static boolean constructorDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_4")) return false;
    constructorDeclaration_4_0(b, l + 1);
    return true;
  }

  // COLON (SELF | SUPER) OPEN_PARENTHESES parameterList CLOSE_PARENTHESES
  private static boolean constructorDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && constructorDeclaration_4_0_1(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENTHESES);
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELF | SUPER
  private static boolean constructorDeclaration_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_4_0_1")) return false;
    boolean r;
    r = consumeToken(b, SELF);
    if (!r) r = consumeToken(b, SUPER);
    return r;
  }

  // statement*
  private static boolean constructorDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constructorDeclaration_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // literalValue
  //                         | arrayInitialization
  //                         | arrayDeclaration
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = literalValue(b, l + 1);
    if (!r) r = arrayInitialization(b, l + 1);
    if (!r) r = arrayDeclaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // FN IDENTIFIER OPEN_PARENTHESES (SELF COMMA)? parameterList CLOSE_PARENTHESES (COLON complexType)? OPEN_BRACE statement* CLOSE_BRACE
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    if (!nextTokenIs(b, FN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, IDENTIFIER, OPEN_PARENTHESES);
    r = r && functionDeclaration_3(b, l + 1);
    r = r && parameterList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    r = r && functionDeclaration_6(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && functionDeclaration_8(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, FUNCTION_DECLARATION, r);
    return r;
  }

  // (SELF COMMA)?
  private static boolean functionDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3")) return false;
    functionDeclaration_3_0(b, l + 1);
    return true;
  }

  // SELF COMMA
  private static boolean functionDeclaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SELF, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON complexType)?
  private static boolean functionDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6")) return false;
    functionDeclaration_6_0(b, l + 1);
    return true;
  }

  // COLON complexType
  private static boolean functionDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && complexType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean functionDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_8", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IMPL IDENTIFIER (COLON type)? (OPEN_BRACE companionBlock? (functionDeclaration | constructorDeclaration)* CLOSE_BRACE)?
  public static boolean implementation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation")) return false;
    if (!nextTokenIs(b, IMPL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPL, IDENTIFIER);
    r = r && implementation_2(b, l + 1);
    r = r && implementation_3(b, l + 1);
    exit_section_(b, m, IMPLEMENTATION, r);
    return r;
  }

  // (COLON type)?
  private static boolean implementation_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_2")) return false;
    implementation_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean implementation_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_BRACE companionBlock? (functionDeclaration | constructorDeclaration)* CLOSE_BRACE)?
  private static boolean implementation_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_3")) return false;
    implementation_3_0(b, l + 1);
    return true;
  }

  // OPEN_BRACE companionBlock? (functionDeclaration | constructorDeclaration)* CLOSE_BRACE
  private static boolean implementation_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && implementation_3_0_1(b, l + 1);
    r = r && implementation_3_0_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // companionBlock?
  private static boolean implementation_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_3_0_1")) return false;
    companionBlock(b, l + 1);
    return true;
  }

  // (functionDeclaration | constructorDeclaration)*
  private static boolean implementation_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!implementation_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "implementation_3_0_2", c)) break;
    }
    return true;
  }

  // functionDeclaration | constructorDeclaration
  private static boolean implementation_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implementation_3_0_2_0")) return false;
    boolean r;
    r = functionDeclaration(b, l + 1);
    if (!r) r = constructorDeclaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NULL 
  //                         | TRUE 
  //                         | FALSE 
  //                         | (DOUBLE_QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* DOUBLE_QUOTE) 
  //                         | (QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* QUOTE) 
  //                         | INTEGER_LITERAL 
  //                         | FLOAT_LITERAL
  public static boolean literalValue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_VALUE, "<literal value>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = literalValue_3(b, l + 1);
    if (!r) r = literalValue_4(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DOUBLE_QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* DOUBLE_QUOTE
  private static boolean literalValue_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTE);
    r = r && literalValue_3_1(b, l + 1);
    r = r && consumeToken(b, DOUBLE_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING_CHAR | ESCAPED_STRING_CHAR)*
  private static boolean literalValue_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literalValue_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalValue_3_1", c)) break;
    }
    return true;
  }

  // STRING_CHAR | ESCAPED_STRING_CHAR
  private static boolean literalValue_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_3_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CHAR);
    if (!r) r = consumeToken(b, ESCAPED_STRING_CHAR);
    return r;
  }

  // QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* QUOTE
  private static boolean literalValue_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE);
    r = r && literalValue_4_1(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING_CHAR | ESCAPED_STRING_CHAR)*
  private static boolean literalValue_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literalValue_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalValue_4_1", c)) break;
    }
    return true;
  }

  // STRING_CHAR | ESCAPED_STRING_CHAR
  private static boolean literalValue_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalValue_4_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CHAR);
    if (!r) r = consumeToken(b, ESCAPED_STRING_CHAR);
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

  /* ********************************************************** */
  // PACKAGE type
  public static boolean packageDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageDeclaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && type(b, l + 1);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON complexType (COMMA IDENTIFIER COLON complexType)*
  public static boolean parameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && complexType(b, l + 1);
    r = r && parameterList_3(b, l + 1);
    exit_section_(b, m, PARAMETER_LIST, r);
    return r;
  }

  // (COMMA IDENTIFIER COLON complexType)*
  private static boolean parameterList_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameterList_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameterList_3", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER COLON complexType
  private static boolean parameterList_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterList_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER, COLON);
    r = r && complexType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableDeclaration | expression
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variableDeclaration(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOUBLE_COLON IDENTIFIER)*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && type_1(b, l + 1);
    exit_section_(b, m, TYPE, r);
    return r;
  }

  // (DOUBLE_COLON IDENTIFIER)*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_1", c)) break;
    }
    return true;
  }

  // DOUBLE_COLON IDENTIFIER
  private static boolean type_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOUBLE_COLON, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE type (AS IDENTIFIER) | (DOUBLE_COLON OPEN_BRACE usage (COMMA usage)+ CLOSE_BRACE)
  public static boolean usage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage")) return false;
    if (!nextTokenIs(b, "<usage>", DOUBLE_COLON, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USAGE, "<usage>");
    r = usage_0(b, l + 1);
    if (!r) r = usage_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // USE type (AS IDENTIFIER)
  private static boolean usage_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && type(b, l + 1);
    r = r && usage_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AS IDENTIFIER
  private static boolean usage_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOUBLE_COLON OPEN_BRACE usage (COMMA usage)+ CLOSE_BRACE
  private static boolean usage_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOUBLE_COLON, OPEN_BRACE);
    r = r && usage(b, l + 1);
    r = r && usage_1_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA usage)+
  private static boolean usage_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = usage_1_3_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!usage_1_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "usage_1_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA usage
  private static boolean usage_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "usage_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && usage(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON_EQUAL expression
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON_EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATION, r);
    return r;
  }

}
