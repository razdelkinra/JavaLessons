package com.prog.lessons.Task_10_45;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task_10_45Test {
    Task_10_45 f = new Task_10_45();

    @Test
    public void getValueToIndex() {
        assertEquals(10, f.getValueToIndex(4));
    }

    @Test
    public void sumValueToIndex() {
        assertEquals(22, f.sumValueToIndex(4));
    }
}