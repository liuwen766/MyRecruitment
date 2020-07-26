package com.liuwen.effectivejava.Test001_Test010.Test0002;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第2个建议）：当构造方法参数过多时建议用构造器模式
 * @author: Create by Liu Wen at  2020/7/26 15:06
 * ----------------------------------------------------------------------
 **/
public class Test00021 {

  public static void main(String[] args) {

    Box box = new Box("red",3,4,5,10);

  }

  public static class Box {

    private String color;  //盒子颜色     required
    private int width;     //盒子宽度     optional
    private int height;    //盒子高度     optional
    private int weight;    //盒子重量     optional
    private int length;    //盒子长度     optional

    public Box(String color){
      this(color,0);
    }

    public Box(String color,int length){
      this(color,length,0);
    }

    public Box(String color,int length, int width) {
      this(color,length,width,0);
    }

    public Box(String color,int length, int width,int weight) {
      this(color,length,width,weight,0);
    }

    public Box(String color,int length, int width, int height, int weight) {
      this.length = length;
      this.width = width;
      this.height = height;
      this.weight = weight;
      this.color = color;
    }
  }



}
