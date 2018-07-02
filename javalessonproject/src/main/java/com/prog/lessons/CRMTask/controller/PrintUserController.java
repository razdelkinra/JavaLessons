package com.prog.lessons.CRMTask.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintUserController {
    public void printAllUsers() throws IOException { // TODO:  создать класс PrintUserController, перенести метод туда(completed)

        // TODO:  чтение перенести в UserFileService, но тут получать юзеров будем через StorageService
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
