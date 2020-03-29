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

}
