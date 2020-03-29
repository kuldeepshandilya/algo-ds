package com.practice.algods.tree;

import com.practice.algods.sorting.QuickSort;
import com.practice.algods.sorting.TestData;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BSTTest {
  private Comparable[] array;
  private BST bst;
  public BSTTest() {
    array = TestData.randomArray(TestData.size, TestData.range);
    bst = new BST();
  }


  @Test
  public void testInorder(){
    List<Comparable> sortedList = TreeUtil.sortedDataFromInOrderWalk(array);
    int i = 0;
    while(i < sortedList.size()-1){
      System.out.print(sortedList.get(i)+" ");
      Assert.assertTrue(sortedList.get(i).compareTo(sortedList.get(i + 1)) <= 0);
      i++;
    }
  }

  @Test
  public void testSearch() {
    Comparable existingData = array[40], nonExistingData = (TestData.range + 1);
    TreeNode<Comparable> root = TreeUtil.createTreeFromSortedArray(new QuickSort().sort(array));
    Assert.assertTrue((bst.search(root, existingData).getData().compareTo(existingData) == 0));
    TreeNode<Comparable> notFound = bst.search(root, nonExistingData);
    Assert.assertTrue(notFound == null);
  }

}
