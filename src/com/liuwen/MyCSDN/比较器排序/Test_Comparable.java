package com.liuwen.MyCSDN.比较器排序;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:    Comparable 接口强行对实现它的每个类的对象进行整体排序
 * @author: Liu Wen
 * @create: 2020-03-14 10:27
 **/
public class Test_Comparable {

    @Test
    public void Test(){
        Fruit_Comparable[] arr = new Fruit_Comparable[5];
        arr[0] = new Fruit_Comparable("苹果",12);
        arr[1] = new Fruit_Comparable("香蕉",5);
        arr[2] = new Fruit_Comparable("橘子",3);
        arr[3] = new Fruit_Comparable("菠萝蜜",25);
        arr[4] = new Fruit_Comparable("梨子",5);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
