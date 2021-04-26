package com.liuwen.MyCSDN.比较器排序;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: 在实际开发中，遇到当元素的类型实现了Comparable 接口，但是它的排序方式不适合当前的操作；
 * 或者根本没有实现Comparable接口，而又不方便修改代码。那么可以考虑使用 Comparator 的对象进行排序。
 * @author: Liu Wen
 * @create: 2020-03-14 10:28
 **/
public class Test_Comparator {

    @Test
    public void test() {
        Fruit_Comparator[] arr = new Fruit_Comparator[5];
        arr[0] = new Fruit_Comparator("苹果", 12);
        arr[1] = new Fruit_Comparator("香蕉", 5);
        arr[2] = new Fruit_Comparator("橘子", 3);
        arr[3] = new Fruit_Comparator("菠萝蜜", 25);
        arr[4] = new Fruit_Comparator("梨子", 5);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Fruit_Comparator>() {  //自定义比较器
            @Override
            public int compare(Fruit_Comparator o1, Fruit_Comparator o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
