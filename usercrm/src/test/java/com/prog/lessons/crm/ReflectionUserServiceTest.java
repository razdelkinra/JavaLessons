package com.prog.lessons.crm;

import com.prog.lessons.crm.entity.Manager;
import com.prog.lessons.crm.service.ReflectionUserService;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class ReflectionUserServiceTest {

    ReflectionUserService reflectionUserService = new ReflectionUserService();

    @Test
    public void setFieldByName() throws InvocationTargetException, IllegalAccessException {
        Manager manager = new Manager();
        List<String> fieldNameList = reflectionUserService.getFieldName(Manager.class);
        String firstNameField = fieldNameList.stream().filter(s -> s.contains("firstName")).findFirst().get();
        reflectionUserService.setFieldByName( manager, firstNameField, "Roman");
        assertEquals("Roman", manager.getFirstName());
    }
}
