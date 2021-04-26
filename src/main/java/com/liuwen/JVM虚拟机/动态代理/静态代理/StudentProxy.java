package com.liuwen.JVM虚拟机.动态代理.静态代理;

/**
 * @description: StudentProxy类，这个类也实现了Person接口，但是还另外持有一个学生类对象，
 * 由于实现了Person接口，同时持有一个学生对象，那么他可以代理学生类对象执行上交
 * 班费（执行giveMoney()方法）行为。
 * @author: Liu Wen
 * @create: 2020-03-27 14:44
 **/
public class StudentProxy implements Person {

    Student student;

    public StudentProxy(Person student) {
        if (student.getClass() == Student.class)
            this.student = (Student) student;
    }

    @Override
    public void giveMoney() {
        System.out.println(student.name + "最近Java的进步很大!");   //方法加强
        student.giveMoney();
    }
}
