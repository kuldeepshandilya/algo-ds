package com.practice.algods.tree;

import com.practice.algods.sorting.TestData;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BSTTest {

  @Test
  public void testInorder(){
    Comparable[] array = TestData.randomArray(TestData.size, TestData.range);
    List<Comparable> sortedList = TreeUtil.sortedDataFromInOrderWalk(array);
    int i = 0;
    while(i < sortedList.size()-1){
      System.out.print(sortedList.get(i)+" ");
      Assert.assertTrue(sortedList.get(i).compareTo(sortedList.get(i + 1)) <= 0);
      i++;
    }
  }
}
