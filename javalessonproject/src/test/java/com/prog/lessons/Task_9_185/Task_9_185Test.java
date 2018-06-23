package com.prog.lessons.Task_9_185;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Task_9_185Test {
Task_9_185 f = new Task_9_185();
    @Test
    public void isParenthesisMatch() {
        assertEquals(false, f.isParenthesisMatch("())()()()"));

    }
}