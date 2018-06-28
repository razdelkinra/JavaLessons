package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public Controller(BufferedReader reader, List<User> personal) { // конструктор не нужен
    }

    public void createNewPersonal(BufferedReader reader, List<User> personal) throws IOException {
        String ifirstname, ilastname, imobilenumber, iage; // лучше писать в каждую строчку, для читабельности.
        // i в названии убери, и camel case (lastName). i только для названия интерфейсов
        while (true) { // цикл не нужен

            System.out.println("Введите имя сотрудника");
            ifirstname = reader.readLine();

            if (ifirstname.isEmpty()) // если if то всегда скобки ставь {}
                break;

            System.out.println("Введите фамилию сотрудника");
            ilastname = reader.readLine();

            System.out.println("Введите телефон сотрудника");
            imobilenumber = reader.readLine();

            System.out.println("Введите возраст сотрудника");
            iage = reader.readLine();
            int iage1 = Integer.parseInt(iage);
            personal.add(new User(ifirstname, ilastname, imobilenumber, iage1));
            Collections.sort(personal, new User(ifirstname, ilastname, imobilenumber, iage1)); // это при печати можно сделать,
            // тут только создание, personal.sort(new Comparator ....) сделаешь
        }
    }

    public static void view() throws IOException { // printAllUsers , static убери
        FileReader fr = new FileReader("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close();
    }
}
