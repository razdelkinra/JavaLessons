package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UserFileService {

    public void writeFromFile(List<User> personal) throws IOException {
        try (FileWriter writer = new FileWriter("C:\\entity\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt", true)) {
            for (Object person : personal) {
                writer.write(person + System.getProperty("line.separator"));
            }
        }
    }
}


