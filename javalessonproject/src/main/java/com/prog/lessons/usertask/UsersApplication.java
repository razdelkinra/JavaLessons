package com.prog.lessons.usertask;

import com.prog.lessons.usertask.system.CRMSystem;

/**
 * Класс для запуска приложения. Из него происходит только запуск консоли
 */
public class UsersApplication {


    public static void main(String[] args) {
        CRMSystem crmSystem = new CRMSystem();
        crmSystem.startApplication();
    }
}
