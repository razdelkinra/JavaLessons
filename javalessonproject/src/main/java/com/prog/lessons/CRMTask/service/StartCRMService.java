package com.prog.lessons.CRMTask.service;

import com.prog.lessons.CRMTask.entity.Manager;
import com.prog.lessons.CRMTask.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartCRMService {

    public static void readUsers() throws IOException {
        //// TODO: Считать всех юзеров из файла при старте программы, конвертировать их в List<Users>
        // и сохранять их через StorageService addAllUsers(List<Users> users)
        List<User> users = new ArrayList<>();
        StorageService storageService = new StorageService();
        FileReader fr = new FileReader("C:\\Users\\Roman\\IdeaProjects\\JavaLessonsoriginal\\javalessonproject\\src\\main\\resources\\personal.txt");
        BufferedReader reader = new BufferedReader(fr);
        String line;
        while ((line = reader.readLine()) != null) {
            // if (line.startsWith("Manager") == true) {
            //   String pattern = "\\(([^)]+)\\)";

            String[] words = line.split("[\\(\\)]");
            Manager manager = new Manager();
            manager.setFirstName(words[0]);
            manager.setLastName(words[1]);
            manager.setPhoneNumber(words[2]);
            int i = Integer.parseInt(words[3]);
            manager.setAge(i);
            manager.setCarNumber(words[4]);
            manager.setYearBonus(words[5]);
            users.add(manager);
            //   }
        }
        fr.close();
        storageService.addAllUsers(users);
    }
}