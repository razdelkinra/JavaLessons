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
        customList.add("1 object");
        customList.add("2 object");
        customList.add("3 object");
       // assertEquals(1, customList.size());
        System.out.println( customList.get(0));
        System.out.println( customList.get(1));
             customList.remove(0);
        System.out.println( customList.get(0));
        System.out.println( customList.size());
    }

    @Test
    public void removeTest() {

    }

    @Test
    public void addTest() {

    }
}
