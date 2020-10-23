package com.liuwen.Java8新特性.Character03StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: Test区间.java
 * <p>Desc: TODO
 * <p>
 *
 * @author Create by liuwen at  2020/10/23 14:47
 * <p>
 * ----------------------------------------------------------------------
 **/
public class Test区间 {
    public static void main(String[] args) {

        List<Double> billingCount = new ArrayList<>(8);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("输出一个数：");
            double successCount = input.nextDouble();
            int success = ((successCount <= 10) ? 1 : 0) + ((successCount <= 500) ? 1 : 0) + ((successCount <= 5000) ? 1 : 0) + ((successCount <= 20000) ? 1 : 0) + ((successCount <= 50000) ? 1 : 0);
            System.out.println(success);
            switch (success) {
                case 5:
                    Double billing0 = 0.0;
                    billingCount.add(billing0);
                    break;
                case 4:
                    Double billing1 = 0.79;
                    billingCount.add(billing1);
                    break;
                case 3:
                    Double billing2 = 48.0;
                    billingCount.add(billing2);
                    break;
                case 2:
                    Double billing3 = 120.00;
                    billingCount.add(billing3);
                    break;
                case 1:
                    Double billing4 = 216.00;
                    billingCount.add(billing4);
                    break;
                default:
                    Double billing5 = 480.00;
                    billingCount.add(billing5);
                    break;
            }
            System.out.println(billingCount);
        }

    }

}
