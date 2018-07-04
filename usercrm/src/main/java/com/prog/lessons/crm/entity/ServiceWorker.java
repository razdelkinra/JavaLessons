package com.prog.lessons.crm.entity;

public class ServiceWorker extends User {

    private String noteBookNumber;

    public String getNoteBookNumber() {
        return noteBookNumber;
    }

    public void setNoteBookNumber(String noteBookNumber) {
        this.noteBookNumber = noteBookNumber;
    }

    @Override
    public String toString() {
        return "ServiceWorker{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age='" + super.getAge() + '\'' +
                "noteBookNumber='" + noteBookNumber + '\'' +
                '}';
    }
}
