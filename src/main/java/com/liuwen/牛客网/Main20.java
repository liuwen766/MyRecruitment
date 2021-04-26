package com.liuwen.牛客网;

import java.util.Iterator;
import java.util.Stack;

/**
 * @description: 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 * @author: Liu Wen
 * @create: 2020-03-09 23:07
 **/
public class Main20 {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
        push(3);
        push(1);
        push(2);
        push(5);
        System.out.println("top():" + top());  //查看栈顶
        System.out.println("min():" + min());  //拿出最小值
    }

    /**
     * @Description: 方法1：使用迭代器，找出最小值
     * @param
     * @return int
     * @date 20.3.9 23:17
     */
    static Stack<Integer> stack = new Stack<>();

    public static void push(int node) {
        stack.push(node);
    }

    public static void pop() {
        stack.pop();
    }

    public static int top() {
        return stack.peek();
    }

    public static int min() {
        int min = stack.peek();
        Iterator iterator = stack.iterator();  //使用迭代器，找出最小值
        while (iterator.hasNext()) {
            int temp = (Integer) iterator.next();
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }

    /**
     * @Description: 应用一个辅助栈：
     * 入栈，如果A栈的压入比B栈压入大，B栈不压，，，，小于等于，AB栈同时压入。
     * 出栈，如果AB栈顶元素不等，A出，B不出。
     * 这样，B栈就会始终装有最小值。
     * @param node
     * @return
     * @date 20.3.9 23:18
     */
    static Stack<Integer> stackA = new Stack<>();
    static Stack<Integer> stackB = new Stack<>();          //辅助栈

    public static void push1(int node) {
        stackA.push(node);
        if (stackB.isEmpty()) {
            stackB.push(node);
        } else {
            if (node <= stackB.peek()) {
                stackB.push(node);
            }
        }
    }

    public static void pop1() {
        if (stackA.peek() == stackB.peek()) {
            stackB.pop();
        }
        stackA.pop();
    }

    public static int top1() {
        return stackA.peek();
    }

    public static int min1() {
        return stackB.peek();
    }

}
