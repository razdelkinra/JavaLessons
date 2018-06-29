package com.prog.lessons.Task1.service;

import com.prog.lessons.Task1.controller.UserController;
import com.prog.lessons.Task1.entity.Manager;
import com.prog.lessons.Task1.exception.UserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserService {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    UserController userController = new UserController();

    public void createManager() throws UserException, IOException {
        System.out.println("Введите имя менеджера");
        String firstName = reader.readLine();

        if (firstName.isEmpty()) {
            throw new UserException("Имя юзера не может быть пустым");
        }
        System.out.println("Введите фамилию менеджера");
        String lastName = reader.readLine();
        if (lastName.isEmpty()) {
            throw new UserException("Фамилия юзера не может быть пустой");
        }
        System.out.println("Введите телефон менеджера");
        String phoneNumber = reader.readLine();

        System.out.println("Введите возраст менеджера");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Введите годовой бонус менеджера");
        String yearBonus = reader.readLine();

        Manager manager = new Manager();
        manager.setFirstName(firstName);
        manager.setLastName(lastName);
        manager.setPhoneNumber(phoneNumber);
        manager.setAge(age);
        manager.setYearBonus(yearBonus);
        userController.getPersonal().add(manager);
    }
}
