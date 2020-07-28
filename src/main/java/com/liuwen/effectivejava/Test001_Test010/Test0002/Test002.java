package com.liuwen.effectivejava.Test001_Test010.Test0002;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第2个建议）：当构造方法参数过多时建议用构造器模式
 * @author: Create by Liu Wen at  2020/7/26 15:06
 * ----------------------------------------------------------------------
 **/
public class Test002 {

  public static void main(String[] args) {

    Box box = new Box.Builder(30, 40,50).color("red").weight(20).build();

    System.out.println(box.toString());
  }

  public static class Box {

    private int length;   //盒子长度
    private int width;    //盒子宽度
    private int height;   //盒子高度
    private int weight;   //盒子重量
    private String color; //盒子颜色

    public static class Builder{

      private int length;
      private int width;
      private int height;
      private int weight;
      private String color;

      public Builder(int length,int width,int height){
        this.length = length;
        this.height = height;
        this.width = width;
      }

      public Builder color(String color){
        this.color = color;
        return this;
      }

      public Builder weight(int weight){
        this.weight = weight;
        return this;
      }

      public Box build(){
        return new Box(this);
      }
    }

    private Box(Builder builder){
      length = builder.length;
      height = builder.height;
      weight = builder.weight;
      width = builder.width;
      color = builder.color;
    }

    @Override
    public String toString() {
      return "Box{" +
          "长:" + length +
          ", 宽:" + width +
          ", 高:" + height +
          ", 重:" + weight +
          ", 颜色:'" + color + '\'' +
          '}';
    }
  }



}
