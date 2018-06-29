package com.prog.lessons.Task1;

import com.prog.lessons.Task1.exception.UserException;

import java.io.IOException;

public class CRM {
    public static void main(String[] args) throws IOException, UserException {
        UserController userController = new UserController();
        userController.execute();
    }
}
