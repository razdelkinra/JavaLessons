package com.prog.lessons.Task_10_47;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task_10_47Test {
Task_10_47 f = new Task_10_47();
    @Test
    public void getFibonachiNum() {
        assertEquals(21, f.getFibonachiNum(8));
    } // Рефактор кода не забывай
}