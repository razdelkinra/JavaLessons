package com.prog.lessons.crm.service;

import com.prog.lessons.crm.entity.Manager;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ManagerConverter {

    ReflectionUserService reflectionUserService = new ReflectionUserService();

    public Manager convert(String managerLine) throws InvocationTargetException, IllegalAccessException {
        int startIndex = 0;
        Manager manager = new Manager();
        List<String> fields = reflectionUserService.getFieldName(Manager.class);
        for (String field : fields) {
            startIndex = managerLine.indexOf(field) + field.length() + 2;

            if (startIndex < managerLine.length()) {
                String value = managerLine.substring(startIndex, managerLine.substring(startIndex, managerLine.length()).indexOf("\'", startIndex) - 1);
                reflectionUserService.setFieldByName(manager, field, value);
            }
        }
        return manager;
    }
}
