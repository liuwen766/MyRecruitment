package com.liuwen.牛客网;

import java.util.Stack;

/**
 * @description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author: Liu Wen
 * @create: 2020-03-07 13:56
 **/
public class Main5 {
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.print(pop() + " ");
        System.out.print(pop() + " ");
        push(4);
        System.out.print(pop() + " ");
        push(5);
        System.out.print(pop() + " ");
        System.out.print(pop() + " ");
    }

    // 分析→   栈：先进后出        队列：先进后出
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * @param node
     * @return void
     * @Description: 压栈操作     入stack1
     * @date 20.3.7 14:13
     */
    public static void push(int node) {
        stack1.push(node);
    }

    /**
     * @param
     * @return int
     * @Description: 判断栈stack2是否为空，如果为空，则将栈stack1中所有元素pop，并push进栈stack2，
     * 栈stack2出栈；如果不为空，栈stack2直接出栈。
     * @date 20.3.7 14:13
     */
    public static int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
