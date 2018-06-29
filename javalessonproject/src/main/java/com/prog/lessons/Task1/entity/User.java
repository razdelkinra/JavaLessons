package com.prog.lessons.Task1.entity;


import java.util.Comparator;

public class User implements Comparator<User> {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.phoneNumber + " " + this.age;
    }

    @Override
    public int compare(User o1, User o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

}

