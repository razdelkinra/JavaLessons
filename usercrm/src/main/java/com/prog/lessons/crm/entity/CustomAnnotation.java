package com.prog.lessons.crm.entity;

import jdk.nashorn.internal.objects.annotations.Where;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
    String name() default "Роман";

    int attributes() default 100;


}
