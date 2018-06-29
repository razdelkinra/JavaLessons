package usertask;

import com.prog.lessons.usertask.system.CRMSystem;

/**
 * Класс для запуска приложения. Из него происходит только запуск консоли
 */
public class UsersApplication {

    // TODO: Сделать всю функциональность которая есть в меню (запусти приложение).
    // Хранение юзеров пока будет в памяти. Потом в файле сделаешь

    public static void main(String[] args) {
        CRMSystem crmSystem = new CRMSystem();
        crmSystem.startApplication();
    }
}
