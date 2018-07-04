package com.prog.lessons.CRMTask.entity;

public class SalesPerson extends User {

    private int salesLevel;

    public int getSalesLevel() {
        return salesLevel;
    }

    public void setSalesLevel(int salesLevel) {
        this.salesLevel = salesLevel;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "firstName='" + super.getFirstname() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age='" + super.getAge() + '\'' +
                "salesLevel='" + salesLevel +
                '}';
    }



}

