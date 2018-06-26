package com.prog.lessons.Task_12_63;

//В двумерном массиве хранится информация о количестве учеников в том
//или ином классе каждой параллели школы с первой по одиннадцатую (в пер
//вой строке — информация о количестве учеников в первых классах, во вто
//рой — о вторых и т. д.). В каждой параллели имеются 4 класса. Определить
//среднее количество учеников в классах каждой параллели.
public class Task_12_63 {
    public void getAverageValue(int[][] arr) {

        for (int i = 0; i < 11; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println("Среднее число учеников по " + (i + 1) + " параллели равно: " + sum / 4);
        }
    }

    public static void main(String[] args) {
        Task_12_63 f = new Task_12_63();
        int[][] arr = {
                {20, 10, 15, 20, 10, 15, 10, 15, 10, 10, 15},
                {30, 30, 35, 30, 20, 25, 60, 35, 50, 20, 25},
                {40, 40, 25, 10, 30, 35, 20, 25, 30, 10, 15},
                {20, 10, 15, 20, 10, 15, 10, 15, 10, 30, 25}
        };
        f.getAverageValue(arr);
    }
}