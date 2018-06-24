package com.prog.lessons.Task.Task_9_166;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task9166Test {
Task9166 f = new Task9166();
    @Test
    public void swapwords() {
        assertEquals("раз два три ", f.swapwords("три два раз"));
    }
}

// в результате выполнеия метода он добавляет последнее слово с пробелом. на это закрыть глаза?