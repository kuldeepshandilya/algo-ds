package com.practice.algods.tree;

public class TreeNode<Comparable> {
  private Comparable data;
  private TreeNode leftChild, rightChild;
  public TreeNode(Comparable data, TreeNode leftChild, TreeNode rightChild) {
    this.data = data;
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

  public Comparable getData() {
    return data;
  }

  public com.practice.algods.tree.TreeNode getLeftChild() {
    return leftChild;
  }

  public com.practice.algods.tree.TreeNode getRightChild() {
    return rightChild;
  }

  public void setData(Comparable data) {
    this.data = data;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }

  @Override
  public String toString() {
    return "TreeNode{" +
        "data=" + data +
        ", leftChild=" + leftChild +
        ", rightChild=" + rightChild +
        '}';
  }
}
