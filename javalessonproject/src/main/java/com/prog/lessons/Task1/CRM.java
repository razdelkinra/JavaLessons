package com.prog.lessons.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CRM {
    public static void main(String[] args) throws IOException {
        String ifirstname, ilastname, imobilenumber;
        String iage;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Humans> personal = new ArrayList<>();

        System.out.println("1 -Введите нового сотрудника  2 - Список всех сотрудников");
        String comande = reader.readLine();
        switch (comande) {

            case "1":

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


                Writer writer = null;
                try {
                    writer = new FileWriter("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt",true);
                    for (Object person : personal) {
                        writer.write(person + System.getProperty("line.separator"));
                    }

                } finally {
                    if (writer != null) {
                        try {
                            writer.close();
                        } catch (IOException ex) {
                        }
                    }
                }
                break;

            case "2":
                FileReader fr= new FileReader("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
                Scanner scan = new Scanner(fr);

                int i = 1;

                while (scan.hasNextLine()) {
                    System.out.println(i + " : " + scan.nextLine());
                    i++;
                }

                fr.close();
        }

    }
}

