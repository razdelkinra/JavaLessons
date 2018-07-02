package com.prog.lessons.CRMTask.controller;

import com.prog.lessons.CRMTask.service.StorageService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintUserController {

    private StorageService storageService = new StorageService();

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

    public void printListManager() {
        storageService.getManagers().forEach(manager -> System.out.println(manager.toString()));
    }

    public void printListServiceWorkers() {
        // TODO: print service workers
    }

    public void printListSales() {
        // TODO: print sales
    }
}
