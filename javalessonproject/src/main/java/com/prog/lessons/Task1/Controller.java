package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public void createNewPersonal(BufferedReader reader, List<User> personal) throws IOException {
        String firstName,
                lastName,
                phoneNumber,
                age;
        while (true) { // цикл не нужен (я захотел чтобы после ввода сотрудников можно было вернуться сразу в меню выбора)

            System.out.println("Введите имя сотрудника");
            firstName = reader.readLine();

            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Введите фамилию сотрудника");
            lastName = reader.readLine();

            System.out.println("Введите телефон сотрудника");
            phoneNumber = reader.readLine();

            System.out.println("Введите возраст сотрудника");
            age = reader.readLine();
            int age1 = Integer.parseInt(age);
            personal.add(new User(firstName, lastName, phoneNumber, age1));
            Collections.sort(personal, new User(firstName, lastName, phoneNumber, age1)); // это при печати можно сделать,
            // тут только создание, personal.sort(new Comparator ....) сделаешь
            // при
        }
    }

    public static void printAllUsers() throws IOException { // static убери (main статический же)
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
