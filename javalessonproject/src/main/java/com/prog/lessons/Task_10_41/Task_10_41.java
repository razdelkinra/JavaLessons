package com.prog.lessons.Task_10_41;

//Написать рекурсивную функцию для вычисления факториала натурального числа n
public class Task_10_41 {
    public int fact(int i) {

        return i == 1 ? 1 : fact(i - 1) * i;
    }

// пустые строки удалить
}
