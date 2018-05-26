package com.prog.lessons.customlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ruslan
 */
public class CustomListImplTest {

    @Test
    public void getTest() {

        CustomList<String> customList = new CustomListImpl();
        customList.add("First object");
        customList.add("Second object");
        System.out.println(customList.get(0));
        System.out.println(customList.get(1));


       assertEquals(1, customList.size());
    }

    @Test
    public void removeTest() {
        CustomList<String> customList = new CustomListImpl();
        customList.add("First object");
        customList.add("Second object");
        customList.remove(1);

    }

    @Test
    public void addTest() {

    }
}
