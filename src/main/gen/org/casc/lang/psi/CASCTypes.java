// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.casc.lang.psi.impl.*;

public interface CASCTypes {

  IElementType ACCESS_MODIFIERS = new CASCElementType("ACCESS_MODIFIERS");
  IElementType ARRAY_DECLARATION = new CASCElementType("ARRAY_DECLARATION");
  IElementType ARRAY_INITIALIZATION = new CASCElementType("ARRAY_INITIALIZATION");
  IElementType CLASS_DECLARATION = new CASCElementType("CLASS_DECLARATION");
  IElementType CLASS_FIELDS = new CASCElementType("CLASS_FIELDS");
  IElementType COMPANION_BLOCK = new CASCElementType("COMPANION_BLOCK");
  IElementType COMPLEX_TYPE = new CASCElementType("COMPLEX_TYPE");
  IElementType CONSTRUCTOR_DECLARATION = new CASCElementType("CONSTRUCTOR_DECLARATION");
  IElementType EXPRESSION = new CASCElementType("EXPRESSION");
  IElementType FIELD = new CASCElementType("FIELD");
  IElementType FUNCTION_DECLARATION = new CASCElementType("FUNCTION_DECLARATION");
  IElementType IMPLEMENTATION = new CASCElementType("IMPLEMENTATION");
  IElementType LITERAL_VALUE = new CASCElementType("LITERAL_VALUE");
  IElementType MUTABLE_MODIFIER = new CASCElementType("MUTABLE_MODIFIER");
  IElementType PACKAGE_DECLARATION = new CASCElementType("PACKAGE_DECLARATION");
  IElementType PARAMETER_LIST = new CASCElementType("PARAMETER_LIST");
  IElementType STATEMENT = new CASCElementType("STATEMENT");
  IElementType TYPE = new CASCElementType("TYPE");
  IElementType USAGE = new CASCElementType("USAGE");
  IElementType VARIABLE_DECLARATION = new CASCElementType("VARIABLE_DECLARATION");

  IElementType AS = new CASCTokenType("AS");
  IElementType CHAR_LITERAL = new CASCTokenType("CHAR_LITERAL");
  IElementType CLASS = new CASCTokenType("CLASS");
  IElementType CLOSE_BRACE = new CASCTokenType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new CASCTokenType("CLOSE_BRACKET");
  IElementType CLOSE_PARENTHESES = new CASCTokenType("CLOSE_PARENTHESES");
  IElementType COLON = new CASCTokenType("COLON");
  IElementType COLON_EQUAL = new CASCTokenType("COLON_EQUAL");
  IElementType COMMA = new CASCTokenType("COMMA");
  IElementType COMMENT = new CASCTokenType("COMMENT");
  IElementType COMP = new CASCTokenType("COMP");
  IElementType DOUBLE_COLON = new CASCTokenType("DOUBLE_COLON");
  IElementType FALSE = new CASCTokenType("FALSE");
  IElementType FLOAT_LITERAL = new CASCTokenType("FLOAT_LITERAL");
  IElementType FN = new CASCTokenType("FN");
  IElementType IDENTIFIER = new CASCTokenType("IDENTIFIER");
  IElementType IMPL = new CASCTokenType("IMPL");
  IElementType INTEGER_LITERAL = new CASCTokenType("INTEGER_LITERAL");
  IElementType INTL = new CASCTokenType("INTL");
  IElementType MUT = new CASCTokenType("MUT");
  IElementType NEW = new CASCTokenType("NEW");
  IElementType NULL = new CASCTokenType("NULL");
  IElementType OPEN_BRACE = new CASCTokenType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new CASCTokenType("OPEN_BRACKET");
  IElementType OPEN_PARENTHESES = new CASCTokenType("OPEN_PARENTHESES");
  IElementType PACKAGE = new CASCTokenType("PACKAGE");
  IElementType PRIV = new CASCTokenType("PRIV");
  IElementType PROT = new CASCTokenType("PROT");
  IElementType PUB = new CASCTokenType("PUB");
  IElementType SELF = new CASCTokenType("SELF");
  IElementType STRING_LITERAL = new CASCTokenType("STRING_LITERAL");
  IElementType SUPER = new CASCTokenType("SUPER");
  IElementType TRUE = new CASCTokenType("TRUE");
  IElementType USE = new CASCTokenType("USE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_MODIFIERS) {
        return new CASCAccessModifiersImpl(node);
      }
      else if (type == ARRAY_DECLARATION) {
        return new CASCArrayDeclarationImpl(node);
      }
      else if (type == ARRAY_INITIALIZATION) {
        return new CASCArrayInitializationImpl(node);
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
      else if (type == COMPLEX_TYPE) {
        return new CASCComplexTypeImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION) {
        return new CASCConstructorDeclarationImpl(node);
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
      else if (type == IMPLEMENTATION) {
        return new CASCImplementationImpl(node);
      }
      else if (type == LITERAL_VALUE) {
        return new CASCLiteralValueImpl(node);
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
      else if (type == STATEMENT) {
        return new CASCStatementImpl(node);
      }
      else if (type == TYPE) {
        return new CASCTypeImpl(node);
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
