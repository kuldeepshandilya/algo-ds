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

  @Test
  public void testInsert() {
    Comparable  nonExistingData = (TestData.range + 1);
    TreeNode<Comparable> root = TreeUtil.createTree(new QuickSort().sort(array));
    TreeNode<Comparable> searchResult = bst.search(root, nonExistingData);
    Assert.assertTrue((searchResult == null));
    bst.insert(root, nonExistingData);
    searchResult = bst.search(root, nonExistingData);
    Assert.assertTrue(searchResult != null);
    Assert.assertTrue(nonExistingData.compareTo(searchResult.getData()) == 0);
  }

  @Test
  public void testDelete() {
    Comparable  nonExistingData1 = (TestData.range + 1), nonExistingData2 = (TestData.range + 2),nonExistingData3 = (TestData.range + 3);
    TreeNode<Comparable> root = TreeUtil.createTree(new QuickSort().sort(array));
    TreeNode<Comparable> searchResult = bst.search(root, nonExistingData1);
    Assert.assertTrue((searchResult == null));
    searchResult = bst.search(root, nonExistingData2);
    Assert.assertTrue((searchResult == null));
    searchResult = bst.search(root, nonExistingData3);
    Assert.assertTrue((searchResult == null));

    bst.insert(root, nonExistingData1);
    bst.insert(root, nonExistingData2);
    bst.insert(root, nonExistingData3);

    searchResult = bst.search(root, nonExistingData1);
    Assert.assertTrue(searchResult != null);
    searchResult = bst.search(root, nonExistingData2);
    Assert.assertTrue(searchResult != null);
    searchResult = bst.search(root, nonExistingData3);
    Assert.assertTrue(searchResult != null);

    bst.delete(root, nonExistingData1);
    bst.delete(root, nonExistingData2);
    bst.delete(root, nonExistingData3);

    searchResult = bst.search(root, nonExistingData1);
    Assert.assertTrue(searchResult == null);
    searchResult = bst.search(root, nonExistingData2);
    Assert.assertTrue(searchResult == null);
    searchResult = bst.search(root, nonExistingData3);
    Assert.assertTrue(searchResult == null);
  }
}
