package com.prog.lessons.Task1.Users;

public class Manager extends User {

    private String carNumber;
    private String yearBonus;

    public Manager(String firstName, String lastName, String phoneNumber, int age) {
        super(firstName, lastName, phoneNumber, age);
    }
 public void createManager(){

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
