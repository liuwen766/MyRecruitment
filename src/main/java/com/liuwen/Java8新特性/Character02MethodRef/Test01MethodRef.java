package com.liuwen.Java8新特性.Character02MethodRef;

import com.liuwen.Java8新特性.Character01Lambada.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @description:  方法引用/构造引用/数组有引用
 * @author: Create by Liu Wen at 2020-07-15 23:26
 * ----------------------------------------------------------------------
 **/

public class Test01MethodRef {
    /**
     * @Description:  方法引用格式一：  对象::实例方法名
     * @date 20.7.15 23:27
     */
    @Test
    public void test1(){
        Employee emp = new Employee();
        Supplier<String> sup = ()->emp.getName();
        String s = sup.get();
        System.out.println(s);
        //对象::实例方法
        Supplier<Integer> sup2 = emp::getAge;
        System.out.println(sup2.get());
    }


    /**
     * @Description:  方法引用格式二：  类::静态方法名
     * 注意：Lambada体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致
     * 即：等号左边与等号右边要一致
     * @date 20.7.15 23:27
     */
    @Test
    public void test2(){
        Comparator<Integer> com1 = (x,y)->Integer.compare(x,y);
        //类::静态方法名
        Comparator<Integer> com2 = Integer::compare;
    }

    /**
     * @Description:  方法引用格式三：  类::实例方法名
     *注意：若Lambada参数列表中的第一参数是实例方法的调用者，第二参数是实例方法的参数时，可以使用ClassName::method
     * @date 20.7.15 23:27
     */
    @Test
    public void test3(){
        BiPredicate<String,String> bip1 = (x,y)->x.equals(y);
        //类::实例方法名
        BiPredicate<String,String> bip2 = String::equals;
    }

    /**
     * @Description:  构造引用格式：  ClassName::new
     *注意：需要调用的构造器的参数列表与函数式接口中抽象方法的参数列表要一致
     * @date 20.7.15 23:27
     */
    @Test
    public void test4(){
        Supplier<Employee> sup = ()->new Employee();
        //构造引用
        Supplier<Employee> sup1 = Employee::new;
    }

    /**
     * @Description:  数组引用格式：Type[]::new
     * @date 20.7.16 10:16
     */
    @Test
    public void test5(){
        Function<Integer,String[]> fun = (x)->new String[x];
        String[] apply = fun.apply(10);
        System.out.println(apply.length);
        //数组引用格式：Type[]::new
        Function<Integer,String[]> fun1 = String[]::new;
        String[] apply1 = fun1.apply(20);
        System.out.println(apply1.length);
    }

}
