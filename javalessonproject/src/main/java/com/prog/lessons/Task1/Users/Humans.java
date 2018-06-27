package com.prog.lessons.Task1.Users;


import java.util.Comparator;

public class Humans implements Comparator<Humans> {

    private String firstname, lastname, mobilenumber;
    private int age;

    public Humans(String firstname, String lastname, String mobilenumber, int age) {
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
    public int compare(Humans o1, Humans o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}

