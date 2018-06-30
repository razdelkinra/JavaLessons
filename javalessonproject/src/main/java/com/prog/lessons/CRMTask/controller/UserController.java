package com.prog.lessons.CRMTask.controller;

import com.prog.lessons.CRMTask.entity.User;
import com.prog.lessons.CRMTask.entity.UserType;
import com.prog.lessons.CRMTask.exception.UserException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {
    private List<User> personal = new ArrayList<>();  // TODO:  сделать класс StorageService , перенести логику хранения туда, там будут getUsers  и addUser, плюс сделать методы getManagers, getServiceWorkers, getSales ()

    public void execute() throws IOException, UserException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CreateUserController createUserController = new CreateUserController();

        while (true) {
            printApi();
            String command = reader.readLine();
            switch (command) {
                case "1":
                    System.out.println("1 - Менеджер  2 - Сервисный инженер  3 - Продавец");
                    createUserController.createNewUser(UserType.getById(Integer.parseInt(reader.readLine())));
                    break;
                case "2":
                    printAllUsers();
                    break;
            }
        }
    }

    public void printAllUsers() throws IOException { // TODO:  создать класс PrintUserController, перенести метод туда

        // TODO:  чтение перенести в UserFileService, но тут получать юзеров будем через StorageService
        FileReader fr = new FileReader("C:\\entity\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close();
    }

    private void printApi() {
        System.out.println("1 - Создать нового сотрудника" + "\n" + "2 - Получить список всех сотрудников");
    }

    public List<User> getPersonal() {
        return personal;
    } // это уходит от сюда

    public void setPersonal(List<User> personal) {
        this.personal = personal;
    }
}
