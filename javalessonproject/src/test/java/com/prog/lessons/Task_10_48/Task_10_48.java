package com.prog.lessons.Task_10_48;

public class Task_10_48 {
    //Написать рекурсивную функцию для вычисления максимального элемента массива из n элементов.
    int[] nums = new int[]{10, 3, 17, 2, 1};

    public int max(int n) {
        if (n <= 1)
            return nums[0];
        else if (nums[n - 1] > nums[n - 2])
            return nums[n - 1];
        else return nums[n - 2];


    }
}
