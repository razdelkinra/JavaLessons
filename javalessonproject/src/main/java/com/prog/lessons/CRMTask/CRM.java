package com.prog.lessons.CRMTask;

import com.prog.lessons.CRMTask.controller.UserController;
import com.prog.lessons.CRMTask.exception.UserException;

import java.io.IOException;

public class CRM {
    public static void main(String[] args) throws IOException, UserException {
        UserController userController = new UserController();
        userController.execute();
    }
}
