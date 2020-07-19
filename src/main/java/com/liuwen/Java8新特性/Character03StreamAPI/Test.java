package com.liuwen.Java8新特性.Character03StreamAPI;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * ----------------------------------------------------------------------
 * @description: 50个素数
 * @author: Create by Liu Wen at  2020/7/18 23:42
 * ----------------------------------------------------------------------
 **/
public class Test {
    static BigInteger TWO = BigInteger.valueOf(2);
    static Stream<BigInteger> primes(){
        return Stream.iterate(TWO,BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {
        primes().map(p->TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
                .filter(m->m.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }
}
