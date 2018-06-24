package com.prog.lessons.Task_10_44;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task_10_44Test {
Task_10_44 f = new Task_10_44();
    @Test
    public void cifrcor() { // обращай внимание на названия, если idea подчеркивает, значит скорее всего не правильно написал
        assertEquals(7, f.cifrcor(65536));
    }
}