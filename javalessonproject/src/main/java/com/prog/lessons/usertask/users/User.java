package com.prog.lessons.usertask.users;

import javax.annotation.Nonnull;
import java.math.BigDecimal;

/**
 * Пользователь системы
 */
public class User {

    @Nonnull
    private Long id;

    /**
     * Имя
     */
    @Nonnull
    private String firstName;

    /**
     * Фамилия
     */
    @Nonnull
    private String lastName;

    /**
     * Зарплата
     */
    private BigDecimal salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Nonnull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@Nonnull String firstName) {
        this.firstName = firstName;
    }

    @Nonnull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(@Nonnull String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
