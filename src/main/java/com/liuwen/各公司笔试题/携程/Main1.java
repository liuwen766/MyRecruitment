package com.liuwen.各公司笔试题.携程;

import java.util.Scanner;

/**
 * @description: 携程呼叫中心7×24小时帮助旅客解决在途中的各种问题，为了尽可能提升服务质量，公司希望客服
 * 人数可以满足所有旅客的来电，不用排队等待人工客服。现在提供客服中心所有的通话记录时间，你能算出最少需要多
 * 少名客服吗？
 * <p>
 * 输入一个n表示要输入的通话记录个数，接下来输入n行，每行为逗号相隔的两个整数，两个数字分别
 * 代表呼入时间和挂断时间的时间戳。 举例：10,30，表示[10,30)，代表第10秒呼入，第30秒已经挂断，即第30秒可
 * 以接入新的来电； 每一行都是一条通话记录，通话记录已经按呼入时间由小到大排序；
 * 输入样例：
 * 6
 * 0,30
 * 0,50
 * 10,20
 * 15,30
 * 20,50
 * 20,65
 * 输出一个整数；
 * 代表最少需要多少客服，可以满足所有旅客来电不用等待。
 * 输出样例：
 * 5
 * @author: Liu Wen
 * @create: 2020-04-01 19:03
 **/
public class Main1 {


    static int calcMinStaff() {
        return 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        res = calcMinStaff();
        System.out.println(String.valueOf(res));
    }
}
