package com.liuwen.effectivejava.Java8StreamAPI;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:   测试交易（使用StreamAPI）
 * @author: Create by Liu Wen at 2020-07-12 19:12
 * ----------------------------------------------------------------------
 **/
public class TestTransaction {

    List<Transaction> transactions = null;

    @Before
    public void before(){
        Trader raoul0 = new Trader("Raoul0","Cambradge");
        Trader mario = new Trader("mario","Milan");
        Trader alan = new Trader("Alan","Arlan");
        Trader branin = new Trader("Branin","British");
        Trader chain = new Trader("Chain","China");

        transactions = Arrays.asList(
                new Transaction(raoul0,2011,300),
                new Transaction(mario,2012,1000),
                new Transaction(alan,2011,400),
                new Transaction(raoul0,2012,710),
                new Transaction(branin,2012,700),
                new Transaction(chain,2014,900));
    }
    //1.找出2011年发生的所有交易，并按交易额排序（从低到高）
    @Test
    public void test1(){
        transactions.stream()
                .filter((t)->t.getYear() == 2011)
                .sorted((t1,t2)->Integer.compare(t1.getValue(),t2.getValue()))
                .forEach(System.out::println);
    }
    //2.交易员都在哪些不同的城市工作过？
    //3.查找所有来自剑桥的交易员，并按姓名排序
    //4.返回所有交易员的姓名字符串，按字母顺序排序
    //5.有没有交易员是在米兰工作的？
    //6.打印生活在剑桥的交易员的所有交易额
    //7.所有交易中，最高的交易额是多少
    //8.找到交易额最小的交易


}
