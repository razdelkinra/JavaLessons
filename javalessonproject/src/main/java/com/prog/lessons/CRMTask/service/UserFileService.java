package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.User;

import java.io.*;
import java.util.List;

public class UserFileService {

    public void writeFromFile(List<User> users) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt", true)) {
            for (User user : users) {
                writer.write(user + System.getProperty("line.separator"));
            }
        }
    }

    public void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal");
        BufferedReader reader = new BufferedReader(fr);
    }
}



