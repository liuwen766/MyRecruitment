package com.liuwen.牛客网;

import java.util.ArrayList;

/**
 * @description: 调整数组顺序使奇数位于偶数前面
 * @author: Liu Wen
 * @create: 2020-03-08 15:32
 **/
public class Main13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        reOrderArray1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * @param array 要想保证原有次序，则只能顺次移动或相邻交换。
     * @return void
     * @Description: 方法3：类似冒泡排序 （稳定）
     * @date 20.3.8 15:58
     */
    public static void reOrderArray2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * @param array 在遍历的过程中，将奇数移动到前面已经拍好的奇数序列中即可
     * @return void
     * @Description: 方法2： 类似插入排序（稳定）
     * @date 20.3.8 15:47
     */
    public static void reOrderArray1(int[] array) {
        int m = array.length;
        int count = 0;                   //记录已经摆好位置的奇数的个数
        for (int i = 0; i < m; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > count) {    //将奇数移动到前面已经拍好的奇数序列中即可
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                    j--;
                }
                count++;
            }
        }
    }

    /**
     * @param array
     * @return void
     * @Description: 方法：1.定义两个arrayList数组，分别用于装奇数和偶数
     * @date 20.3.8 15:35
     */
    public static void reOrderArray(int[] array) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                arrayList1.add(array[i]);
            } else {
                arrayList2.add(array[i]);
            }
        }
//        System.out.println("arrayList1:"+arrayList1);
//        System.out.println("arrayList2:"+arrayList2);
        for (int i = 0; i < arrayList1.size(); i++) {
            arrayList.add(arrayList1.get(i));
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList.add(arrayList2.get(i));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
    }
}
