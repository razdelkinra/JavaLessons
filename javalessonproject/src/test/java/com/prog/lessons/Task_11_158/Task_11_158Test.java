package com.prog.lessons.Task_11_158;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Task_11_158Test {
    Task_11_158 f = new Task_11_158();
    int[] arr = new int[]{1, 3, 5, 4, 0, 0, 0, 0};
    int[] array = new int[]{1, 3, 5, 1, 4, 3, 4, 5};

    @Test
    public void removeDuplicates() {
        int[] ar = f.removeDuplicates(array);
        assertEquals(true, Arrays.equals(arr, ar));
    }
}
