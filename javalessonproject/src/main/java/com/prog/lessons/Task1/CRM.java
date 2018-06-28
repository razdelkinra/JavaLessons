package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CRM {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // перенести в ControllerService
        List<User> personal = new ArrayList<>(); // перенести в ControllerService
        ControllerService controllerservice = new ControllerService();
        controllerservice.execute(reader, personal); // тут это останется тогда controllerservice.execute()
    }

// пустые строки удалить
}

