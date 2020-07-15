package com.liuwen.Java8新特性.Charcater01Lambada;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:    函数式接口（只有一个方法，并且用@FunctionalInterface标识）
 * @author: Create by Liu Wen at 2020-07-15 22:31
 * ----------------------------------------------------------------------
 **/
/**
 * @Description:      自定义的函数接口
 * @date 20.7.15 22:43
 */
@FunctionalInterface
public interface Function {

    public Integer getInteger(Integer integer);
}
