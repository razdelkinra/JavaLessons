package com.prog.lessons.crm.controller;

import com.prog.lessons.crm.entity.UserType;
import com.prog.lessons.crm.exception.UserException;
import com.prog.lessons.crm.service.StorageService;
import com.prog.lessons.crm.service.UserFileService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserController {

    CreateUserController createUserController = new CreateUserController();
    PrintUserController printUserController = new PrintUserController();
    UserFileService userFileService = new UserFileService();
    StorageService storageService = new StorageService();

    public void execute() throws IOException, UserException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            printApi();
            String command = reader.readLine();
            switch (command) {
                case "1":
                    System.out.println("1 - Менеджер  2 - Продавец  3 - Сервисный инженер");
                    createUserController.createNewUser(UserType.getById(Integer.parseInt(reader.readLine())));
                    break;
                case "2":
                    printUserController.printAllUsers();
                    break;
                case "3":
                    // TODO: сделать поиск сотрудника по фамилии, и диапазону лет
                    break;
                case "0":
                    userFileService.writeFromFile(storageService.getUsers());
                    System.exit(0);
                    break;
                default:
                    throw new UserException("Unsupported command");
            }
        }
    }

    private void printApi() {
        System.out.println(
                "1 - Создать нового сотрудника" + "\n" +
                        "2 - Получить список всех сотрудников" + "\n" +
                        "3 - Найти сотрудника" + "\n" +
                        "0 - Выход из программы");
    }
}
