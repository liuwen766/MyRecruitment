package com.liuwen.Java8新特性;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 18:52
 * ----------------------------------------------------------------------
 **/

public class Test05OptionClass {
/**
 * @Description:  Optional类
 *
 * Optional<T>类是一个容器类，代表一个值存在或者不存在，原来用null表示一个值不存在，现在Optional可以
 * 更好的表达这个概念。并且可以避免空指针异常。
 *
 * 常用方法：Optional.of(T t):创建一个Optional实例
 *         Optional.empty():创建一个空的Optional实例
 *         Optional.ofNullable(T t):若t不为null，创建Optional实例，否则创建空实例
 *         isPresent():判断是否包含值
 *         orElse(T t):如果调用对象包含值，返回该值，否则返回t
 *         orElseGet(Supplier s):如果调用对象包含值，返回该值，否则返回s获取的值
 *         map(Function f):如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty()
 *         flatMap(Function mapper):与map类似，要求返回值必须是Optional
 *
 */



}
