package com.prog.lessons.Task_11_245;

public class Task_11_245 {
    //Дан массив. Переписать его элементы в другой массив такого же размера следующим образом: сначала должны идти все отрицательные элементы,
    //а затем все остальные. Использовать только один проход по исходному массиву.
    public int[] sortArray(int[] arr) {
        int[] tmp = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                tmp[arr.length - 1 - count] = arr[i];
                count++;
            } else {
                tmp[i - count] = arr[i];
            }
        }
        return tmp;
    }
}

