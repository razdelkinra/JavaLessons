package com.prog.lessons.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Controller {
    public Controller(BufferedReader reader, List<Humans> personal) {

    }

    private static void Controller(BufferedReader reader, List<Humans> personal) throws IOException { // избегай static методов
        // названия всегда с маленькой буквы. Почитать справочник по java 8, там вся теория что нужна в работе
        String ifirstname;
        String ilastname;
        String imobilenumber;
        String iage;
        while (true) {

            System.out.println("Введите имя сотрудника");
            ifirstname = reader.readLine();

            if (ifirstname.isEmpty())
                break;


            System.out.println("Введите фамилию сотрудника");
            ilastname = reader.readLine();

            System.out.println("Введите телефон сотрудника");
            imobilenumber = reader.readLine();

            System.out.println("Введите возраст сотрудника");
            iage = reader.readLine();
            int iage1 = Integer.parseInt(iage);
            personal.add(new Humans(ifirstname, ilastname, imobilenumber, iage1));
            Collections.sort(personal, new Humans(ifirstname, ilastname, imobilenumber, iage1));

        }
    }
}
