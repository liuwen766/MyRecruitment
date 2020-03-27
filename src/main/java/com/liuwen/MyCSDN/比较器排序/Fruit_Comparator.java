package com.liuwen.MyCSDN.比较器排序;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-14 10:33
 **/
public class Fruit_Comparator {
    String name;
    double price;

    public Fruit_Comparator(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
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
}
