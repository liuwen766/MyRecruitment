package com.liuwen.effectivejava.Test001_Test010;

import java.util.Arrays;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/26 17:11
 * ----------------------------------------------------------------------
 **/
public class Test006 {
  public static void main(String[] args) {
    ArrayCopy<Integer> arrayCopy = new ArrayCopy<>();
    Integer[] integers = {1,2,3,4,5};
    Integer[] integers1 = arrayCopy.copyArray(integers);
    for (Integer integer:
         integers1) {
      System.out.println(integer);
    }
  }

}
  @SuppressWarnings("unchecked")
  class ArrayCopy <T>{

    public T[] copyArray(T[] a){
      int arraySize = 100;
      //复制并扩容
      if (a.length < arraySize){
        //由于T[]是不可预测参数，所以会报错

        T[] result = (T[]) Arrays.copyOf(a, arraySize,a.getClass());
        return result;
      }
      return null;
    }
  }

