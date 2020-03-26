package com.practice.algods.sorting;

public class BubbleSort implements SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
    selectionSort(array);
    return array;
  }

  /**
   * Select minimum of the array, swap it with 1st element, repeat same for 2nd element
   * @param array
   * @return
   */
  private void selectionSort(Comparable[] array) {
    for(int i = 0; i< array.length-1; i++) {
      for(int j = i+1; j< array.length; j++) {
        if(array[i].compareTo(array[j]) > 0) {
          swap(array,i , j);
        }
      }
    }
  }

  private void swap(Comparable[] array, int left, int right) {
    Comparable leftNum = array[left];
    array[left] = array[right];
    array[right] = leftNum;
  }
}
