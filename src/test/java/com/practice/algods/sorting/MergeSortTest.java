package com.practice.algods.sorting;

import com.practice.algods.sorting.MergeSort;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {
  private SortAlgorithm<Comparable> mergeSort;

  public  MergeSortTest(){
    this.mergeSort = new MergeSort();
  }

   @Test
  public void testSort() {
    Comparable[] array = TestData.randomArray(TestData.size, TestData.range);
    Comparable[] sortedArray = mergeSort.sort(array);
    int i = 0;
    while(i < sortedArray.length-1){
      System.out.print(sortedArray[i]+" ");
      Assert.assertTrue(sortedArray[i].compareTo(sortedArray[i + 1]) <= 0);
      i++;
    }
  }
}
