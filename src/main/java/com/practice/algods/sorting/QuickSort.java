package com.practice.algods.sorting;

public class QuickSort implements SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
     quickSort(array, 0, array.length - 1);
     return array;
  }

  private void quickSort(Comparable[] array, int low, int high) {
    int pivot = partition(array, low, high);
    if(low < high) {
      quickSort(array, low, pivot - 1);
      quickSort(array, pivot + 1, high);
    }
  }

  private int partition(Comparable[] array, int left, int right) {
     int pivotIndex = pivotIndex(left, right);
     while(left < right) {
       while(array[left].compareTo(array[pivotIndex]) < 0){
         left++;
       }
       while(array[right].compareTo(array[pivotIndex]) > 0 ){
         right--;
       }
       if(left < right){
          swap(array, left, right);
          left++;
          right--;
       }
     }
     return pivotIndex;
  }

  private void swap(Comparable[] array, int leftIndex, int rightIndex) {
    Comparable left = array[leftIndex];
    array[leftIndex] = array[rightIndex];
    array[rightIndex] = left;
  }

  private int pivotIndex(int low, int high) {
    return low + (high - low)/2;
  }
}
