package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.Manager;

import java.io.IOException;
import java.util.List;

public class StartCRMService {

    StorageService storageService = new StorageService();
    UserFileService userFileService = new UserFileService();
    ReflectionUserService reflectionUserService = new ReflectionUserService();

    public void readUsers() throws IOException {
        // TODO: Считать всех юзеров из файла при старте программы, конвертировать их в List<Users>
        // и сохранять их через StorageService addAllUsers(List<Users> users)
        List<String> lines = userFileService.getLinesFromFile();

         /*   String[] words = line.split("[\\(\\)]");
            Manager manager = new Manager();
            manager.setFirstName(words[0]);
            manager.setLastName(words[1]);
            manager.setPhoneNumber(words[2]);
            int i = Integer.parseInt(words[3]);
            manager.setAge(i);
            manager.setCarNumber(words[4]);
            manager.setYearBonus(words[5]);
            users.add(manager);*/
            //   }
        //}
       /* fr.close();
        storageService.addAllUsers(users);*/
    }
}