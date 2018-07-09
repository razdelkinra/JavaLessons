package com.prog.lessons.CustomHashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomHashMapImplTest {

    CustomHashMapImpl<Integer, String> customHashMap;

    @Before
    public void init() {
        customHashMap = new CustomHashMapImpl<>();
        customHashMap.add(1, "A");
        customHashMap.add(2, "B");
        customHashMap.add(3, "C");
    }

    @Test
    public void add() {
        assertEquals(3, customHashMap.size());
    }

    @Test
    public void delete() {
        customHashMap.delete(1);
        assertEquals(2, customHashMap.size());

    }

    @Test
    public void get() {
        assertEquals("A", customHashMap.get(1));
    }
}