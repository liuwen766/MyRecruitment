package com.liuwen.Java8新特性.Character01Lambada;

import org.junit.Test;

import java.util.*;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:      为什么要用Lambada表达式
 * @author: Create by Liu Wen at 2020-07-15 18:55
 * ----------------------------------------------------------------------
 **/

public class Test01Lambada {

    /**
     * @Description:  匿名内部类
     * @date 20.7.15 18:57
     */
    @Test
    public void test01(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    /**
     * @Description:  Lambada实现匿名内部类
     * @date 20.7.15 18:57
     */
    @Test
    public void test02(){
        Comparator<Integer> comparator = (o1,o2)->Integer.compare(o1,o2);
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    }

    /**
     * @Description:创建员工集合
     */
    private List<Employee> employeeList = Arrays.asList(
            new Employee("liuwen",18,18000),
            new Employee("xixi",19,16000),
            new Employee("小明",38,18000),
            new Employee("张三",33,26000),
            new Employee("李四",49,28000),
            new Employee("王五",56,36000)
    );

    /**
     * @Description:  需求1：找出当前公司年龄大于35的员工信息
     * @date 20.7.15 19:06
     */
    @Test
    public void test03(){
        List<Employee> result = findEmployee(employeeList);
        for (Employee e : result) {
            System.out.println(e);
        }
    }
    public List<Employee> findEmployee(List<Employee> list){
        List<Employee> list1 = new ArrayList<>();
        for (Employee e:list
             ) {
            if(e.getAge()>35){
                list1.add(e);
            }
        }
        return list1;
    }


    /**
     * @Description: 需求2：找出当前公司工资大于20000的员工信息
     * @date 20.7.15 19:17
     */
    @Test
    public void test04(){
        //如Test03一样写一大堆代码（冗余代码）怎么办  →  三种优化方式：策略设计模式/匿名内部类/Lambada表达式
    }
    /**
     * @Description:  优化方式一：策略设计模式
     * @date 20.7.15 19:25
     */
    @Test                                                //策略
    public void test05(){                                //new FindByAge()
        List<Employee> result =filterEmployee(employeeList,new FindBySalary());
        for (Employee e : result) {
            System.out.println(e);
        }
    }

    /**
     * @Description:  实现策略模式
     * @date 20.7.15 19:53
     */
    public List<Employee> filterEmployee(List<Employee> list,MyStrategy<Employee> ms){
        List<Employee> list1 = new ArrayList<>();
        for (Employee employee:list) {
            if(ms.test(employee)){
                list1.add(employee);
            }
        }
        return list1;
    }

    /**
     * @Description:  优化方式二：匿名内部类
     * @date 20.7.15 19:35
     */
    @Test
    public void test06(){
        List<Employee> employees = filterEmployee(employeeList, new MyStrategy<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<35;
            }
        });

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    /**
     * @Description:  优化方式三：Lambada表达式
     * @date 20.7.15 19:35
     */
    @Test
    public void test07(){
        List<Employee> employees = filterEmployee(employeeList,(e) -> e.getAge() > 35 );
        employees.forEach(System.out::println);
    }






}
