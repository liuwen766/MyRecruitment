package com.liuwen.effectivejava.Test001_Test010.Test0005;

import java.util.HashSet;
import java.util.Set;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第11个建议）：重写equals 方法时同时也要重写hashcode 方法
 * @author: Create by Liu Wen at  2020/7/26 15:46
 * ----------------------------------------------------------------------
 **/
public class Test0005 {

  public static void main(String[] args) {
    User user1 = new User("test");
    User user2 = new User("test");
    Set<User> set1 = new HashSet<>();
    Set<User> set2 = new HashSet<>();
    set1.add(user1);
    set2.add(user2);
    System.out.println(set1.equals(set2));


    System.out.println("--------------");
    Set<Integer> set3 = new HashSet<>();
    Set<Integer> set4 = new HashSet<>();
    set3.add(10);set4.add(10);
    System.out.println(set3.equals(set4));

  }

}
