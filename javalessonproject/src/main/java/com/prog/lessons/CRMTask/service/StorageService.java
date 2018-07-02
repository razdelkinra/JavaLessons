package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.Manager;
import com.prog.lessons.CRMTask.entity.SalesPerson;
import com.prog.lessons.CRMTask.entity.ServiceWorker;
import com.prog.lessons.CRMTask.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StorageService {
    // TODO:  сделать класс StorageService
    // перенести логику хранения туда, там будут getUsers  и addUser плюс сделать методы getManagers, getServiceWorkers, getSales ()

    private List<User> users = new ArrayList<>();
    private List<ServiceWorker> serviceWorkers = new ArrayList<>();
    private List<SalesPerson> salesPersons = new ArrayList<>();
    private List<Manager> managers = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Manager> getManagers() {
        for (User manager : users) {
            if (manager instanceof Manager) {
                managers.add((Manager) manager);
            }
        }
        return managers;
    }
}