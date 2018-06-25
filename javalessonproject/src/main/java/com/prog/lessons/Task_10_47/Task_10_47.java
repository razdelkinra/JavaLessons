package com.prog.lessons.Task_10_47;

public class Task_10_47 {
    //Написать рекурсивную функцию для вычисления k-го члена последовательности Фибоначчи.
    public int getFibonachiNum(int k) {
        return k <= 2 ? 1 : getFibonachiNum(k - 1) + getFibonachiNum(k - 2);
    }
}
