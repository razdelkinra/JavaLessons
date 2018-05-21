package com.prog.lessons.usertask.assets;

import javax.annotation.Nonnull;
import java.util.Date;

/**
 * Авто
 */
public class Car {

    @Nonnull
    private String brand;

    @Nonnull
    private String number;

    @Nonnull
    private Date dateOfRegistration;

    @Nonnull
    public String getBrand() {
        return brand;
    }

    public void setBrand(@Nonnull String brand) {
        this.brand = brand;
    }

    @Nonnull
    public String getNumber() {
        return number;
    }

    public void setNumber(@Nonnull String number) {
        this.number = number;
    }

    @Nonnull
    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(@Nonnull Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
