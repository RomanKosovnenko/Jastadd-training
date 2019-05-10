/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\expressions.ast:9
 * @production MinusExp : {@link BinExp};

 */
public class MinusExp extends BinExp implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public MinusExp() {
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
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public MinusExp(Exp p0, Exp p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:24
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public MinusExp clone() throws CloneNotSupportedException {
    MinusExp node = (MinusExp) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public MinusExp copy() {
    try {
      MinusExp node = (MinusExp) clone();
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
   * @declaredat ASTNode:60
   */
  @Deprecated
  public MinusExp fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:70
   */
  public MinusExp treeCopyNoTransform() {
    MinusExp tree = (MinusExp) copy();
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
   * @declaredat ASTNode:90
   */
  public MinusExp treeCopy() {
    MinusExp tree = (MinusExp) copy();
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
   * @declaredat ASTNode:104
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
   * Replaces the B child.
   * @param node The new node to replace the B child.
   * @apilevel high-level
   */
  public void setB(Exp node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the B child.
   * @return The current node used as the B child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="B")
  public Exp getB() {
    return (Exp) getChild(1);
  }
  /**
   * Retrieves the B child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the B child.
   * @apilevel low-level
   */
  public Exp getBNoTransform() {
    return (Exp) getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect Evaluation
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Evaluation", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Evaluation.jrag:3")
  public float eval() {
    float eval_value = getA().eval() - getB().eval();
    return eval_value;
  }
  /**
   * @attribute syn
   * @aspect Printing
   * @declaredat D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Printing.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="D:\\Projects\\TUDwork\\jastadd_task\\src\\main\\jastadd\\Printing.jrag:3")
  public String print() {
    String print_value = "(" + getA().print() + " - " + getB().print() + ")";
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
