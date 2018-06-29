package com.prog.lessons.Task_10_45;

public class Task_10_45 {
    //Даны первый член и разность арифметической прогрессии. Написать рекурсивную функцию для нахождения:
    //а) n-го члена прогрессии;
    //б) суммы n первых членов прогрессии.
    int a = 1;
    int d = 3;

    public int getValueToIndex(int index) {
        return index <= 1 ? a : d + getValueToIndex(index - 1);
    }

    public int sumValueToIndex(int index) {
        return index <= 1 ? a : sumValueToIndex(index - 1) + getValueToIndex(index);
    }
}
