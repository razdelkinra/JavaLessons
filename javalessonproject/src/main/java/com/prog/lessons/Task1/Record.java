package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.Humans;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Record {
    public void writeFromFile(List<Humans> personal) throws IOException {
        java.io.Writer writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt", true);
            for (Object person : personal) {
                writer.write(person + System.getProperty("line.separator"));
            }
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }
    }
}

