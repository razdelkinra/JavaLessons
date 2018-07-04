package com.prog.lessons.crm.controller;

import com.prog.lessons.crm.entity.UserType;
import com.prog.lessons.crm.exception.UserException;
import com.prog.lessons.crm.service.UserService;

import java.io.IOException;

public class CreateUserController {

    UserService userService = new UserService();

    public void createNewUser(UserType userType) throws IOException, UserException {
        switch (userType) {
            case MANAGER:
                createManager();
                break;
            case SALESPERSON:
                createSalesPerson();
                break;
            case SERVICEWORKER:
                createServiceWorker();
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private void createServiceWorker() throws IOException, UserException {
        userService.createServiceWorker();
    }

    private void createSalesPerson() throws IOException, UserException {
        userService.createSalesPerson();
    }

    private void createManager() throws UserException, IOException {
        userService.createManager();
    }
}
