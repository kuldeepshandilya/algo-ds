package com.practice.algods.tree;

import com.practice.algods.sorting.QuickSort;
import java.util.ArrayList;
import java.util.List;

public class TreeUtil {

  private static List<Comparable> treeDataFromInOrderWalk = new ArrayList<>();

  /**
   *
   * @param treeData - unsorted data
   * @return
   */
  public static List<Comparable> sortedDataFromInOrderWalk(Comparable[] treeData) {
    TreeNode root = createTree(treeData);
    inOrder(root);
    return treeDataFromInOrderWalk;
  }

  public static TreeNode createTree(Comparable[] treeData) {
    Comparable[] sortedTreeData = new QuickSort().sort(treeData);
    TreeNode root = createTreeFromSortedArray(sortedTreeData, 0, sortedTreeData.length-1);
    return root;
  }

  public static TreeNode createTreeFromSortedArray(Comparable[] sortedTreeData) {
    TreeNode root = createTreeFromSortedArray(sortedTreeData, 0, sortedTreeData.length-1);
    return root;
  }

  private static TreeNode<Comparable> createTreeFromSortedArray(Comparable[] array, int start, int end){
    if(start > end){
      return null;
    }
    int mid =  (start + end) /2;
    TreeNode root = new TreeNode(array[mid], null, null);
    root.setLeftChild(createTreeFromSortedArray(array, start, mid-1));
    root.setRightChild(createTreeFromSortedArray(array, mid+1, end));
    return root;
  }

    private static void inOrder (TreeNode<Comparable> root) {
      if(root != null){
        inOrder(root.getLeftChild());
        System.out.println(root.getData());
        treeDataFromInOrderWalk.add(root.getData());
        inOrder(root.getRightChild());
      }
    }


}
