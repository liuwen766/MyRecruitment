package com.liuwen.牛客网;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author: Liu Wen
 * @create: 2020-03-11 18:34
 **/
public class Main28 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5, 2, 3};
        int ans = MoreThanHalfNum_Solution3(array);
        System.out.println(ans);
    }

    /**
     * @param array times        次数
     * @return int
     * @Description: 方法4：方法3的进阶    candidate    候选数
     * @date 20.3.11 18:37
     */
    public static int MoreThanHalfNum_Solution3(int[] array) {
        int candidate = 0;
        int times = 0;     // {1,2,3,2,4,2,5,2,3}
        for (int i = 0; i < array.length; i++) {
            if (times == 0) {
                candidate = array[i];
                times++;
            } else {
                if (candidate == array[i]) {
                    times++;
                } else {
                    times--;
                }
            }
        }
        // 判断candidate出现的次数是不是超过了一半。
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == candidate) {
                count++;
            }
        }
        if (count > array.length / 2) {   //超出一半
            return candidate;
        }
        return 0;
    }

    /**
     * @param array
     * @return int
     * @Description: 方法3： 双指针；
     * 两两删除不等数字,判断最后剩下的数字出现的次数是不是超过了一半。
     * @date 20.3.11 18:36
     */
    public static int MoreThanHalfNum_Solution2(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayIndex = new ArrayList<>();
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        while (left < right) {
            if (arrayList.get(left) != arrayList.get(right)) {
                arrayIndex.add(arrayList.get(left));         //两两不等数字记下来
                arrayIndex.add(arrayList.get(right));
                left++;
                right--;
            } else {
                left++;
            }
        }
        for (int i = 0; i < arrayIndex.size(); i++) {
            arrayList.remove(arrayIndex.get(i));            //两两删除不等数字
        }
        //如果arrayList有值，判断最后剩下的数字出现的次数是不是超过了一半
        if (arrayList.size() > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == arrayList.get(0)) {
                    count++;
                }
            }
            if (count > array.length / 2) {     //超出一半
                return arrayList.get(0);
            }
        }
        return 0;
    }

    /**
     * @param array
     * @return int
     * @Description: 方法2：HashMap存储
     * @date 20.3.11 18:35
     */
    public static int MoreThanHalfNum_Solution1(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])) {
                int value = hashMap.get(array[i]);
                value++;
                hashMap.put(array[i], value);
            } else {
                hashMap.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > array.length / 2) {       //如果有value值，即某个数出现的次数大于数组的一半
                return entry.getKey();                 //则返回key
            }
//            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        return 0;
    }

    /**
     * @param array
     * @return int
     * @Description: 方法1：排序，中间的数一定是
     * @date 20.3.11 18:34
     */
    public static int MoreThanHalfNum_Solution(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int mid = array[array.length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == mid) {
                count++;
            }
        }
        if (count > array.length / 2) {   //超出一半
            return mid;
        }
        return 0;
    }
}
