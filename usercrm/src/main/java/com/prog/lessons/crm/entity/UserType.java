package com.prog.lessons.crm.entity;

import com.prog.lessons.crm.exception.UserException;

import java.util.Map;

public enum UserType {

    MANAGER(1, "Менеджер"),
    SALESPERSON(2, "Продавец"),
    SERVICEWORKER(3, "Сервисный инженер");

    private static Map<Integer, UserType> userTypes;
    private String description;
    private int id;

    UserType(int id, String description) {
        this.description = description;
        this.id = id;
    }

    public static UserType getById(int id) throws UserException {
        for (UserType userType : UserType.values()) {
            if (userType.id == id) {
                return userType;
            }
        }
        throw new UserException("Нет типа юзера с  id= " + id);
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }
}
