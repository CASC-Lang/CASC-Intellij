// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.casc.lang.psi.impl.*;

public interface CASCTypes {

  IElementType ACCESS_MODIFIERS = new CASCElementType("ACCESS_MODIFIERS");
  IElementType ADDITIVE_EXPRESSION = new CASCElementType("ADDITIVE_EXPRESSION");
  IElementType AND_EXPRESSION = new CASCElementType("AND_EXPRESSION");
  IElementType ARGUMENT_LIST = new CASCElementType("ARGUMENT_LIST");
  IElementType ARRAY_EXPRESSION = new CASCElementType("ARRAY_EXPRESSION");
  IElementType ARRAY_SIZE_DECLARATION = new CASCElementType("ARRAY_SIZE_DECLARATION");
  IElementType ASSIGN_SUFFIX = new CASCElementType("ASSIGN_SUFFIX");
  IElementType AS_EXPRESSION = new CASCElementType("AS_EXPRESSION");
  IElementType BLOCK_STATEMENT = new CASCElementType("BLOCK_STATEMENT");
  IElementType CALL_SUFFIX = new CASCElementType("CALL_SUFFIX");
  IElementType CLASS_DECLARATION = new CASCElementType("CLASS_DECLARATION");
  IElementType CLASS_FIELDS = new CASCElementType("CLASS_FIELDS");
  IElementType COMPANION_BLOCK = new CASCElementType("COMPANION_BLOCK");
  IElementType COMPARISON_EXPRESSION = new CASCElementType("COMPARISON_EXPRESSION");
  IElementType COMPLEX_TYPE = new CASCElementType("COMPLEX_TYPE");
  IElementType CONJUNCTION_EXPRESSION = new CASCElementType("CONJUNCTION_EXPRESSION");
  IElementType CONSTRUCTOR_CALL_EXPRESSION = new CASCElementType("CONSTRUCTOR_CALL_EXPRESSION");
  IElementType CONSTRUCTOR_DECLARATION = new CASCElementType("CONSTRUCTOR_DECLARATION");
  IElementType DISJUNCTION_EXPRESSION = new CASCElementType("DISJUNCTION_EXPRESSION");
  IElementType EQUALITY_EXPRESSION = new CASCElementType("EQUALITY_EXPRESSION");
  IElementType EXCLUSIVE_OR_EXPRESSION = new CASCElementType("EXCLUSIVE_OR_EXPRESSION");
  IElementType EXPRESSION = new CASCElementType("EXPRESSION");
  IElementType FIELD = new CASCElementType("FIELD");
  IElementType FUNCTION_DECLARATION = new CASCElementType("FUNCTION_DECLARATION");
  IElementType IDENTIFIER_EXPRESSION = new CASCElementType("IDENTIFIER_EXPRESSION");
  IElementType IF_EXPRESSION = new CASCElementType("IF_EXPRESSION");
  IElementType IF_STATEMENT = new CASCElementType("IF_STATEMENT");
  IElementType IMPLEMENTATION = new CASCElementType("IMPLEMENTATION");
  IElementType INCLUSIVE_OR_EXPRESSION = new CASCElementType("INCLUSIVE_OR_EXPRESSION");
  IElementType INDEX_SUFFIX = new CASCElementType("INDEX_SUFFIX");
  IElementType INFIX_OPERATION_EXPRESSION = new CASCElementType("INFIX_OPERATION_EXPRESSION");
  IElementType LITERAL_EXPRESSION = new CASCElementType("LITERAL_EXPRESSION");
  IElementType MEMBER_SUFFIX = new CASCElementType("MEMBER_SUFFIX");
  IElementType MULTIPLICATIVE_EXPRESSION = new CASCElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType MUTABLE_MODIFIER = new CASCElementType("MUTABLE_MODIFIER");
  IElementType PACKAGE_DECLARATION = new CASCElementType("PACKAGE_DECLARATION");
  IElementType PARAMETER_LIST = new CASCElementType("PARAMETER_LIST");
  IElementType PARENTHESIZED_EXPRESSION = new CASCElementType("PARENTHESIZED_EXPRESSION");
  IElementType POSTFIX_UNARY_EXPRESSION = new CASCElementType("POSTFIX_UNARY_EXPRESSION");
  IElementType POSTFIX_UNARY_SUFFIX = new CASCElementType("POSTFIX_UNARY_SUFFIX");
  IElementType PREFIX_UNARY_EXPRESSION = new CASCElementType("PREFIX_UNARY_EXPRESSION");
  IElementType PRIMARY_EXPRESSION = new CASCElementType("PRIMARY_EXPRESSION");
  IElementType RETURN_STATEMENT = new CASCElementType("RETURN_STATEMENT");
  IElementType SELF_EXPRESSION = new CASCElementType("SELF_EXPRESSION");
  IElementType SHIFTING_EXPRESSION = new CASCElementType("SHIFTING_EXPRESSION");
  IElementType STATEMENT = new CASCElementType("STATEMENT");
  IElementType SUPER_EXPRESSION = new CASCElementType("SUPER_EXPRESSION");
  IElementType TYPE = new CASCElementType("TYPE");
  IElementType UNARY_OPERATORS = new CASCElementType("UNARY_OPERATORS");
  IElementType USAGE = new CASCElementType("USAGE");
  IElementType VARIABLE_DECLARATION = new CASCElementType("VARIABLE_DECLARATION");

