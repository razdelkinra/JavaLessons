package com.prog.lessons.Task_10_41;
//Написать рекурсивную функцию для вычисления факториала натурального числа n
public class Task_10_41 {
    public int fact(int i) {
        int rez;
        if (i == 1)
            return 1;
        rez = fact(i - 1) * i;
        return rez; // запиши этот метод в одну строчку, используй тернарный оператор
    }


}
