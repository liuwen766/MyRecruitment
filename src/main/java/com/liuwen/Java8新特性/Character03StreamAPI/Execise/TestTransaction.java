package com.liuwen.Java8新特性.Character03StreamAPI.Execise;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @description: 测试交易（使用StreamAPI）
 * @author: Create by Liu Wen at 2020-07-12 19:12
 * ----------------------------------------------------------------------
 **/
public class TestTransaction {

    List<Transaction> transactions = null;

    @Before
    public void before() {
        Trader raoul0 = new Trader("Raoul0", "Cambradge");
        Trader mario = new Trader("mario", "Milan");
        Trader alan = new Trader("Alan", "Cambradge");
        Trader branin = new Trader("Branin", "British");
        Trader chain = new Trader("Chain", "China");

        transactions = Arrays.asList(
                new Transaction(raoul0, 2011, 800),
                new Transaction(mario, 2012, 300),
                new Transaction(alan, 2011, 299),
                new Transaction(raoul0, 2012, 710),
                new Transaction(branin, 2012, 700),
                new Transaction(chain, 2014, 900));
    }

    //1.找出2011年发生的所有交易，并按交易额排序（从低到高）
    @Test
    public void test1() {

    }

    //2.交易员都在哪些不同的城市工作过？
    @Test
    public void test2() {

    }

    //3.查找所有来自剑桥的交易员，并按姓名排序
    @Test
    public void test3() {

    }

    //4.返回所有交易员的姓名字符串，按字母顺序排序
    @Test
    public void test() {


    }

    //5.有没有交易员是在米兰工作的？
    @Test
    public void test5() {

    }

    //6.打印生活在剑桥的交易员的所有交易额
    @Test
    public void test6() {

    }

    //7.所有交易中，最高的交易额是多少
    @Test
    public void test7() {

    }

    //8.找到交易额最小的交易
    @Test
    public void test8() {

    }

}
