package com.prog.lessons.crm.entity;

public class Main {
    public static void main(String[] args) {
        Manager manager = Manager.newManagerBuilder().build();
        System.out.println( manager.getAge());

    }
}
