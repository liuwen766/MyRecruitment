package com.liuwen.effectivejava.Test001_Test010.Test0004;

/**
 * ----------------------------------------------------------------------
 *
 * @description:   定义一个资源类；实现AutoCloseable接口的类可以作为资源
 * @author: Create by Liu Wen at  2020/7/26 16:45
 * ----------------------------------------------------------------------
 **/
public class Resource1 implements AutoCloseable {

  public void sayHello() {
    System.out.println("Resource1 say hello");
  }

  @Override
  public void close() throws Exception {
    System.out.println("Resource1 is closed");
  }
}
