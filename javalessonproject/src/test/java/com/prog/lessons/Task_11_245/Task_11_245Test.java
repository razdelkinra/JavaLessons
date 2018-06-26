package com.prog.lessons.Task_11_245;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task_11_245Test {
    Task_11_245 f = new Task_11_245();
    int[] arr = new int[]{1, 2, -1, -2, 3, -3};
    int[] sortarr = new int[]{-1, -2, -3, 3, 2, 1,};

    @Test
    public void sortArray() {
        int[] array = f.sortArray(arr);
        assertEquals(true, Arrays.equals(sortarr, array));
        System.out.println(Arrays.toString(array));

    }
}