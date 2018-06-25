package com.prog.lessons.Task_11_158;

//Удалить из массива все повторяющиеся элементы, оставив их первые вхождения, т. е. в массиве должны остаться только различные элементы.
//исключение этого элемента из массива путем смещения всех следующих за ним элементов влево на 1 позицию;
//присваивание последнему элементу массива значения 0.

public class Task_11_158 {

    public int[] removeDuplicates(int[] arr) {
        int end = arr.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int[] tmp = arr;
                    System.arraycopy(arr, j + 1, tmp, j, arr.length - j - 1);
                    end--;
                    j--;
                    tmp[end] = 0;
                    arr = tmp;
                }
            }
        }
        return arr;
    }
}