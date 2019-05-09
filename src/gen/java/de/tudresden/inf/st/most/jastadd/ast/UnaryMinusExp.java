/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\expressions.ast:10
 * @production UnaryMinusExp : {@link UnaryExp};

 */
public class UnaryMinusExp extends UnaryExp implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public UnaryMinusExp() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public UnaryMinusExp(Exp p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:17
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:23
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public UnaryMinusExp clone() throws CloneNotSupportedException {
    UnaryMinusExp node = (UnaryMinusExp) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public UnaryMinusExp copy() {
    try {
      UnaryMinusExp node = (UnaryMinusExp) clone();
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
   * @declaredat ASTNode:59
   */
  @Deprecated
  public UnaryMinusExp fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:69
   */
  public UnaryMinusExp treeCopyNoTransform() {
    UnaryMinusExp tree = (UnaryMinusExp) copy();
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
   * @declaredat ASTNode:89
   */
  public UnaryMinusExp treeCopy() {
    UnaryMinusExp tree = (UnaryMinusExp) copy();
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
   * @declaredat ASTNode:103
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the A child.
   * @param node The new node to replace the A child.
   * @apilevel high-level
   */
  public void setA(Exp node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the A child.
   * @return The current node used as the A child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="A")
  public Exp getA() {
    return (Exp) getChild(0);
  }
  /**
   * Retrieves the A child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the A child.
   * @apilevel low-level
   */
  public Exp getANoTransform() {
    return (Exp) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Evaluation
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Evaluation", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3")
  public float eval() {
    float eval_value = (-1) * getA().eval();
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
    boolean isConstantSubtree_value = getA().isConstantSubtree();
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
    String print_value = "(" + "-" + getA().print() + ")";
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
