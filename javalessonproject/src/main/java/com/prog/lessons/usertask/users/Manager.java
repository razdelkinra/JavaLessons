package com.prog.lessons.usertask.users;

import com.prog.lessons.usertask.assets.Car;

import javax.annotation.Nonnull;

/**
 * Менеджер
 */
public class Manager extends User {

    @Nonnull
    private Car car;

    @Nonnull
    public Car getCar() {
        return car;
    }

    public void setCar(@Nonnull Car car) {
        this.car = car;
    }
}
