// This is a generated file. Not intended for manual editing.
package org.casc.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.casc.lang.psi.impl.*;

public interface CASCTypes {

  IElementType ACCESS_MODIFIERS = new CASCElementType("ACCESS_MODIFIERS");
  IElementType CLASS_DECLARATION = new CASCElementType("CLASS_DECLARATION");
  IElementType CLASS_FIELDS = new CASCElementType("CLASS_FIELDS");
  IElementType COMPLEX_TYPE = new CASCElementType("COMPLEX_TYPE");
  IElementType FIELD = new CASCElementType("FIELD");
  IElementType IMPLEMENTATION = new CASCElementType("IMPLEMENTATION");
  IElementType MUTABLE_MODIFIER = new CASCElementType("MUTABLE_MODIFIER");

  IElementType CLASS = new CASCTokenType("CLASS");
  IElementType CLOSE_BRACE = new CASCTokenType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new CASCTokenType("CLOSE_BRACKET");
  IElementType COLON = new CASCTokenType("COLON");
  IElementType COMMENT = new CASCTokenType("COMMENT");
  IElementType COMP = new CASCTokenType("COMP");
  IElementType IDENTIFIER = new CASCTokenType("IDENTIFIER");
  IElementType IMPL = new CASCTokenType("IMPL");
  IElementType INTL = new CASCTokenType("INTL");
  IElementType MUT = new CASCTokenType("MUT");
  IElementType OPEN_BRACE = new CASCTokenType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new CASCTokenType("OPEN_BRACKET");
  IElementType PRIV = new CASCTokenType("PRIV");
  IElementType PROT = new CASCTokenType("PROT");
  IElementType PUB = new CASCTokenType("PUB");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ACCESS_MODIFIERS) {
        return new CASCAccessModifiersImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new CASCClassDeclarationImpl(node);
      }
      else if (type == CLASS_FIELDS) {
        return new CASCClassFieldsImpl(node);
      }
      else if (type == COMPLEX_TYPE) {
        return new CASCComplexTypeImpl(node);
      }
      else if (type == FIELD) {
        return new CASCFieldImpl(node);
      }
      else if (type == IMPLEMENTATION) {
        return new CASCImplementationImpl(node);
      }
      else if (type == MUTABLE_MODIFIER) {
        return new CASCMutableModifierImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
