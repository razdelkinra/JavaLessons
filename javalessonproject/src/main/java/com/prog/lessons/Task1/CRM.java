package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.Humans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CRM {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Humans> personal = new ArrayList<>();
        ControllerService controllerservice = new ControllerService();
        controllerservice.execute(reader, personal);
    }


}

