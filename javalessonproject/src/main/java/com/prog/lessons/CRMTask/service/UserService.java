package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.Manager;
import com.prog.lessons.CRMTask.entity.SalesPerson;
import com.prog.lessons.CRMTask.entity.ServiceWorker;
import com.prog.lessons.CRMTask.exception.UserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserService {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StorageService storageService = new StorageService();

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

        System.out.println("Введите годовой бонус менеджера");
        String yearBonus = reader.readLine();

        Manager manager = new Manager();
        manager.setFirstName(firstName);
        manager.setLastName(lastName);
        manager.setPhoneNumber(phoneNumber);
        manager.setAge(age);
        manager.setYearBonus(yearBonus);
        storageService.addUser(manager);

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

        ServiceWorker serviceWorker = new ServiceWorker();
        serviceWorker.setFirstName(firstName);
        serviceWorker.setLastName(lastName);
        serviceWorker.setPhoneNumber(phoneNumber);
        serviceWorker.setAge(age);
        serviceWorker.setNoteBookNumber(noteBookNumber);
        storageService.addUser(serviceWorker);
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

        SalesPerson salesPerson = new SalesPerson();
        salesPerson.setFirstName(firstName);
        salesPerson.setLastName(lastName);
        salesPerson.setPhoneNumber(phoneNumber);
        salesPerson.setAge(age);
        salesPerson.setSalesLevel(salesLevel);
        storageService.addUser(salesPerson); //
    }
}