package com.liuwen.Java8新特性.Character03StreamAPI;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ----------------------------------------------------------------------
 *
 * @description: 50个素数
 * @author: Create by Liu Wen at  2020/7/18 23:42
 * ----------------------------------------------------------------------
 **/
public class Test {
    static BigInteger TWO = BigInteger.valueOf(2);

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

    public static void main(String[] args) {

        String s1 = formatLongTime(86399);
        System.out.println(s1);
        String ebossNnn = (new Random().nextInt(900)+100)+"";
        System.out.println(ebossNnn);
//        primes().map(p->TWO.pow(p.intValueExact()).subtract(BigInteger.ONE))
//                .filter(m->m.isProbablePrime(50))
//                .limit(20)
//                .forEach(System.out::println);

        // 1. 对于 String 列表去重
        List<String> stringList = new ArrayList<String>() {{
            add("A");
            add("A");
            add("B");
            add("B");
            add("C");
        }};
        System.out.print("去重前：");
        for (String s : stringList) {
            System.out.print(s);
        }
        System.out.println();
        stringList = stringList.stream().distinct().collect(Collectors.toList());
        System.out.print("去重后：");
        for (String s : stringList) {
            System.out.print(s);
        }
        System.out.println();

        System.out.println("根据对象的某个属性进行去重");
        List<Resource> resourceList = new ArrayList<>();

        Resource resource1 = new Resource("004", "001", "001", 1);
        Resource resource2 = new Resource("002", "002", "001", 1);
        Resource resource3 = new Resource("003", "003", "001", 1);
        Resource resource4 = new Resource("002", "004", "001", 1);
        Resource resource5 = new Resource("004", "005", "001", 1);
        resourceList.add(resource1);
        resourceList.add(resource2);
        resourceList.add(resource3);
        resourceList.add(resource4);
        resourceList.add(resource5);
        System.out.println(resourceList);
        System.out.println("----------------去重后-----------------");
        List<Resource> collect = resourceList.stream().filter(distinctByKey(billOrder -> billOrder.getCustomerId())).collect(Collectors.toList());
        System.out.println(collect);


        System.out.println("---------------hen---------------");

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, java.lang.Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), java.lang.Boolean.TRUE) == null;
    }

    public static String formatLongTime(long mss) {
        String DateTimes = null;
        long hours = (mss % ( 60 * 60 * 24)) / (60 * 60);
        long minutes = (mss % ( 60 * 60)) /60;
        long seconds = mss % 60;

        DateTimes=String.format("%02d:", hours)+ String.format("%02d:", minutes) + String.format("%02d", seconds);
        String.format("%2d:", hours);
        return DateTimes;
    }


}
