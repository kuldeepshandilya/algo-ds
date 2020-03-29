package com.practice.algods.sorting;

public class HeapSort implements SortAlgorithm<Comparable> {

  @Override
  public Comparable[] sort(Comparable[] array) {
    heapSort(array);
    return array;
  }

  /**
   *
   * @param array
   */
  private void heapSort(Comparable[] array) {
    int mid = array.length/2 - 1;
    for(int i = mid; i>=0; i--){
      heapify(array, i, array.length);
    }
   for(int i = array.length-1; i>0; i--) {
     swap(array, 0, i);
     heapify(array, 0, i);
   }
  }

  private void heapify(Comparable[] array, int outOfOrderElementIndex, int heapSize) {
    int leftChildIndex = leftChildIndex(outOfOrderElementIndex), rightChildIndex = rightChildIndex(
        outOfOrderElementIndex);
    Comparable leftChild = null, rightChild = null;
    if (leftChildIndex < heapSize) {
      leftChild = array[leftChildIndex];
    }
    if (rightChildIndex < heapSize) {
      rightChild = array[rightChildIndex];
    }
    int highetElementIndex = outOfOrderElementIndex;
    if (leftChild != null && leftChild.compareTo(array[outOfOrderElementIndex]) > 0) {
      highetElementIndex = leftChildIndex;
    }
    if (rightChild != null && rightChild.compareTo(array[highetElementIndex]) > 0) {
      highetElementIndex = rightChildIndex;
    }
    if (highetElementIndex != outOfOrderElementIndex) {
      swap(array, highetElementIndex, outOfOrderElementIndex);
      heapify(array, highetElementIndex, heapSize);
    }
  }

  private void swap(Comparable[] array, int left, int right) {
    Comparable leftNum = array[left];
    array[left] = array[right];
    array[right] = leftNum;
  }

  private int leftChildIndex( int parentElementIndex) {
    return 2 * parentElementIndex + 1;
  }

  private int rightChildIndex( int parentElementIndex) {
    return 2*parentElementIndex + 2;
  }
}
