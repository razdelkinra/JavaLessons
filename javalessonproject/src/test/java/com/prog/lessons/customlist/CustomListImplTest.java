package com.prog.lessons.customlist;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * @author Ruslan
 */
public class CustomListImplTest {

 CustomListImpl<String> customList;

    @Before
    public void init() {
        customList = new CustomListImpl<>();
        //customList.add("1 object");
        for (int i = 0; i < 1000000; i++) {
            customList.add(i + " object");}

    }

    @Test
    public void getTest() {
        assertEquals("0 object", customList.get(0));
        assertEquals("1 object", customList.get(1));
    }

    @Test
    public void removeTest() {
        customList.remove(10);
        assertEquals(999999, customList.size());
    }

    @Test
    public void addTest() {
        assertEquals(1000000, customList.size());

    }
}
