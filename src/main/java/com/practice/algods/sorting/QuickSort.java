package com.practice.algods.sorting;

public class QuickSort implements SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
     quickSort(array, 0, array.length - 1);
     return array;
  }

  private void quickSort(Comparable[] array, int low, int high) {
    if(low < high) {
      int pivot = partition(array, low, high);
      quickSort(array, low, pivot - 1);
      quickSort(array, pivot + 1, high);
    }
  }


  private int partition(Comparable[] array, int left, int right) {
    Comparable pivot = array[left];
    int lb = left, ub = right;
    while(lb < ub){
        while (array[lb].compareTo(pivot) <= 0 && lb < array.length-1) { //lb++ used to go beyond array size hence needed to add this check
          lb++;
        }
        while (array[ub].compareTo(pivot) > 0 && ub > 0) {
          ub--;
        }
        if (lb < ub && array[lb].compareTo(array[ub]) > 0) {
          swap(array, lb, ub);
        }

    }
    swap(array, left, ub); //Swap pivot element with 'ub' which now points to a number less thn pivot
    return ub;
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
