package com.prog.lessons.Task_10_41;

import Task_10_42.Task_10_42;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Task_10_41Test {
Task_10_41 f = new Task_10_41();
    @Test
    public void fact() {
        assertEquals(6, f.fact(3)); // реформат кода не забывай, он сразу удаляет не нужные import , они серым отображаются
    }
}