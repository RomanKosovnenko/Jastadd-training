/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\expressions.ast:11
 * @production Number : {@link Exp} ::= <span class="component">&lt;Value:float&gt;</span>;

 */
public class Number extends Exp implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Number() {
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
  public Number(float p0) {
    setValue(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:16
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:22
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:26
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public Number clone() throws CloneNotSupportedException {
    Number node = (Number) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Number copy() {
    try {
      Number node = (Number) clone();
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
   * @declaredat ASTNode:58
   */
  @Deprecated
  public Number fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:68
   */
  public Number treeCopyNoTransform() {
    Number tree = (Number) copy();
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
   * @declaredat ASTNode:88
   */
  public Number treeCopy() {
    Number tree = (Number) copy();
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
   * @declaredat ASTNode:102
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenfloat_Value == ((Number) node).tokenfloat_Value);    
  }
  /**
   * Replaces the lexeme Value.
   * @param value The new value for the lexeme Value.
   * @apilevel high-level
   */
  public void setValue(float value) {
    tokenfloat_Value = value;
  }
  /** @apilevel internal 
   */
  protected float tokenfloat_Value;
  /**
   * Retrieves the value for the lexeme Value.
   * @return The value for the lexeme Value.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Value")
  public float getValue() {
    return tokenfloat_Value;
  }
  /**
   * @attribute syn
   * @aspect Evaluation
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Evaluation", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3")
  public float eval() {
    float eval_value = getValue();
    return eval_value;
  }
  /**
   * @attribute syn
   * @aspect Optimization
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Optimization.jrag:2
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Optimization", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Optimization.jrag:2")
  public boolean isConstantSubtree() {
    boolean isConstantSubtree_value = true;
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
    String print_value = Float.toString(getValue());
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
