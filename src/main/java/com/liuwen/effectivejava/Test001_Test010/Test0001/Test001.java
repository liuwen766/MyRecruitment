package com.liuwen.effectivejava.Test001_Test010.Test0001;

import com.liuwen.effectivejava.Ensemble;
import com.liuwen.redis.pojo.User;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.*;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.springframework.boot.autoconfigure.quartz.JobStoreType.JDBC;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第1个建议）：考虑使用静态工厂方法替代构造方法
 * @author: Create by Liu Wen at  2020/7/26 15:00
 * ----------------------------------------------------------------------
 **/
public class Test001 {

  public static void main(String[] args) {

    //构造方法：
    Boolean bool1 = new Boolean(true);
    Boolean bool4 = new Boolean(true);
    System.out.println("bool1.equals(bool4)="+(bool1 == bool4));

    //静态工厂方法
    Boolean bool2 = Boolean.valueOf(true);
    Boolean bool3= Boolean.valueOf(true);

    //优点①：与构造方法不同，它们是有名字的。(素数)
    BigInteger bigInteger1 = new BigInteger(3,3,new Random());
    BigInteger bigInteger2 = BigInteger.probablePrime(3, new Random());
    System.out.println(bigInteger1+" "+bigInteger2);

    //优点②：与构造方法不同，它们不需要每次调用时都创建一个新对象。
    System.out.println("bool2.equals(bool3)="+(bool2 == bool3));

    //优点③：与构造方法不同，它们可以返回其返回类型的任何子类型的对象。
    List<Integer> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    List<Integer> list1 = Collections.synchronizedList(list);
    Set<Integer> set1 = Collections.synchronizedSet(set);

    //优点④：返回对象的类可以根据输入参数的不同而不同。

//    EnumSet.noneOf();


//    //优点⑤：在编写包含该方法的类时，返回的对象的类不需要存在。
//    DriverManager.registerDriver();      //服务注册
//    Connection connection = DriverManager.getConnection();   //服务访问


  }


}
