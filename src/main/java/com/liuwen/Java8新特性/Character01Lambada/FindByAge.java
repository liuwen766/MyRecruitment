package com.liuwen.Java8新特性.Character01Lambada;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 19:42
 * ----------------------------------------------------------------------
 **/

public class FindByAge implements MyStrategy<Employee>{
    @Override
    public boolean test(Employee employee) {
        return employee.getAge()>35;
    }
}
