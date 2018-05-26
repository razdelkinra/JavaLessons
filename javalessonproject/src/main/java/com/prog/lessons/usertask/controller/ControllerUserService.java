package com.prog.lessons.usertask.controller;


import com.prog.lessons.usertask.service.UserServiceImpl;
import com.prog.lessons.usertask.users.User;
import com.prog.lessons.usertask.utils.UserFileWriter;

import java.io.IOException;
import java.util.List;

/**
 *
 */
public class ControllerUserService {

    UserServiceImpl userService = new UserServiceImpl();
    UserFileWriter userFileWriter = new UserFileWriter();

    /**
     * Read command from console for crate new Manager
     */
    public void createManager(String command) {

    }

    /**
     * Read command from console for crate new Employee
     */
    public void createEmployee(String command) {

    }

    /**
     * Read command from console for delete new Employee
     */
    public void deleteUsers(String command) {

    }

    public void findUsersByPhone(String command) {

    }

    public void findUsersByFirstName(String command) {

    }

    public void findUsersByLastName(String command) {

    }

    public void error() {
        System.out.println("Error command");
    }

    public void print(List<User> users) {

    }

    public void print() {

    }

    public void uploadToFile() {
        try {
            userFileWriter.saveToFile(userService.getAllUsers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
