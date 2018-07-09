package com.prog.lessons.CustomHashMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomHashMapImplTest {

    CustomHashMapImpl<String, String> customHashMap;

    @Before
    public void init() {
        customHashMap = new CustomHashMapImpl<>();
        customHashMap.add("A", "1");
        customHashMap.add("B", "2");
        customHashMap.add("C", "3");
    }

    @Test
    public void add() {
        assertEquals(3, customHashMap.size());
    }

    @Test
    public void delete() {
        customHashMap.delete("A");
        assertEquals(2, customHashMap.size());
        assertEquals(null, customHashMap.get("A"));

    }

    @Test
    public void get() {
        assertEquals("1", customHashMap.get("A"));
        assertEquals("2", customHashMap.get("B"));
        assertEquals("3", customHashMap.get("C"));

    }
}