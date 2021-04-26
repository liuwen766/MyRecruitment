package com.liuwen.effectivejava.Test001_Test010.Test0002;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第2个建议）：当构造方法参数过多时建议用构造器模式
 * @author: Create by Liu Wen at  2020/7/26 15:06
 * ----------------------------------------------------------------------
 **/
public class Test0002 {

    public static void main(String[] args) {

        //默认操作
        Box box1 = new Box.Builder("red").build();

        //定制化操作
        Box box2 = new Box.Builder("red").length(10).width(10).height(10).weight(10).build();

        System.out.println(box1.toString());

        System.out.println(box2.toString());
    }

    public static class Box {

        private int length = 0;          //盒子长度
        private int width = 0;           //盒子宽度
        private int height = 0;          //盒子高度
        private int weight = 0;          //盒子重量
        private String color = "red";    //盒子颜色

        public static class Builder {

            private int length;
            private int width;
            private int height;
            private int weight;
            private String color;

            public Builder(String color) {
                this.color = color;
            }

            public Builder length(int length) {
                this.length = length;
                return this;
            }

            public Builder width(int width) {
                this.width = width;
                return this;
            }

            public Builder height(int height) {
                this.height = height;
                return this;
            }

            public Builder weight(int weight) {
                this.weight = weight;
                return this;
            }

            public Box build() {
                return new Box(this);
            }
        }

        private Box(Builder builder) {
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
