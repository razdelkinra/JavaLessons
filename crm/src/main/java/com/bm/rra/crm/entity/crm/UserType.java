package com.bm.rra.crm.entity.crm;

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
}
