package com.practice.algods.sorting;

public class SelectionSort implements  SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
    selectionSort(array);
    return array;
  }

  /**
   * During each iteration, swap each out of order pair. Do it n times.
   * @param array
   */
  private void selectionSort(Comparable[] array) {
    for(int i = 0; i<array.length; i++){
      for(int j = 0; j <array.length-1; j++){
        if(array[j].compareTo(array[j+1]) > 0){
          swap(array, j, j+1);
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
