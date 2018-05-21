package com.prog.lessons.usertask.utils;

import com.prog.lessons.usertask.data.Storage;
import com.prog.lessons.usertask.users.User;

import java.io.IOException;
import java.util.List;

/**
 * Класс для работы с файлами
 */
public class UserFileWriter {

    public final static String FILE = "C:\\JAVA\\src\\resources\\userlist.txt";

    Storage storage = new Storage();

    public void saveToFile(List<User> users) throws IOException {

    }

    public void downloadFromFile() throws IOException {
    }
}
