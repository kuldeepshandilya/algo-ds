package com.practice.algods.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
  private SortAlgorithm<Comparable> bubbleSort;

  public BubbleSortTest(){
    this.bubbleSort = new BubbleSort();
  }

  @Test
  public void testSort() {
    Comparable[] array = TestData.randomArray(TestData.size, TestData.range); //new Integer[] {3,5,4,9,8, -1};
    Comparable[] sortedArray = bubbleSort.sort(array);
    int i = 0;
    while(i < sortedArray.length-1){
      System.out.print(sortedArray[i]+" ");
      Assert.assertTrue(sortedArray[i].compareTo(sortedArray[i + 1]) <= 0);
      i++;
    }
  }
}
