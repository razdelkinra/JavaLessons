package com.prog.lessons.crm;

import com.prog.lessons.crm.controller.UserController;
import com.prog.lessons.crm.exception.UserException;
import com.prog.lessons.crm.service.StartCRMService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CRM {
    public static void main(String[] args) throws IOException, UserException, InvocationTargetException, IllegalAccessException {
        new StartCRMService().readUsers();
        UserController userController = new UserController();
        userController.execute();
    }
}
