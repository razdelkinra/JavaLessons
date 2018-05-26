package com.prog.lessons.usertask.system;

import com.prog.lessons.usertask.users.User;

/**
 * Интерфейс системы хранения пользователей
 */
public interface UserStorageSystem {

    void startApplication();

    User getAllUser();

    void exit();

    void startMessageAPI();
}
