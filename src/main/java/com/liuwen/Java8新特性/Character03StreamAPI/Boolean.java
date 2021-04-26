package com.liuwen.Java8新特性.Character03StreamAPI;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输出一个数：");
        int a = input.nextInt();
        int b = ((a < 0) == true ? 1 : 0) + ((a < 10) == true ? 1 : 0) + ((a < 20) == true ? 1 : 0) + ((a < 30) == true ? 1 : 0);
        switch (b) {
            case 0:
                System.out.println("a>=30");
                break;
            case 1:
                System.out.println("20<=a<30");
                break;
            case 2:
                System.out.println("10<=a<20");
                break;
            case 3:
                System.out.println("0<=a<10");
                break;
            case 4:
                System.out.println("a<0");
                break;
        }
    }
}