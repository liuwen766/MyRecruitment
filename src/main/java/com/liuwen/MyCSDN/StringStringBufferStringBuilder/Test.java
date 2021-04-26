package com.liuwen.MyCSDN.StringStringBufferStringBuilder;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-18 12:29
 **/
public class Test {
    public static void main(String[] args) {
        String string = "abc";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuffer.append("abc");   //synchronized
        /*
        public synchronized StringBuffer append(String str) {
        toStringCache = null;
        super.append(str);
        return this;
        }
         */
        stringBuilder.append("abc");
        /*
        public StringBuilder append(String str) {
        super.append(str);
        return this;
        }
         */
        System.out.println(string == stringBuffer.toString());
        System.out.println(stringBuffer.toString() == stringBuilder.toString());
        System.out.println(string.equals(stringBuffer.toString()));
        System.out.println(stringBuffer.toString().equals(stringBuilder.toString()));

    }

}
