package com.practice.algods.sorting;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

  private SortAlgorithm<Comparable> quickSort;

  public QuickSortTest(){
    quickSort = new QuickSort();
  }

  @Test
  public void testSort() {
    Comparable[] array = new Integer[] {3,5,4,9,8, -1};
    Comparable[] sortedArray = quickSort.sort(array);
    int i = 0;
    while(i < sortedArray.length-1){
      System.out.print(sortedArray[i]+" ");
      Assert.assertTrue(sortedArray[i].compareTo(sortedArray[i + 1]) < 0);
      i++;
    }
  }

}
