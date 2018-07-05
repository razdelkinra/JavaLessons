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

    public void writeFromFile(List<User> users) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\usercrm\\src\\main\\resources\\users.txt", true)) {
            for (User user : users) {
                writer.write(user + System.getProperty("line.separator"));
            }
        }
    }

    public List<String> getLinesFromFile() throws FileNotFoundException {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(new FileReader(Thread.currentThread()
                .getContextClassLoader().getResource("users.txt").getPath()));
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines;
    }
}



