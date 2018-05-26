package com.prog.lessons.usertask.controller;


/**
 * Controller. Принимает команду с консоли обрабатывает,
 * вызывает сервис UserServiceImpl, выводит на экран результат.
 */
public class UserController {

    ControllerUserService service = new ControllerUserService();

    public void execute(String command) {
        switch (command) {
            case "1":
                // TODO: операция согласно команде №1
                break;
            case "2":
                // TODO: операция согласно команде №2
                break;
            case "3":
                // TODO: операция согласно команде №3
                service.print();
                break;
            default:
                service.error();
                break;
        }
    }
}
