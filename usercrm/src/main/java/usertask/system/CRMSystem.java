package usertask.system;

import com.prog.lessons.usertask.controller.UserController;
import com.prog.lessons.usertask.users.User;

import java.util.Scanner;

/**
 * CRM система с
 */
public class CRMSystem implements UserStorageSystem {

    static Scanner sc = new Scanner(System.in);
    UserController contoller = new UserController();

    @Override
    public void startApplication() {
        startMessageAPI();
        String command = sc.next();
        contoller.execute(command);
        startApplication();
    }

    @Override
    public User getAllUser() {
        return null;
    }

    @Override
    public void exit() {
        System.exit(1);
    }

    @Override
    public void startMessageAPI() {
        System.out.println("1 - Создать нового сотрудника");
        System.out.println("2 - Посмотерть список всех сотрудников");
        System.out.println("3 - Поиск сотрудника");
        System.out.println("4 - Удалить сотрудника");
        System.out.println("5 - Редактировать информацию сотрудника");
        System.out.println("6 - Закончить работу");

    }
}
