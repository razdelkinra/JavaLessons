package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.Manager;
import com.prog.lessons.crm.entity.SalesPerson;
import com.prog.lessons.crm.entity.ServiceWorker;
import com.prog.lessons.crm.exception.UserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserService {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StorageService storageService = StorageService.getInstance();
    UserFileService userFileService = new UserFileService();

    public void createManager() throws UserException, IOException {
        System.out.println("Введите имя сотрудника");
        String firstName = reader.readLine();

        if (firstName.isEmpty()) {
            throw new UserException("Имя юзера не может быть пустым");
        }
        System.out.println("Введите фамилию сотрудника");
        String lastName = reader.readLine();

        if (lastName.isEmpty()) {
            throw new UserException("Фамилия юзера не может быть пустой");
        }
        System.out.println("Введите телефон сотрудника");
        String phoneNumber = reader.readLine();

        System.out.println("Введите возраст сотрудника");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Введите номер машины менеджера");
        String carNumber = reader.readLine();

        System.out.println("Введите годовой бонус менеджера");
        String yearBonus = reader.readLine();

        Manager manager = Manager.builder()
                .setFirstName(firstName)
                .setAge(age)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setYearBonus(yearBonus)
                .setCarNumber(carNumber)
                .build();
        storageService.addUser(manager);
      //  userFileService.writeToFile(storageService.getUsers());
    }

    public void createServiceWorker() throws UserException, IOException {
        System.out.println("Введите имя сервисного инженера");
        String firstName = reader.readLine();

        if (firstName.isEmpty()) {
            throw new UserException("Имя юзера не может быть пустым");
        }
        System.out.println("Введите фамилию сервисного инженера");
        String lastName = reader.readLine();
        if (lastName.isEmpty()) {
            throw new UserException("Фамилия юзера не может быть пустой");
        }
        System.out.println("Введите телефон сервисного инженера");
        String phoneNumber = reader.readLine();

        System.out.println("Введите возраст сервисного инженера");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Введите серийный номер ноутбука сервисного инженера");
        String noteBookNumber = reader.readLine();

        ServiceWorker serviceWorker = ServiceWorker.builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setAge(age)
                .setNoteBookNumber(noteBookNumber)
                .build();
        storageService.addUser(serviceWorker);
        userFileService.writeToFile(storageService.getUsers());
    }

    public void createSalesPerson() throws UserException, IOException {
        System.out.println("Введите имя продавца");
        String firstName = reader.readLine();

        if (firstName.isEmpty()) {
            throw new UserException("Имя юзера не может быть пустым");
        }
        System.out.println("Введите фамилию продавца");
        String lastName = reader.readLine();
        if (lastName.isEmpty()) {
            throw new UserException("Фамилия юзера не может быть пустой");
        }
        System.out.println("Введите телефон продавца");
        String phoneNumber = reader.readLine();

        System.out.println("Введите возраст продавца");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Введите объем продаж продавца");
        int salesLevel = Integer.parseInt(reader.readLine());

        SalesPerson salesPerson = SalesPerson.builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setPhoneNumber(phoneNumber)
                .setAge(age)
                .setSalesLevel(salesLevel)
                .build();
        storageService.addUser(salesPerson);
        userFileService.writeToFile(storageService.getUsers());
    }
}