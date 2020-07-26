package com.liuwen.effectivejava.Test001_Test010;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第2个建议）：当构造方法参数过多时建议用构造器模式
 * @author: Create by Liu Wen at  2020/7/26 15:06
 * ----------------------------------------------------------------------
 **/
public class Test002 {

  public static void main(String[] args) {
    Box box = new Box.Builder(30, 30).color("red").weight(20).build();
    System.out.println(box.toString());
  }

  public static class Box {
    private int height;
    private int width;
    private int weight;
    private String color;


    public static class Builder{
      private int height;
      private int width;
      private int weight;
      private String color;

      public Builder(int height, int width){
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
      height = builder.height;
      weight = builder.weight;
      width = builder.width;
      color = builder.color;
    }

    @Override
    public String toString() {
      return "Box{" +
          "盒子高=" + height +
          ", 宽=" + width +
          ", 重=" + weight +
          ", 颜色='" + color + '\'' +
          '}';
    }
  }



}
