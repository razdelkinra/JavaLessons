package com.prog.lessons.CRMTask.entity;

import java.util.HashMap;
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

    static { // TODO: Перенести в общий класс
        userTypes = new HashMap<Integer, UserType>();
        for (UserType userType : UserType.values()) {
            userTypes.put(userType.id, userType);
        }
    }

    public static UserType getById(int id) {
        return userTypes.get(id);
    }
}
