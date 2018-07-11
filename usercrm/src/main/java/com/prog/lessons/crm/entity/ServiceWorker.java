package com.prog.lessons.crm.entity;

public class ServiceWorker extends User {

    private String noteBookNumber;

    public String getNoteBookNumber() {
        return noteBookNumber;
    }

    public static ServiceWorkerBuilder newServiceWorker() {
        return new ServiceWorker().new ServiceWorkerBuilder();
    }

    @Override
    public String toString() {
        return "ServiceWorker{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age='" + super.getAge() + '\'' +
                ", noteBookNumber='" + noteBookNumber + '\'' +
                '}';
    }

    public class ServiceWorkerBuilder extends UserBuilder {


        public ServiceWorkerBuilder setNoteBookNumber(String noteBookNumber) {
            ServiceWorker.this.noteBookNumber = noteBookNumber;
            return this;
        }

        @Override
        public ServiceWorkerBuilder setLastName(String lastName) {
            return (ServiceWorkerBuilder) super.setLastName(lastName);
        }

        @Override
        public ServiceWorkerBuilder setFirstName(String firstName) {
            return (ServiceWorkerBuilder) super.setFirstName(firstName);
        }

        @Override
        public ServiceWorkerBuilder setPhoneNumber(String phoneNumber) {
            return (ServiceWorkerBuilder) super.setPhoneNumber(phoneNumber);
        }

        @Override
        public ServiceWorkerBuilder setAge(int age) {
            return (ServiceWorkerBuilder) super.setAge(age);
        }

        @Override
        public ServiceWorker build() {
            return ServiceWorker.this;
        }
    }
}
