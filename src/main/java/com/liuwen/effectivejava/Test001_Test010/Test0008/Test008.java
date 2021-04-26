package com.liuwen.effectivejava.Test001_Test010.Test0008;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第53个建议）： 慎用可变参数
 * @author: Create by Liu Wen at  2020/7/26 17:29
 * ----------------------------------------------------------------------
 **/
public class Test008 {

    public void foo() {
    }

    public void foo(int a) {
    }

    public void foo(int a, int b) {
    }

    public void foo(int a, int b, int c) {
    }

    public void foo(int a, int b, int c, int... rest) {
    }

    public static void main(String[] args) {
        System.out.println(1.00 - 0.60);
        System.out.println(1.00 - 0.70);
    }

    @Test
    public void testLogParent() throws Exception {
        // 日志记录器对象父子关系
        Logger logger1 = Logger.getLogger("com.xiaomi.log");
        Logger logger2 = Logger.getLogger("com.xiaomi");
        System.out.println(logger1.getParent() == logger2);
        //true
        System.out.println("logger2 parent:" + logger2.getParent() + "，name：" + logger2.getParent().getName());
        //logger2 parent:java.util.logging.LogManager$RootLogger@7b49cea0，name：

        // 一、自定义日志级别
        // a.关闭系统默认配置
        logger2.setUseParentHandlers(false);
        // b.创建handler对象
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // c.创建formatter对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // d.进行关联
        consoleHandler.setFormatter(simpleFormatter);
        logger2.addHandler(consoleHandler);
        // e.设置日志级别
        logger2.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);
        // 测试日志记录器对象父子关系
        logger1.severe("severe");
        logger1.warning("warning");
        logger1.info("info");
        logger1.config("config");
        logger1.fine("fine");
        logger1.finer("finer");
        logger1.finest("finest");
    }

    public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Test008.class);

    @Test
    public void testQuick() throws Exception {
        //打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        // 使用占位符输出日志信息
        String name = "jack";
        Integer age = 18;
        LOGGER.info("用户：{},{}", name, age);
        // 将系统异常信息写入日志
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            // e.printStackTrace();
            LOGGER.warn("出现异常：", e);
        }
    }


}
