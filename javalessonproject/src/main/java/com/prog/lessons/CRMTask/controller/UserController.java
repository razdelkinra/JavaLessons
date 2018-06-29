package com.prog.lessons.CRMTask.controller;

import com.prog.lessons.CRMTask.entity.User;
import com.prog.lessons.CRMTask.entity.UserType;
import com.prog.lessons.CRMTask.exception.UserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> personal = new ArrayList<>();


    public void execute() throws IOException, UserException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CreateUserController userController = new CreateUserController();

        while (true) {
            printApi();
            String command = reader.readLine();
            switch (command) {
                case "1":
                    System.out.println("1 - Менеджер  2 - Сервисный инженер  3 - Продавец");
                    command = reader.readLine();
                    userController.createNewUser(UserType.getById(Integer.parseInt(command)));
                    break;
                case "2":
                    userController.printAllUsers();
                    break;
            }
        }
    }

    private void printApi() {
        System.out.println("1 - Создать нового сотрудника" + "\n" + "2 - Получить список всех сотрудников");
    }

    public List<User> getPersonal() {
        return personal;
    }

    public void setPersonal(List<User> personal) {
        this.personal = personal;
    }
}
