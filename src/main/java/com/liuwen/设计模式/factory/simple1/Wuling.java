package com.liuwen.设计模式.factory.simple1;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/25 10:09
 * ----------------------------------------------------------------------
 **/
public class Wuling implements Car{

  private String string;

  public Wuling() {
  }

  public Wuling(String string) {
    this.string = string;
  }

  @Override
  public void name() {
    System.out.println("五菱宏光");
  }
}