  IElementType AMPERSAND = new CASCTokenType("AMPERSAND");
  IElementType AS = new CASCTokenType("AS");
  IElementType BANG = new CASCTokenType("BANG");
  IElementType BANG_EQUAL = new CASCTokenType("BANG_EQUAL");
  IElementType CLASS = new CASCTokenType("CLASS");
  IElementType CLOSE_BRACE = new CASCTokenType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new CASCTokenType("CLOSE_BRACKET");
  IElementType CLOSE_PARENTHESES = new CASCTokenType("CLOSE_PARENTHESES");
  IElementType COLON = new CASCTokenType("COLON");
  IElementType COLON_EQUAL = new CASCTokenType("COLON_EQUAL");
  IElementType COMMA = new CASCTokenType("COMMA");
  IElementType COMMENT = new CASCTokenType("COMMENT");
  IElementType COMP = new CASCTokenType("COMP");
  IElementType DOT = new CASCTokenType("DOT");
  IElementType DOUBLE_AMPERSAND = new CASCTokenType("DOUBLE_AMPERSAND");
  IElementType DOUBLE_COLON = new CASCTokenType("DOUBLE_COLON");
  IElementType DOUBLE_GREATER = new CASCTokenType("DOUBLE_GREATER");
  IElementType DOUBLE_LESSER = new CASCTokenType("DOUBLE_LESSER");
  IElementType DOUBLE_MINUS = new CASCTokenType("DOUBLE_MINUS");
  IElementType DOUBLE_PIPE = new CASCTokenType("DOUBLE_PIPE");
  IElementType DOUBLE_PLUS = new CASCTokenType("DOUBLE_PLUS");
  IElementType DOUBLE_QUOTE = new CASCTokenType("DOUBLE_QUOTE");
  IElementType ELSE = new CASCTokenType("ELSE");
  IElementType EQUAL = new CASCTokenType("EQUAL");
  IElementType EQUAL_EQUAL = new CASCTokenType("EQUAL_EQUAL");
  IElementType ESCAPED_STRING_CHAR = new CASCTokenType("ESCAPED_STRING_CHAR");
  IElementType FALSE = new CASCTokenType("FALSE");
  IElementType FLOAT_LITERAL = new CASCTokenType("FLOAT_LITERAL");
  IElementType FN = new CASCTokenType("FN");
  IElementType GREATER = new CASCTokenType("GREATER");
  IElementType GREATER_EQUAL = new CASCTokenType("GREATER_EQUAL");
  IElementType HAT = new CASCTokenType("HAT");
  IElementType IDENTIFIER = new CASCTokenType("IDENTIFIER");
  IElementType IF = new CASCTokenType("IF");
  IElementType IMPL = new CASCTokenType("IMPL");
  IElementType INTEGER_LITERAL = new CASCTokenType("INTEGER_LITERAL");
  IElementType INTL = new CASCTokenType("INTL");
  IElementType IS = new CASCTokenType("IS");
  IElementType LESSER = new CASCTokenType("LESSER");
  IElementType LESSER_EQUAL = new CASCTokenType("LESSER_EQUAL");
  IElementType MINUS = new CASCTokenType("MINUS");
  IElementType MUT = new CASCTokenType("MUT");
  IElementType NEW = new CASCTokenType("NEW");
  IElementType NULL = new CASCTokenType("NULL");
  IElementType OPEN_BRACE = new CASCTokenType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new CASCTokenType("OPEN_BRACKET");
  IElementType OPEN_PARENTHESES = new CASCTokenType("OPEN_PARENTHESES");
  IElementType OVRD = new CASCTokenType("OVRD");
  IElementType PACKAGE = new CASCTokenType("PACKAGE");
  IElementType PIPE = new CASCTokenType("PIPE");
  IElementType PLUS = new CASCTokenType("PLUS");
  IElementType PRIV = new CASCTokenType("PRIV");
  IElementType PROT = new CASCTokenType("PROT");
  IElementType PUB = new CASCTokenType("PUB");
  IElementType QUOTE = new CASCTokenType("QUOTE");
  IElementType RETURN = new CASCTokenType("RETURN");
  IElementType SELF = new CASCTokenType("SELF");
  IElementType SEMICOLON = new CASCTokenType("SEMICOLON");
  IElementType SLASH = new CASCTokenType("SLASH");
  IElementType STAR = new CASCTokenType("STAR");
  IElementType STRING_CHAR = new CASCTokenType("STRING_CHAR");
  IElementType SUPER = new CASCTokenType("SUPER");
  IElementType TILDE = new CASCTokenType("TILDE");
  IElementType TRIPLE_GREATER = new CASCTokenType("TRIPLE_GREATER");
  IElementType TRUE = new CASCTokenType("TRUE");
  IElementType USE = new CASCTokenType("USE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_MODIFIERS) {
        return new CASCAccessModifiersImpl(node);
      }
      else if (type == ADDITIVE_EXPRESSION) {
        return new CASCAdditiveExpressionImpl(node);
      }
      else if (type == AND_EXPRESSION) {
        return new CASCANDExpressionImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new CASCArgumentListImpl(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new CASCArrayExpressionImpl(node);
      }
      else if (type == ARRAY_SIZE_DECLARATION) {
        return new CASCArraySizeDeclarationImpl(node);
      }
      else if (type == ASSIGN_SUFFIX) {
        return new CASCAssignSuffixImpl(node);
      }
      else if (type == AS_EXPRESSION) {
        return new CASCAsExpressionImpl(node);
      }
      else if (type == BLOCK_STATEMENT) {
        return new CASCBlockStatementImpl(node);
      }
      else if (type == CALL_SUFFIX) {
        return new CASCCallSuffixImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new CASCClassDeclarationImpl(node);
      }
      else if (type == CLASS_FIELDS) {
        return new CASCClassFieldsImpl(node);
      }
      else if (type == COMPANION_BLOCK) {
        return new CASCCompanionBlockImpl(node);
      }
      else if (type == COMPARISON_EXPRESSION) {
        return new CASCComparisonExpressionImpl(node);
      }
      else if (type == COMPLEX_TYPE) {
        return new CASCComplexTypeImpl(node);
      }
      else if (type == CONJUNCTION_EXPRESSION) {
        return new CASCConjunctionExpressionImpl(node);
      }
      else if (type == CONSTRUCTOR_CALL_EXPRESSION) {
        return new CASCConstructorCallExpressionImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION) {
        return new CASCConstructorDeclarationImpl(node);
      }
      else if (type == DISJUNCTION_EXPRESSION) {
        return new CASCDisjunctionExpressionImpl(node);
      }
      else if (type == EQUALITY_EXPRESSION) {
        return new CASCEqualityExpressionImpl(node);
      }
      else if (type == EXCLUSIVE_OR_EXPRESSION) {
        return new CASCExclusiveORExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new CASCExpressionImpl(node);
      }
      else if (type == FIELD) {
        return new CASCFieldImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new CASCFunctionDeclarationImpl(node);
      }
      else if (type == IDENTIFIER_EXPRESSION) {
        return new CASCIdentifierExpressionImpl(node);
      }
      else if (type == IF_EXPRESSION) {
        return new CASCIfExpressionImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new CASCIfStatementImpl(node);
      }
      else if (type == IMPLEMENTATION) {
        return new CASCImplementationImpl(node);
      }
      else if (type == INCLUSIVE_OR_EXPRESSION) {
        return new CASCInclusiveORExpressionImpl(node);
      }
      else if (type == INDEX_SUFFIX) {
        return new CASCIndexSuffixImpl(node);
      }
      else if (type == INFIX_OPERATION_EXPRESSION) {
        return new CASCInfixOperationExpressionImpl(node);
      }
      else if (type == LITERAL_EXPRESSION) {
        return new CASCLiteralExpressionImpl(node);
      }
      else if (type == MEMBER_SUFFIX) {
        return new CASCMemberSuffixImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new CASCMultiplicativeExpressionImpl(node);
      }
      else if (type == MUTABLE_MODIFIER) {
        return new CASCMutableModifierImpl(node);
      }
      else if (type == PACKAGE_DECLARATION) {
        return new CASCPackageDeclarationImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new CASCParameterListImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new CASCParenthesizedExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_EXPRESSION) {
        return new CASCPostfixUnaryExpressionImpl(node);
      }
      else if (type == POSTFIX_UNARY_SUFFIX) {
        return new CASCPostfixUnarySuffixImpl(node);
      }
      else if (type == PREFIX_UNARY_EXPRESSION) {
        return new CASCPrefixUnaryExpressionImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new CASCPrimaryExpressionImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CASCReturnStatementImpl(node);
      }
      else if (type == SELF_EXPRESSION) {
        return new CASCSelfExpressionImpl(node);
      }
      else if (type == SHIFTING_EXPRESSION) {
        return new CASCShiftingExpressionImpl(node);
      }
      else if (type == STATEMENT) {
        return new CASCStatementImpl(node);
      }
      else if (type == SUPER_EXPRESSION) {
        return new CASCSuperExpressionImpl(node);
      }
      else if (type == TYPE) {
        return new CASCTypeImpl(node);
      }
      else if (type == UNARY_OPERATORS) {
        return new CASCUnaryOperatorsImpl(node);
      }
      else if (type == USAGE) {
        return new CASCUsageImpl(node);
      }
      else if (type == VARIABLE_DECLARATION) {
        return new CASCVariableDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
