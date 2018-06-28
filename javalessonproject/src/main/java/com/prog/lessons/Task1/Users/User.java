package com.prog.lessons.Task1.Users;


import java.util.Comparator;

public class User implements Comparator<User> {

    private String firstname, lastname, mobilenumber; // в каждую строчку
    private int age;

    public User(String firstname, String lastname, String mobilenumber, int age) { // названия полей phoneNumber, lastName, firstName
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilenumber = mobilenumber;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.firstname + " " + this.lastname + " " + this.mobilenumber + " " + this.age;
    }


    @Override
    public int compare(User o1, User o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}

