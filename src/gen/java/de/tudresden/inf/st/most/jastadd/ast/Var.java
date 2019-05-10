/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\expressions.ast:12
 * @production Var : {@link Exp} ::= <span class="component">&lt;Name:String&gt;</span>;

 */
public class Var extends Exp implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Var() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  public Var(String p0) {
    setName(p0);
  }
  /**
   * @declaredat ASTNode:15
   */
  public Var(beaver.Symbol p0) {
    setName(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:19
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:25
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:29
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public Var clone() throws CloneNotSupportedException {
    Var node = (Var) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public Var copy() {
    try {
      Var node = (Var) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:61
   */
  @Deprecated
  public Var fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:71
   */
  public Var treeCopyNoTransform() {
    Var tree = (Var) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:91
   */
  public Var treeCopy() {
    Var tree = (Var) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:105
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((Var) node).tokenString_Name);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   */
  public int Namestart;
  /**
   */
  public int Nameend;
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Name
   * @apilevel internal
   */
  public void setName(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * @attribute syn
   * @aspect Analysis
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Analysis.jrag:20
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Analysis", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Analysis.jrag:20")
  public boolean DefInExp(String name) {
    {
        if(this.getName().equals(name)) {
            return true;
        }
        return false;
      }
  }
  /**
   * @attribute syn
   * @aspect Evaluation
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Evaluation", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3")
  public float eval() {
    float eval_value = getDef().getValue();
    return eval_value;
  }
  /**
   * @attribute syn
   * @aspect NameResolution
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\NameResolution.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameResolution", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\NameResolution.jrag:3")
  public Def getDef() {
    {
        ASTNode p = this;
        while(p.parent != null) {
            p = p.parent;
        }
        for (ASTNode def : p.children[0].children) {
            if(def == null) continue;
            if( ((Def)def).getName().equals(getName()) ) {
                return (Def)def;
            }
        }
        return new Def();
      }
  }
  /**
   * @attribute syn
   * @aspect Optimization
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Optimization.jrag:2
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Optimization", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Optimization.jrag:2")
  public boolean isConstantSubtree() {
    boolean isConstantSubtree_value = false;
    return isConstantSubtree_value;
  }
  /**
   * @attribute syn
   * @aspect Printing
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Printing.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Printing.jrag:3")
  public String print() {
    String print_value = getName();
    return print_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
