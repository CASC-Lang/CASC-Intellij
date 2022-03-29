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
  // shiftingExpression (AMPERSAND shiftingExpression)*
  public static boolean ANDExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANDExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXPRESSION, "<and expression>");
    r = shiftingExpression(b, l + 1);
    r = r && ANDExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AMPERSAND shiftingExpression)*
  private static boolean ANDExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANDExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ANDExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ANDExpression_1", c)) break;
    }
    return true;
  }

  // AMPERSAND shiftingExpression
  private static boolean ANDExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ANDExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AMPERSAND);
    r = r && shiftingExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
  public static boolean additiveExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = multiplicativeExpression(b, l + 1);
    r = r && additiveExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((PLUS | MINUS) multiplicativeExpression)*
  private static boolean additiveExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additiveExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additiveExpression_1", c)) break;
    }
    return true;
  }

  // (PLUS | MINUS) multiplicativeExpression
  private static boolean additiveExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additiveExpression_1_0_0(b, l + 1);
    r = r && multiplicativeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean additiveExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additiveExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  /* ********************************************************** */
  // (expression (COMMA expression)*)?
  public static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_LIST, "<argument list>");
    argumentList_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // expression (COMMA expression)*
  private static boolean argumentList_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && argumentList_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA expression)*
  private static boolean argumentList_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argumentList_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_0_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean argumentList_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arraySizeDeclaration OPEN_BRACE argumentList CLOSE_BRACE
  public static boolean arrayExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arraySizeDeclaration(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, ARRAY_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACKET (type | arraySizeDeclaration)? SEMICOLON expression? CLOSE_BRACKET
  public static boolean arraySizeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySizeDeclaration")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && arraySizeDeclaration_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && arraySizeDeclaration_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, ARRAY_SIZE_DECLARATION, r);
    return r;
  }

  // (type | arraySizeDeclaration)?
  private static boolean arraySizeDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySizeDeclaration_1")) return false;
    arraySizeDeclaration_1_0(b, l + 1);
    return true;
  }

  // type | arraySizeDeclaration
  private static boolean arraySizeDeclaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySizeDeclaration_1_0")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = arraySizeDeclaration(b, l + 1);
    return r;
  }

  // expression?
  private static boolean arraySizeDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arraySizeDeclaration_3")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // prefixUnaryExpression (AS prefixUnaryExpression)*
  public static boolean asExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AS_EXPRESSION, "<as expression>");
    r = prefixUnaryExpression(b, l + 1);
    r = r && asExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (AS prefixUnaryExpression)*
  private static boolean asExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!asExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asExpression_1", c)) break;
    }
    return true;
  }

  // AS prefixUnaryExpression
  private static boolean asExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && prefixUnaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUAL expression
  public static boolean assignSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignSuffix")) return false;
    if (!nextTokenIs(b, EQUAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, m, ASSIGN_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACE statement* CLOSE_BRACE
  public static boolean blockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && blockStatement_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // statement*
  private static boolean blockStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockStatement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_PARENTHESES argumentList CLOSE_PARENTHESES
  public static boolean callSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callSuffix")) return false;
    if (!nextTokenIs(b, OPEN_PARENTHESES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENTHESES);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    exit_section_(b, m, CALL_SUFFIX, r);
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
  // infixOperationExpression ((GREATER | GREATER_EQUAL | LESSER | LESSER_EQUAL) infixOperationExpression)*
  public static boolean comparisonExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_EXPRESSION, "<comparison expression>");
    r = infixOperationExpression(b, l + 1);
    r = r && comparisonExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((GREATER | GREATER_EQUAL | LESSER | LESSER_EQUAL) infixOperationExpression)*
  private static boolean comparisonExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparisonExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparisonExpression_1", c)) break;
    }
    return true;
  }

  // (GREATER | GREATER_EQUAL | LESSER | LESSER_EQUAL) infixOperationExpression
  private static boolean comparisonExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonExpression_1_0_0(b, l + 1);
    r = r && infixOperationExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // GREATER | GREATER_EQUAL | LESSER | LESSER_EQUAL
  private static boolean comparisonExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, GREATER);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, LESSER);
    if (!r) r = consumeToken(b, LESSER_EQUAL);
    return r;
  }

  /* ********************************************************** */
  // type | (OPEN_BRACKET (type | complexType) CLOSE_BRACKET)
  public static boolean complexType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType")) return false;
    if (!nextTokenIs(b, "<complex type>", IDENTIFIER, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPLEX_TYPE, "<complex type>");
    r = type(b, l + 1);
    if (!r) r = complexType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OPEN_BRACKET (type | complexType) CLOSE_BRACKET
  private static boolean complexType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && complexType_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | complexType
  private static boolean complexType_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complexType_1_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = complexType(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // disjunctionExpression (DOUBLE_PIPE disjunctionExpression)*
  public static boolean conjunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunctionExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION_EXPRESSION, "<conjunction expression>");
    r = disjunctionExpression(b, l + 1);
    r = r && conjunctionExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOUBLE_PIPE disjunctionExpression)*
  private static boolean conjunctionExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunctionExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conjunctionExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunctionExpression_1", c)) break;
    }
    return true;
  }

  // DOUBLE_PIPE disjunctionExpression
  private static boolean conjunctionExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunctionExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_PIPE);
    r = r && disjunctionExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEW type OPEN_PARENTHESES argumentList CLOSE_PARENTHESES
  public static boolean constructorCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorCallExpression")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENTHESES);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    exit_section_(b, m, CONSTRUCTOR_CALL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // NEW OPEN_PARENTHESES parameterList? CLOSE_PARENTHESES (COLON (SELF | SUPER) OPEN_PARENTHESES argumentList CLOSE_PARENTHESES)? OPEN_BRACE statement* CLOSE_BRACE
  public static boolean constructorDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEW, OPEN_PARENTHESES);
    r = r && constructorDeclaration_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    r = r && constructorDeclaration_4(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && constructorDeclaration_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, CONSTRUCTOR_DECLARATION, r);
    return r;
  }

  // parameterList?
  private static boolean constructorDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_2")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // (COLON (SELF | SUPER) OPEN_PARENTHESES argumentList CLOSE_PARENTHESES)?
  private static boolean constructorDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_4")) return false;
    constructorDeclaration_4_0(b, l + 1);
    return true;
  }

  // COLON (SELF | SUPER) OPEN_PARENTHESES argumentList CLOSE_PARENTHESES
  private static boolean constructorDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructorDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && constructorDeclaration_4_0_1(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENTHESES);
    r = r && argumentList(b, l + 1);
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
  // equalityExpression (DOUBLE_AMPERSAND equalityExpression)*
  public static boolean disjunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunctionExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION_EXPRESSION, "<disjunction expression>");
    r = equalityExpression(b, l + 1);
    r = r && disjunctionExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (DOUBLE_AMPERSAND equalityExpression)*
  private static boolean disjunctionExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunctionExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!disjunctionExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunctionExpression_1", c)) break;
    }
    return true;
  }

  // DOUBLE_AMPERSAND equalityExpression
  private static boolean disjunctionExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunctionExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_AMPERSAND);
    r = r && equalityExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // comparisonExpression ((EQUAL_EQUAL | BANG_EQUAL) comparisonExpression)*
  public static boolean equalityExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_EXPRESSION, "<equality expression>");
    r = comparisonExpression(b, l + 1);
    r = r && equalityExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((EQUAL_EQUAL | BANG_EQUAL) comparisonExpression)*
  private static boolean equalityExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equalityExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equalityExpression_1", c)) break;
    }
    return true;
  }

  // (EQUAL_EQUAL | BANG_EQUAL) comparisonExpression
  private static boolean equalityExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equalityExpression_1_0_0(b, l + 1);
    r = r && comparisonExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUAL_EQUAL | BANG_EQUAL
  private static boolean equalityExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalityExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, EQUAL_EQUAL);
    if (!r) r = consumeToken(b, BANG_EQUAL);
    return r;
  }

  /* ********************************************************** */
  // ANDExpression (HAT ANDExpression)*
  public static boolean exclusiveORExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusiveORExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCLUSIVE_OR_EXPRESSION, "<exclusive or expression>");
    r = ANDExpression(b, l + 1);
    r = r && exclusiveORExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (HAT ANDExpression)*
  private static boolean exclusiveORExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusiveORExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!exclusiveORExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exclusiveORExpression_1", c)) break;
    }
    return true;
  }

  // HAT ANDExpression
  private static boolean exclusiveORExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusiveORExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HAT);
    r = r && ANDExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conjunctionExpression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = conjunctionExpression(b, l + 1);
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
  // accessModifiers? mutableModifier? OVRD? FN IDENTIFIER OPEN_PARENTHESES ((SELF (COMMA parameterList)?) | parameterList?) CLOSE_PARENTHESES (COLON complexType)? OPEN_BRACE statement* CLOSE_BRACE
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = functionDeclaration_0(b, l + 1);
    r = r && functionDeclaration_1(b, l + 1);
    r = r && functionDeclaration_2(b, l + 1);
    r = r && consumeTokens(b, 0, FN, IDENTIFIER, OPEN_PARENTHESES);
    r = r && functionDeclaration_6(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    r = r && functionDeclaration_8(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && functionDeclaration_10(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // accessModifiers?
  private static boolean functionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_0")) return false;
    accessModifiers(b, l + 1);
    return true;
  }

  // mutableModifier?
  private static boolean functionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_1")) return false;
    mutableModifier(b, l + 1);
    return true;
  }

  // OVRD?
  private static boolean functionDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_2")) return false;
    consumeToken(b, OVRD);
    return true;
  }

  // (SELF (COMMA parameterList)?) | parameterList?
  private static boolean functionDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration_6_0(b, l + 1);
    if (!r) r = functionDeclaration_6_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SELF (COMMA parameterList)?
  private static boolean functionDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELF);
    r = r && functionDeclaration_6_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameterList)?
  private static boolean functionDeclaration_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0_1")) return false;
    functionDeclaration_6_0_1_0(b, l + 1);
    return true;
  }

  // COMMA parameterList
  private static boolean functionDeclaration_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // parameterList?
  private static boolean functionDeclaration_6_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_1")) return false;
    parameterList(b, l + 1);
    return true;
  }

  // (COLON complexType)?
  private static boolean functionDeclaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8")) return false;
    functionDeclaration_8_0(b, l + 1);
    return true;
  }

  // COLON complexType
  private static boolean functionDeclaration_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_8_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && complexType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statement*
  private static boolean functionDeclaration_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_10", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean identifierExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IDENTIFIER_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // IF expression statement (ELSE statement)?
  public static boolean ifExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && ifExpression_3(b, l + 1);
    exit_section_(b, m, IF_EXPRESSION, r);
    return r;
  }

  // (ELSE statement)?
  private static boolean ifExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_3")) return false;
    ifExpression_3_0(b, l + 1);
    return true;
  }

  // ELSE statement
  private static boolean ifExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IF expression statement (ELSE statement)?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && statement(b, l + 1);
    r = r && ifStatement_3(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // (ELSE statement)?
  private static boolean ifStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_3")) return false;
    ifStatement_3_0(b, l + 1);
    return true;
  }

  // ELSE statement
  private static boolean ifStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  // exclusiveORExpression (PIPE exclusiveORExpression)*
  public static boolean inclusiveORExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusiveORExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUSIVE_OR_EXPRESSION, "<inclusive or expression>");
    r = exclusiveORExpression(b, l + 1);
    r = r && inclusiveORExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PIPE exclusiveORExpression)*
  private static boolean inclusiveORExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusiveORExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!inclusiveORExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inclusiveORExpression_1", c)) break;
    }
    return true;
  }

  // PIPE exclusiveORExpression
  private static boolean inclusiveORExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusiveORExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PIPE);
    r = r && exclusiveORExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACKET expression CLOSE_BRACKET
  public static boolean indexSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexSuffix")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, INDEX_SUFFIX, r);
    return r;
  }

  /* ********************************************************** */
  // inclusiveORExpression (IS inclusiveORExpression)*
  public static boolean infixOperationExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperationExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_OPERATION_EXPRESSION, "<infix operation expression>");
    r = inclusiveORExpression(b, l + 1);
    r = r && infixOperationExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IS inclusiveORExpression)*
  private static boolean infixOperationExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperationExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!infixOperationExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "infixOperationExpression_1", c)) break;
    }
    return true;
  }

  // IS inclusiveORExpression
  private static boolean infixOperationExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixOperationExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IS);
    r = r && inclusiveORExpression(b, l + 1);
    exit_section_(b, m, null, r);
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
  public static boolean literalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPRESSION, "<literal expression>");
    r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = literalExpression_3(b, l + 1);
    if (!r) r = literalExpression_4(b, l + 1);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    if (!r) r = consumeToken(b, FLOAT_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DOUBLE_QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* DOUBLE_QUOTE
  private static boolean literalExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTE);
    r = r && literalExpression_3_1(b, l + 1);
    r = r && consumeToken(b, DOUBLE_QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING_CHAR | ESCAPED_STRING_CHAR)*
  private static boolean literalExpression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literalExpression_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalExpression_3_1", c)) break;
    }
    return true;
  }

  // STRING_CHAR | ESCAPED_STRING_CHAR
  private static boolean literalExpression_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_3_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CHAR);
    if (!r) r = consumeToken(b, ESCAPED_STRING_CHAR);
    return r;
  }

  // QUOTE (STRING_CHAR | ESCAPED_STRING_CHAR)* QUOTE
  private static boolean literalExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE);
    r = r && literalExpression_4_1(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING_CHAR | ESCAPED_STRING_CHAR)*
  private static boolean literalExpression_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!literalExpression_4_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "literalExpression_4_1", c)) break;
    }
    return true;
  }

  // STRING_CHAR | ESCAPED_STRING_CHAR
  private static boolean literalExpression_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literalExpression_4_1_0")) return false;
    boolean r;
    r = consumeToken(b, STRING_CHAR);
    if (!r) r = consumeToken(b, ESCAPED_STRING_CHAR);
    return r;
  }

  /* ********************************************************** */
  // DOT | DOUBLE_COLON
  public static boolean memberSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberSuffix")) return false;
    if (!nextTokenIs(b, "<member suffix>", DOT, DOUBLE_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_SUFFIX, "<member suffix>");
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, DOUBLE_COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // asExpression ((STAR | SLASH) asExpression)*
  public static boolean multiplicativeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = asExpression(b, l + 1);
    r = r && multiplicativeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((STAR | SLASH) asExpression)*
  private static boolean multiplicativeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicativeExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicativeExpression_1", c)) break;
    }
    return true;
  }

  // (STAR | SLASH) asExpression
  private static boolean multiplicativeExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicativeExpression_1_0_0(b, l + 1);
    r = r && asExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | SLASH
  private static boolean multiplicativeExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicativeExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
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
  // OPEN_PARENTHESES expression CLOSE_PARENTHESES
  public static boolean parenthesizedExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesizedExpression")) return false;
    if (!nextTokenIs(b, OPEN_PARENTHESES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENTHESES);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENTHESES);
    exit_section_(b, m, PARENTHESIZED_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // primaryExpression postfixUnarySuffix*
  public static boolean postfixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_EXPRESSION, "<postfix unary expression>");
    r = primaryExpression(b, l + 1);
    r = r && postfixUnaryExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postfixUnarySuffix*
  private static boolean postfixUnaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnaryExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postfixUnarySuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postfixUnaryExpression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (DOUBLE_PLUS | DOUBLE_MINUS)
  //                         | callSuffix
  //                         | indexSuffix
  //                         | memberSuffix
  //                         | assignSuffix
  public static boolean postfixUnarySuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnarySuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_UNARY_SUFFIX, "<postfix unary suffix>");
    r = postfixUnarySuffix_0(b, l + 1);
    if (!r) r = callSuffix(b, l + 1);
    if (!r) r = indexSuffix(b, l + 1);
    if (!r) r = memberSuffix(b, l + 1);
    if (!r) r = assignSuffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DOUBLE_PLUS | DOUBLE_MINUS
  private static boolean postfixUnarySuffix_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfixUnarySuffix_0")) return false;
    boolean r;
    r = consumeToken(b, DOUBLE_PLUS);
    if (!r) r = consumeToken(b, DOUBLE_MINUS);
    return r;
  }

  /* ********************************************************** */
  // unaryOperators* postfixUnaryExpression
  public static boolean prefixUnaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_UNARY_EXPRESSION, "<prefix unary expression>");
    r = prefixUnaryExpression_0(b, l + 1);
    r = r && postfixUnaryExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unaryOperators*
  private static boolean prefixUnaryExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefixUnaryExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unaryOperators(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "prefixUnaryExpression_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // parenthesizedExpression
  //                         | arrayExpression
  //                         | literalExpression
  //                         | identifierExpression
  //                         | constructorCallExpression
  //                         | selfExpression
  //                         | superExpression
  //                         | ifExpression
  public static boolean primaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = parenthesizedExpression(b, l + 1);
    if (!r) r = arrayExpression(b, l + 1);
    if (!r) r = literalExpression(b, l + 1);
    if (!r) r = identifierExpression(b, l + 1);
    if (!r) r = constructorCallExpression(b, l + 1);
    if (!r) r = selfExpression(b, l + 1);
    if (!r) r = superExpression(b, l + 1);
    if (!r) r = ifExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RETURN expression?
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && returnStatement_1(b, l + 1);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // SELF
  public static boolean selfExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selfExpression")) return false;
    if (!nextTokenIs(b, SELF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELF);
    exit_section_(b, m, SELF_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // additiveExpression ((DOUBLE_GREATER | DOUBLE_LESSER | TRIPLE_GREATER) additiveExpression)*
  public static boolean shiftingExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftingExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFTING_EXPRESSION, "<shifting expression>");
    r = additiveExpression(b, l + 1);
    r = r && shiftingExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((DOUBLE_GREATER | DOUBLE_LESSER | TRIPLE_GREATER) additiveExpression)*
  private static boolean shiftingExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftingExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shiftingExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shiftingExpression_1", c)) break;
    }
    return true;
  }

  // (DOUBLE_GREATER | DOUBLE_LESSER | TRIPLE_GREATER) additiveExpression
  private static boolean shiftingExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftingExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shiftingExpression_1_0_0(b, l + 1);
    r = r && additiveExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOUBLE_GREATER | DOUBLE_LESSER | TRIPLE_GREATER
  private static boolean shiftingExpression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftingExpression_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, DOUBLE_GREATER);
    if (!r) r = consumeToken(b, DOUBLE_LESSER);
    if (!r) r = consumeToken(b, TRIPLE_GREATER);
    return r;
  }

  /* ********************************************************** */
  // variableDeclaration | ifStatement | blockStatement | returnStatement | expression
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = variableDeclaration(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = blockStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SUPER
  public static boolean superExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "superExpression")) return false;
    if (!nextTokenIs(b, SUPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPER);
    exit_section_(b, m, SUPER_EXPRESSION, r);
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
  // PLUS
  //                         | DOUBLE_PLUS
  //                         | MINUS
  //                         | DOUBLE_MINUS
  //                         | TILDE
  //                         | BANG
  public static boolean unaryOperators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryOperators")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATORS, "<unary operators>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, DOUBLE_PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, DOUBLE_MINUS);
    if (!r) r = consumeToken(b, TILDE);
    if (!r) r = consumeToken(b, BANG);
    exit_section_(b, l, m, r, false, null);
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
  // MUT? IDENTIFIER COLON_EQUAL expression
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    if (!nextTokenIs(b, "<variable declaration>", IDENTIFIER, MUT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variableDeclaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, COLON_EQUAL);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MUT?
  private static boolean variableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0")) return false;
    consumeToken(b, MUT);
    return true;
  }

}
