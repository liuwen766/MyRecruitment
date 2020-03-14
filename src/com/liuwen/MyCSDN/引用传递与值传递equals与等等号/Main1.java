package com.liuwen.MyCSDN.引用传递与值传递equals与等等号;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-13 11:05
 **/
public class Main1 {
    public static void main(String[] args){
        Integer a = 1;
        Integer b = 1;
        System.out.println("a==b:"+(a==b));                      //-128~127都是常量池，所以比较地址返回true
        System.out.println("a.equals(b):"+(a.equals(b)));        //equals() 已经重写，比较的是值是否相等
        System.out.println("==============================================");
        Integer a1 = 128;
        Integer b1 = 128;
        System.out.println("a1==b1:"+(a1==b1));                   //比较地址
        System.out.println("a1.equals(b1):"+(a1.equals(b1)));    //比较值
        System.out.println("==============================================");
        String s1 = "abc";
        String s2 = s1;
        String s3 = new String("abc");                  //只要new 就是新地址
        String s4 = s3;
        System.out.println("System类本地方法hashCode()："+System.identityHashCode(s1));         //获取根据地址的哈希值（本地方法）
        System.out.println("重写hashCode():"+s1.hashCode());     //重写的哈希值
        System.out.println(System.identityHashCode(s2));
        System.out.println("------------------");
        System.out.println("s1==s2:"+(s1==s2));                  //比较地址
        System.out.println("s1==s3:"+(s1==s3));                  //比较地址
        System.out.println("s1==s4:"+(s3==s4));                  //比较地址
        System.out.println("s1==s4:"+(s1==s4));                  //比较地址
        System.out.println("s1.equals(s2):"+(s1.equals(s3)));    //比较值

    }
}
