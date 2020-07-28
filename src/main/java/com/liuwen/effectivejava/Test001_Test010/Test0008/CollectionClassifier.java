package com.liuwen.effectivejava.Test001_Test010.Test0008;

import java.math.BigInteger;
import java.util.*;

/**
 * ----------------------------------------------------------------------
 *
 * @description: 对传入的集合进行分类
 * @author: Create by Liu Wen at  2020/7/28 20:44
 * ----------------------------------------------------------------------
 **/
public class CollectionClassifier {
  public static void main(String[] args) {


  }
  /**
   * @Desc   重载方法一：传入一个Set<?>集合则返回Set
   * @param s
   * @return [s]
   */
  public static String classify(Set<?> s){
    return "Set";
  }
  /**
   * @Desc    重载方法二：传入一个List<?>集合则返回List
   * @param l
   * @return [l]
   */
  public static String classify(List<?> l){
    return "List";
  }
  /**
   * @Desc   重载方法三：传入一个Collection<?>集合则返回Collection
   * @param c
   * @return [c]
   */
  public static String classify(Collection<?> c){
    return "Unknown Collection";
  }
}
