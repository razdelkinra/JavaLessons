package com.prog.lessons.Task1.Users;

public class Manager extends User {

    private String carNumber;
    private String yearBonus;

    public Manager(String firstname, String lastname, String mobilenumber, int age) {
        super(firstname, lastname, mobilenumber, age);
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(String yearBonus) {
        this.yearBonus = yearBonus;
    }
}
