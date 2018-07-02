package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.Manager;
import com.prog.lessons.CRMTask.entity.SalesPerson;
import com.prog.lessons.CRMTask.entity.ServiceWorker;
import com.prog.lessons.CRMTask.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StorageService {

    private List<User> users = new ArrayList<>();
    private List<ServiceWorker> serviceWorkers = new ArrayList<>();
    private List<SalesPerson> salesPersons = new ArrayList<>();
    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<Manager> getManagers() {
        List<Manager> managers = new ArrayList<>();
        for (User manager : users) {
            if (manager instanceof Manager) {
                managers.add((Manager) manager);
            }
        }
        return managers;
    }
}