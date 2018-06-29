package com.prog.lessons.Task1.utils;

import com.prog.lessons.Task1.entity.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Record {
    public void writeFromFile(List<User> personal) throws IOException {

        try (FileWriter writer = new FileWriter("C:\\entity\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt", true)) {
            for (Object person : personal) {
                writer.write(person + System.getProperty("line.separator"));
            }
        }
    }
}


