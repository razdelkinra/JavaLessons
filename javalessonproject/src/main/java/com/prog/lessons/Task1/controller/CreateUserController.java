package com.prog.lessons.Task1.controller;

import com.prog.lessons.Task1.entity.UserType;
import com.prog.lessons.Task1.exception.UserException;
import com.prog.lessons.Task1.service.UserService;

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


    private void createServiceWorker() {

    }

    private void createSalesPerson() {

    }

    private void createManager() throws UserException, IOException {
        userService.createManager();
    }

    public static void printAllUsers() throws IOException { // static убери (main статический же)
        FileReader fr = new FileReader("C:\\entity\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close();
    }
}
