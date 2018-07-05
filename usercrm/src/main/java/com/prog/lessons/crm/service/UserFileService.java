package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileService {

    public void writeToFile(List<User> users) throws IOException {
        try (FileWriter writer = new FileWriter(this.getClass().getResource("/users.txt").getPath())) { // Надо убирать из ресурсов users.txt и сувать в другую папку, иначе он в target все пишет, она удаляется при каждом clean install
            for (User user : users) {
                writer.write(user.toString());
            }
        }
    }

    public List<String> getLinesFromFile() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(this.getClass().getResource("/users.txt").getPath()));
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines;
    }
}



