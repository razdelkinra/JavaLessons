package com.prog.lessons.crm.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReflectionUserService {

    public List<String> getFieldName(Class clazz) {
        List<String> fields = new ArrayList<>();
        for (Field field : clazz.getSuperclass().getDeclaredFields()) {
            fields.add(field.getName());
        }
        for (Field field : clazz.getDeclaredFields()) {
            fields.add(field.getName());
        }
        return fields;
    }

    public List<Method> getMethods(Class clazz) {
        List<Method> methods = new ArrayList<>();
        for (Method method : clazz.getMethods()) {
            methods.add(method);
        }
        for (Method method : clazz.getSuperclass().getMethods()) {
            methods.add(method);
        }
        return methods;
    }

    public void setFieldByName(Object o, String fieldName, Object value) throws InvocationTargetException, IllegalAccessException {
        Optional<Method> method = getMethods(o.getClass()).stream().
                filter(m -> m.getName().startsWith("set") && m.getName().toLowerCase().
                        contains(fieldName.toLowerCase())).findFirst();
        if (method.isPresent()) {
            method.get().setAccessible(true);
            method.get().invoke(o, value);
        }
    }
}
