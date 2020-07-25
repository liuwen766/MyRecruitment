package com.liuwen.设计模式.factory.simple1;

/**
 * ----------------------------------------------------------------------
 *
 * @description:   也是静态工厂
 * @author: Create by Liu Wen at  2020/7/25 10:10
 * ----------------------------------------------------------------------
 **/
public class Test {
  public static void main(String[] args) {
    //new
    Tesla tesla = new Tesla();
    Wuling wuling = new Wuling();
    tesla.name();
    wuling.name();

    System.out.println("-------------");

    //工厂模式 方法1
    Car wuling1 = CarFactory.getCar("wuling");
    wuling.name();
    CarFactory.getCar("tesla").name();
    System.out.println("--------------");
    //方法2
    CarFactory.getWuling().name();
    CarFactory.getTesla().name();
  }
}
