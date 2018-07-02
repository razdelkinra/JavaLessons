package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class UserFileService {

    public void writeFromFile(List<User> users) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt", true)) {
            for (User user : users) {
                writer.write(user + System.getProperty("line.separator"));
            }
        }
    }

    public void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
        Scanner scan = new Scanner(fr);
    }
}



