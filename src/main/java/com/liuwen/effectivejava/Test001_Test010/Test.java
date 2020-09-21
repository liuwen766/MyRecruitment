package com.liuwen.effectivejava.Test001_Test010;

import java.util.Scanner;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/27 9:18
 * ----------------------------------------------------------------------
 **/
public class Test {
  public static void main(String[] args) {
    String string = new Scanner(System.in).toString();
    String s = "1";
    if(s.equals(string)){
      System.out.println("魔法值");
    }

    String aStatic = InnerTest.STATIC;
    System.out.println(aStatic);

    InnerTest innerTest = new InnerTest();
    String aStatic1 = innerTest.STATIC;
    System.out.println("我是对象，我可以调用→"+aStatic1);

  }

  static class InnerTest{
    public static final String STATIC = "我是静态变量";
  }

}
