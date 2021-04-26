package com.liuwen.MyCSDN.比较器排序;

/**
 * @description: 在自定义类中实现Comparable接口，重写comparaTo()方法，（耦合度高，在类中修改）
 * @author: Liu Wen
 * @create: 2020-03-14 10:33
 **/
public class Fruit_Comparable implements Comparable<Fruit_Comparable> {
    private String name;
    private double price;

    public Fruit_Comparable(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Fruit_Comparable fruit) {
        if (this.price > fruit.price) {
            return 1;
        } else if (this.price < fruit.price) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
