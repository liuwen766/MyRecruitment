package com.liuwen.effectivejava;

import java.io.Serializable;

public enum Ensemble implements Serializable {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),
    THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    private final int days;
    Ensemble(int size){
        this.days = size;
    }
    public int daysOfWeek() { return days;}
}
