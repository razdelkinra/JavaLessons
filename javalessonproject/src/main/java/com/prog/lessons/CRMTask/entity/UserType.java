package com.prog.lessons.CRMTask.entity;

import com.prog.lessons.CRMTask.exception.UserException;

import java.util.Map;

public enum UserType {

    MANAGER(1, "Менеджер"),
    SALESPERSON(2, "Продавец"),
    SERVICEWORKER(3, "Сервисный инженер");

    private String description;
    private int id;

    UserType(int id, String description) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    private static Map<Integer, UserType> userTypes;

    public static UserType getById(int id) throws UserException {
        for (UserType userType : UserType.values()) {
            if (userType.id == id) {
                return userType;
            }
        }
        throw new UserException("Нет типа юзера с  id= " + id);
    }
}
