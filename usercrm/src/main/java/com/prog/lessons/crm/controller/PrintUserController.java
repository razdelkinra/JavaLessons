package com.prog.lessons.crm.controller;

import com.prog.lessons.crm.service.ReflectionUserService;
import com.prog.lessons.crm.service.StorageService;

import java.io.IOException;

public class PrintUserController {
    StorageService storageService = new StorageService();

    public void printAllUsers() throws IOException {
        storageService.getUsers().stream().forEach(user -> System.out.println(user.toString()));
    }

    public void printListManager() {
        storageService.getManagers().forEach(manager -> System.out.println(manager.toString()));
    }

    public void printListServiceWorkers() {
        storageService.getServiceWorkers().forEach(serviceWorker -> System.out.println(serviceWorker.toString()));
    }

    public void printListSalesPersons() {
        storageService.getSalesPersons().forEach(salesPerson -> System.out.println(salesPerson.toString()));
    }
}
