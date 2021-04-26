package com.liuwen.Java8新特性.Character01Lambada;

/**
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 19:42
 * ----------------------------------------------------------------------
 **/

public class FindByAge implements MyStrategy<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge() > 35;
    }
}
