package com.prog.lessons.Task1.Users;

public class ServiceWorker extends User {

    private String noteBookNumber;

    public ServiceWorker(String firstName, String lastName, String phoneNumber, int age) {
        super(firstName, lastName, phoneNumber, age);
    }

    // потом это заменим, на шаблон билдер


    public String getNoteBookNumber() {
        return noteBookNumber;
    }

    public void setNoteBookNumber(String noteBookNumber) {
        this.noteBookNumber = noteBookNumber;
    }
}
