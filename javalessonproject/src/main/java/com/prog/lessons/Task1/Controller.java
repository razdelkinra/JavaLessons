package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.Humans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public Controller(BufferedReader reader, List<Humans> personal) {
    }

    public void createNewPersonal(BufferedReader reader, List<Humans> personal) throws IOException {
        String ifirstname, ilastname, imobilenumber, iage;
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

    public static void view() throws IOException {
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
