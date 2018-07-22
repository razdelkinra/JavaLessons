package com.prog.lessons.crm.entity;

public class Main {
    public static void main(String[] args) {
        User manager = User.newUserBuilder().build();
        System.out.println( manager.getAge());

        System.out.println( manager.getFirstName());
    }
}
