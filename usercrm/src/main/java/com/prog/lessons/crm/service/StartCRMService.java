package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.Manager;
import com.prog.lessons.crm.entity.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class StartCRMService {

    StorageService storageService = StorageService.getInstance();
    UserFileService userFileService = new UserFileService();
    ReflectionUserService reflectionUserService = new ReflectionUserService();
    ManagerConverter managerConverter = new ManagerConverter();

    public void readUsers() throws IOException, InvocationTargetException, IllegalAccessException {
        // TODO: Считать всех юзеров из файла при старте программы, конвертировать их в List<Users>
        // и сохранять их через StorageService addAllUsers(List<Users> users)
        List<String> lines = userFileService.getLinesFromFile();
        List<User> users = new ArrayList<>();
        for (String s : lines) {
            if (s.startsWith("Manager") == true) {
                Manager manager = new Manager();
                manager = managerConverter.convert(s);
                users.add(manager);
            }
        }
        storageService.addAllUsers(users);
    }
}

//
//
//
//
//            String[] words = s.split(" ");
//            Manager manager = new Manager();
//            manager.setFirstName(words[0]);
//            manager.setLastName(words[1]);
//            manager.setPhoneNumber(words[2]);
//            int i = Integer.parseInt(words[3]);
//            manager.setAge(i);
//            manager.setCarNumber(words[4]);
//            manager.setYearBonus(words[5]);