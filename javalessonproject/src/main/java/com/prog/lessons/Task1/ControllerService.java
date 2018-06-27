package com.prog.lessons.Task1;

import com.prog.lessons.Task1.Users.Humans;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class ControllerService {
    public  void execute(BufferedReader reader, List<Humans> personal) throws IOException {
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
                    Controller controller = new Controller(reader, personal);
                    controller.createNewPersonal(reader, personal);
                    Record write = new Record();
                    write.writeFromFile(personal);
                    break;

                case "2":
                    Controller.view();
                    break;
            }
        }
    }
}
