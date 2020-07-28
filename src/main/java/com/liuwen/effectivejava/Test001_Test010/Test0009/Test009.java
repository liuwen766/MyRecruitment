package com.liuwen.effectivejava.Test001_Test010.Test0009;

import java.util.Comparator;

/**
 * ----------------------------------------------------------------------
 *
 * @description:   （第42个建议）：Lambda优先于匿名类
 * @author: Create by Liu Wen at  2020/7/26 19:42
 * ----------------------------------------------------------------------
 **/
public class Test009 {

   /**
    * @Desc 匿名内部类
    * @param null
    * @return
    */
  Comparator<Integer> comparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
      return Integer.compare(o1,o2);
    }
  };
  /**
   * @Desc Lambada表达式
   * @param null
   * @return
   */
  Comparator<Integer> comparator2 = (o1,o2)->Integer.compare(o1,o2);


}
