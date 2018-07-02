package com.prog.lessons.CRMTask.controller;

import com.prog.lessons.CRMTask.entity.UserType;
import com.prog.lessons.CRMTask.exception.UserException;
import com.prog.lessons.CRMTask.service.StorageService;
import com.prog.lessons.CRMTask.service.UserFileService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserController {

    public void execute() throws IOException, UserException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CreateUserController createUserController = new CreateUserController();
        PrintUserController printUserController = new PrintUserController();
        UserFileService userFileService = new UserFileService();
        StorageService storageService = new StorageService();

        while (true) {
            printApi();
            String command = reader.readLine();
            switch (command) {
                case "1":
                    System.out.println("1 - Менеджер  2 - Продавец  3 - Сервисный инженер");
                    createUserController.createNewUser(UserType.getById(Integer.parseInt(reader.readLine())));
                    userFileService.writeFromFile(storageService.getUsers());
                    break;
                case "2":
                    printUserController.printAllUsers();
                    break;
            }
        }
    }

    private void printApi() {
        System.out.println("1 - Создать нового сотрудника" + "\n" + "2 - Получить список всех сотрудников");
    }


}
