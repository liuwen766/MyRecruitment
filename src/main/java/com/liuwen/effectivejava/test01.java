package com.liuwen.effectivejava;

import java.util.Arrays;

/**
 * ----------------------------------------------------------------------
 * @description:
 * @author: Create by Liu Wen at 2020-07-01 10:15
 * ----------------------------------------------------------------------
 **/

public class test01 {
    public static void main(String[] args){
        Ensemble solo = Ensemble.MONDAY;
        Ensemble solo1 = Ensemble.MONDAY;
        String name = solo.name();
        System.out.println(solo == solo1);
        System.out.println(Ensemble.MONDAY.compareTo(Ensemble.MONDAY));
        System.out.println(name);
        System.out.println(Arrays.toString(Ensemble.values()));
        System.out.println(solo.daysOfWeek());
        System.out.println(Enum.valueOf(Ensemble.class,Ensemble.THURSDAY.name()));;
        System.out.println(Ensemble.valueOf(Ensemble.class,Ensemble.MONDAY.name()));;
    }
}
