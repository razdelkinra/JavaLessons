package com.prog.lessons.crm.entity;

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
    public void setFirstName(String firstname) {
        super.setFirstName(firstname);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int compare(User o1, User o2) {
        return super.compare(o1, o2);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age=" + super.getAge() +
                ", carNumber='" + carNumber + '\'' +
                ", yearBonus='" + yearBonus + '\'' +
                '}';
    }
}
