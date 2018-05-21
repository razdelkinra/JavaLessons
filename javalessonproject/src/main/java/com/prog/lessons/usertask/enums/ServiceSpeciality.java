package com.prog.lessons.usertask.enums;

/**
 * Список специальнстей
 */
public enum ServiceSpeciality {

    LASER_SYSTEM(0, "Лазерные станки и комплексы"),

    MECHANICAL_MACHINE(1, "Механические системы");

    private long id;

    private String description;

    ServiceSpeciality(long id, String description) {
        this.id = id;
        this.description = description;
    }
}
