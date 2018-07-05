package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.Manager;
import com.prog.lessons.crm.entity.SalesPerson;
import com.prog.lessons.crm.entity.ServiceWorker;
import com.prog.lessons.crm.entity.User;

import java.util.ArrayList;
import java.util.List;

public class StorageService {

    private static StorageService instance = new StorageService();

    private StorageService() {
        // TODO: реализовать патттерн синглтон
    }

    public static StorageService getInstance() {
        return instance;
    }

    private List<User> users = new ArrayList<>();

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

    public List<ServiceWorker> getServiceWorkers() {
        List<ServiceWorker> serviceWorkers = new ArrayList<>();
        for (User sw : users) {
            if (sw instanceof ServiceWorker) {
                serviceWorkers.add((ServiceWorker) sw);
            }
        }
        return serviceWorkers;
    }

    public List<SalesPerson> getSalesPersons() {
        List<SalesPerson> salesPersons = new ArrayList<>();
        for (User sp : users) {
            if (sp instanceof SalesPerson) {
                salesPersons.add((SalesPerson) sp);
            }
        }
        return salesPersons;
    }

    public boolean addAllUsers(List<User> user) {
        return users.addAll(user);
    }
}