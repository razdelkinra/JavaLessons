package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ControllerService {

    private Controller userController;

    public  void execute(BufferedReader reader, List<User> personal) throws IOException {
        while (true) {
            System.out.println("1 -Введите нового сотрудника  2 - Список всех сотрудников");
            String comande = reader.readLine();

            switch (comande) {
                case "1":
                    System.out.println("1 - Менеджер  2 - Сервисный инженер  3 - Бухгалтер");
                    comande = reader.readLine();
                    switch (comande) {
                        case "1":
                    }
                    userController.createNewPersonal(reader, personal);
                    // это пока тут временно, потом уберм, юзеры при выходе из приложения все будут писаться махом
                    Record write = new Record();
                    write.writeFromFile(personal);
                    break;

                case "2":
                    userController.view(); // printAllUsers()
                    break;
            }
        }
    }
}
