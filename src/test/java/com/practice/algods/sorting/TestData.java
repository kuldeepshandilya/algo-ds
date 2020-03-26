package com.practice.algods.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestData {

  public static Integer[] randomArray(int size) {
    Random rd = new Random();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(rd.nextInt(200));
    }
    return list.toArray(new Integer[0]);
  }

}
