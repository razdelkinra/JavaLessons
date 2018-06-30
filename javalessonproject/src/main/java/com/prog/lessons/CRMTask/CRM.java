package com.prog.lessons.CRMTask;

import com.prog.lessons.CRMTask.controller.UserController;
import com.prog.lessons.CRMTask.exception.UserException;
import com.prog.lessons.CRMTask.service.StartCRMService;

import java.io.IOException;

public class CRM {
    public static void main(String[] args) throws IOException, UserException {
        StartCRMService.readUsers();
        UserController userController = new UserController();
        userController.execute();
    }
}
