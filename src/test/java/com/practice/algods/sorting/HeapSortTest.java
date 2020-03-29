package com.practice.algods.sorting;

import org.junit.Assert;
import org.junit.Test;

public class HeapSortTest {
  private SortAlgorithm<Comparable> heapSort;

  public  HeapSortTest(){
    this.heapSort = new HeapSort();
  }

  @Test
  public void testSort() {
    Comparable[] array = TestData.randomArray(TestData.size, TestData.range);
    Comparable[] sortedArray = heapSort.sort(array);
    int i = 0;
    while(i < sortedArray.length-1){
      System.out.print(sortedArray[i]+" ");
      Assert.assertTrue(sortedArray[i].compareTo(sortedArray[i + 1]) <= 0);
      i++;
    }
  }
}
