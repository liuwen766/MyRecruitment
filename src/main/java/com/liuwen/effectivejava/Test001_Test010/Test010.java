package com.liuwen.effectivejava.Test001_Test010;

import java.util.Comparator;

/**
 * ----------------------------------------------------------------------
 *
 * @description:   （第43个建议）：方法引用优先于Lambda
 * @author: Create by Liu Wen at  2020/7/26 19:42
 * ----------------------------------------------------------------------
 **/
public class Test010 {

  /**
   * @Desc Lambada表达式
   * @param null
   * @return
   */
  Comparator<Integer> comparator2 = (o1, o2)->Integer.compare(o1,o2);


  /**
   * @Desc 方法引用
   * @param null
   * @return
   */
  Comparator<Integer> comparator3 = Integer::compareTo;

}
