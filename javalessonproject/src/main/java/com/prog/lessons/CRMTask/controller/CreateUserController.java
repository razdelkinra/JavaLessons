package com.prog.lessons.CRMTask.controller;

import com.prog.lessons.CRMTask.entity.UserType;
import com.prog.lessons.CRMTask.exception.UserException;
import com.prog.lessons.CRMTask.service.UserService;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
        // TODO:  создание сервисника(completed )
        userService.createServiceWorker();
    }


    private void createSalesPerson() throws IOException, UserException {
        // TODO:  создание продавца(completed )
        userService.createSalesPerson();
    }

    private void createManager() throws UserException, IOException {
        userService.createManager();
    }
}
