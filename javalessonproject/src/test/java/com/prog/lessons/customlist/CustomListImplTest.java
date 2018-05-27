package com.prog.lessons.customlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ruslan
 */
public class CustomListImplTest {

    @Test
    public void getTest() {
        CustomList<String> customList = new CustomListImpl();
        customList.add("1");
        customList.add("2");
        assertEquals("1", customList.get(0));
        assertEquals("2", customList.get(1));
    }

    @Test
    public void removeTest() {

        CustomList<String> customList = new CustomListImpl();
        customList.add("1");
        customList.add("2");
        customList.add("3");
        customList.add("4");
        customList.add("5");
        customList.add("6");
        assertEquals("1", customList.remove(0));
        assertEquals(5, customList.size());
    }

    @Test
    public void addTest() {
        CustomList<String> customList = new CustomListImpl();
        customList.add("1");
        customList.add("2");
        customList.add("3");
        customList.add("4");
        customList.add("5");
        customList.add("6");
        assertEquals(6, customList.size());
    }

    @Test
    public void tr(){
        List list = new ArrayList();
        list.remove(0);
    }
}
