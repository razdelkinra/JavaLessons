package com.prog.lessons.usertask.service;


import com.prog.lessons.usertask.data.Storage;
import com.prog.lessons.usertask.users.User;
import com.prog.lessons.usertask.utils.UserFileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для операй с юзерами Create/Read/Update/Delete
 */
public class UserServiceImpl implements UserService {
    private Storage storage = new Storage();
    UserFileWriter userFileWriter = new UserFileWriter();

    @Override
    public void deleteUsers(User user) {

    }

    public void deleteUsers(List<User> users) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void createEmployee(User user) {

    }

    @Override
    public void createManager(User user) {
    }

    @Override
    public List<User> findByName(String name) {

        return null;
    }

    @Override
    public List<User> findByPhone(String phone) {
        return null;
    }

    @Override
    public List<User> findByLastName(String lastName) {

        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void loadUsersFromFile() {
        try {
            userFileWriter.downloadFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
