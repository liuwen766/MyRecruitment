package com.liuwen.Java8新特性.Charcater01Lambada;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 19:40
 * ----------------------------------------------------------------------
 **/

public interface MyStrategy<T> {
    boolean test(T t);
}
