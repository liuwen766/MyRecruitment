package com.liuwen.effectivejava.Test001_Test010.Test0003;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第6个建议）： 避免创建不必要的对象
 * @author: Create by Liu Wen at  2020/7/26 15:26
 * ----------------------------------------------------------------------
 **/
public class Test003 {
  public static void main(String[] args) {

    Instant start1 = Instant.now();
    Integer sum1 = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      sum1 +=i;
    }
    System.out.println(sum1);
    Instant end1 = Instant.now();
    System.out.println("时间差1："+ Duration.between(start1,end1).toMillis()+"毫秒");
//*************************************************************************************//
    Instant start2 = Instant.now();
    int sum2 = 0;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      sum2 +=i;
    }
    System.out.println(sum2);
    Instant end2 = Instant.now();
    System.out.println("时间差2："+Duration.between(start2,end2).toMillis()+"毫秒");
  }

}
