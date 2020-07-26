package com.liuwen.effectivejava.Test001_Test010;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第1个建议）：考虑使用静态工厂方法替代构造方法
 * @author: Create by Liu Wen at  2020/7/26 15:00
 * ----------------------------------------------------------------------
 **/
public class Test001 {

  public static void main(String[] args) {
    Boolean bool = Boolean.valueOf(true);
    System.out.println(bool);
  }
  /**
   * @Desc  静态工厂方法替代构造方法
   * @param b
   * @return [b]
   */
  public static Boolean valueOf(boolean b) {
    return (b ? TRUE : FALSE);
  }

}
