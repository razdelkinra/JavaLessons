package com.prog.lessons.Task_10_45;

public class Task_10_45 {
    //Даны первый член и разность арифметической прогрессии. Написать рекурсивную функцию для нахождения:
    //а) n-го члена прогрессии;
    //б) суммы n первых членов прогрессии.

    static int a = 1;
    static int d = 3;

    public static int arifmprogvalue(int index) {

        if (index <= 1)
            return a;
        else return d + arifmprogvalue(index - 1);

    }

    public static int sumarifmprogvalue(int index) {
        if (index <= 1)
            return a;
        else return sumarifmprogvalue(index - 1) + arifmprogvalue(index);
    }

    public static void main(String[] args) {
        Task_10_45 f = new Task_10_45();
        System.out.println(arifmprogvalue(4));
        System.out.println(sumarifmprogvalue(4));
    }

}



