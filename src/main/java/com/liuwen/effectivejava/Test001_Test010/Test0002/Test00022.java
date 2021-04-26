package com.liuwen.effectivejava.Test001_Test010.Test0002;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第2个建议）：当构造方法参数过多时建议用构造器模式
 * @author: Create by Liu Wen at  2020/7/26 15:06
 * ----------------------------------------------------------------------
 **/
public class Test00022 {

    public static void main(String[] args) {
        Box box = new Box();
        box.setColor("red");
        box.setLength(3);
        box.setWidth(4);
        box.setHeight(5);
        box.setWeight(10);
    }

    public static class Box {

        private String color = "red"; //盒子颜色
        private int length = 0;       //盒子长度
        private int width = 0;        //盒子宽度
        private int height = 0;       //盒子高度
        private int weight = 0;       //盒子重量

        public Box() {
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

}
