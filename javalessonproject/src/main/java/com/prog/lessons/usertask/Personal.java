package com.prog.lessons.usertask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Personal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> personal = new TreeMap<Integer, String>();
        while (true) {
            System.out.println("Введите id сотрудника");
            String id = reader.readLine();
            if (id.isEmpty())
                break;
            int id2 = Integer.parseInt(id);
            System.out.println("Введите имя и фамилию сотрудника");
            String name = reader.readLine();
            personal.put(id2, name);
        }
        // удаление узера с id 13
        personal.remove(13);
        for (Map.Entry<Integer, String> pair : personal.entrySet()) {
            System.out.println("id " + pair.getKey() + " - " + pair.getValue());
        }
    }
}
