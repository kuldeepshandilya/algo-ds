package com.practice.algods.tree;

public class BST {

  public TreeNode<Comparable> search(TreeNode<Comparable> root, Comparable itemToSearch) {
    if(root == null){
      return null;
    }
    if(itemToSearch.compareTo(root.getData()) == 0){
      return root;
    } else {
      if(itemToSearch.compareTo(root.getData()) < 0) {
        return search(root.getLeftChild(), itemToSearch);
      } else {
        return search(root.getRightChild(), itemToSearch);
      }
    }
  }


  public TreeNode<Comparable> insert(TreeNode<Comparable> root, Comparable itemToInsert) {
    if(root == null ){
      return new TreeNode<>(itemToInsert);
    } else {
      if(itemToInsert.compareTo(root.getData()) <= 0) {
        root.setLeftChild(insert(root.getLeftChild(), itemToInsert));
        return root;
      } else {
        root.setRightChild(insert(root.getRightChild(), itemToInsert));
        return root;
      }
    }
  }

  public TreeNode<Comparable> delete(TreeNode<Comparable> root, Comparable itemToDelete) {
    if (root == null)
      return null;

    if (itemToDelete.compareTo(root.getData()) < 0) {
      root.setLeftChild(delete(root.getLeftChild(), itemToDelete));
    } else if (itemToDelete.compareTo((root.getData())) > 0) {
      root.setRightChild(delete(root.getRightChild(), itemToDelete));
    } else if (root.getLeftChild() == null) {
        return root.getRightChild();
      } else if (root.getRightChild() == null) {
        return root.getLeftChild();
      } else {
        root.setData(deleteInorderSuccessor(root));
        return root;
      }
    return root;
  }

private Comparable deleteInorderSuccessor(TreeNode<Comparable> root) {
    TreeNode<Comparable> right = root.getRightChild(), temp = right.getLeftChild(), temp1 = temp;
    while(temp.getLeftChild() != null){
      temp1 = temp;
      temp = temp.getLeftChild();
    }
    temp1.setLeftChild(null);
    return temp.getData();
}

}
