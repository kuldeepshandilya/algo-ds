package com.practice.algods.sorting;

public class MergeSort implements SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
    mergeSort(array,0,array.length-1);
    return array;
  }

  private void mergeSort(Comparable[]  array, int left, int right){
    if(left < right) {
      int middleIndex = left + (right - left) / 2;
      mergeSort(array, left, middleIndex);
      mergeSort(array, middleIndex + 1, right);
      merge(array, left, middleIndex, right);
    }
  }

  private void merge(Comparable[]  array, int left, int middle, int high){
    int size1 = middle-left+1, size2 = high-middle;
    Comparable[] array1 = new Comparable[size1];
    Comparable[] array2 = new Comparable[size2];

    int i = 0, j = 0; //indexes for array1 and array2

    for(i = 0; i < size1; i++)
      array1[i] = array[left + i];
    for(j = 0; j < size2; j++)
      array2[j] = array[middle + 1 + j];

    int k = left;
    i = 0;
    j = 0;
    while(i < size1 && j < size2 ){
      while(i < size1 && j < size2 && array1[i].compareTo(array2[j]) <= 0){
        array[k++] = array1[i++];
      }
      while(i < size1 && j < size2 && array1[i].compareTo(array2[j]) > 0){
        array[k++] = array2[j++];
      }
      if(i >= size1) {
        while(j <size2)
          array[k++] = array2[j++];
      }
      if(j >= size2) {
        while(i < size1)
          array[k++] = array1[i++];
      }
    }
  }

  private void swap(Comparable[] array, int left, int right) {
    Comparable leftNum = array[left];
    array[left] = array[right];
    array[right] = leftNum;
  }

}
