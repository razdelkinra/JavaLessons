package com.prog.lessons.CRMTask.entity;

public class Manager extends User {

    private String carNumber;
    private String yearBonus;

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

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + super.getFirstname() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age=" + super.getAge() +
                ", carNumber='" + carNumber + '\'' +
                ", yearBonus='" + yearBonus + '\'' +
                '}';
    }
}
