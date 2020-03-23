package com.practice.algods.sorting;

public class InsertionSort implements SortAlgorithm<Comparable> {
  /**
   * Reference array to reason the logic -  3,5,4,9,8
   * Consider array to be divided into two parts - sorted left side and unsorted right side - with first element(array[0]) being only element in initial sorted left side.
   * Starting from 2nd element to the last element(First loop),
   *      keep comparing this number to the left (Second loop) until you find an element less than this element. Keep shifting numbers to right.
   *            Put this out of order element in its correct place
   * @param array
   * @return
   */
  @Override
  public Comparable[] sort(Comparable[] array) {
    for(int j = 1; j<array.length; j++) {
      int i = j-1;
      Comparable num = array[j];
      while(i>=0 && array[i].compareTo(num) > 0){
        array[i+1] = array[i];
        i--;
      }
      array[i+1] = num;
    }
    return array;
  }
}

