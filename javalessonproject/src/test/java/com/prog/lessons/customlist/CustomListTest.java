package com.prog.lessons.customlist;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class CustomListTest {

    @Test
    public void testPerformanceCustomList() {
        CustomList<Integer> newList = new CustomListImpl<>();
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            newList.add(i);
        }
        System.out.println("Consumed time is " + (System.currentTimeMillis() - start) + " ms");
    }

    @Test
    public void add() {
        CustomListImpl<Integer> newList = new CustomListImpl<>(); // Инициализируй интерфейс, а не реализацию.  см. SOLID принципы
        long startTime = System.currentTimeMillis(); // делай переменные final, прочитай почему
        for (int i = 0; i < 1000000; i++) {
            newList.add(i);
        }
        assertEquals(1000000, newList.size()); // старайся писать тесты лаконичными и не только тесты, методы классы и т.д
        long totalTime = System.currentTimeMillis() - startTime;
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(totalTime);
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);
        int ms = cal.get(Calendar.MILLISECOND);
        System.out.println(minutes + ":" + seconds + ":" + ms);
        // убирай пустые строки и не забывай делать format code
    }
}