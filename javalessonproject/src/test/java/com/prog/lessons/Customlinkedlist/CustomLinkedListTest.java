package com.prog.lessons.Customlinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    CustomLinkedList<String> customLinkedList;

    @Before
    public void init() {
        customLinkedList = new CustomLinkedList();

        for (int i = 0; i < 100; i++) {
            customLinkedList.add(i + " object");
        }
    }

    @Test
    public void add() {
        assertEquals(100, customLinkedList.size());
    }

    @Test
    public void remove() {
        customLinkedList.remove(1);
        assertEquals(99, customLinkedList.size());
    }

    @Test
    public void get() {
        assertEquals("0 object", customLinkedList.get(0));
        assertEquals("1 object", customLinkedList.get(1));
    }
}