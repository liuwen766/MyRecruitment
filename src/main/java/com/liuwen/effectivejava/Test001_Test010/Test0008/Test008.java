package com.liuwen.effectivejava.Test001_Test010.Test0008;

/**
 * ----------------------------------------------------------------------
 *
 * @description:  （第53个建议）： 慎用可变参数
 * @author: Create by Liu Wen at  2020/7/26 17:29
 * ----------------------------------------------------------------------
 **/
public class Test008 {

  public void foo(){ }
  public void foo(int a){ }
  public void foo(int a,int b){ }
  public void foo(int a,int b,int c){ }
  public void foo(int a,int b,int c,int ... rest){ }

  public static void main(String[] args) {
    System.out.println(1.00-0.60);
    System.out.println(1.00-0.70);
  }
}
