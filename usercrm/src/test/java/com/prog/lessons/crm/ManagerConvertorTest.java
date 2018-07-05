package com.prog.lessons.crm;

import com.prog.lessons.crm.entity.Manager;
import com.prog.lessons.crm.service.ManagerConverter;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ManagerConvertorTest

{

    @Test
    public void convertTest() throws InvocationTargetException, IllegalAccessException {
        ManagerConverter managerConvertor = new ManagerConverter();
        Manager manager = managerConvertor.convert("Manager{firstName='Rus', lastName='Razd', phoneNumber='43434', age='43', carNumber='null', yearBonus='344'}");

        Assert.assertEquals("43434", manager.getPhoneNumber());

    }
}
