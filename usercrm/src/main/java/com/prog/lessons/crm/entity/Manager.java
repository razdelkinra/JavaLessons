package com.prog.lessons.crm.entity;

public class Manager extends User {

    private String carNumber;
    private String yearBonus;

    public static ManagerBuilder newManagerBuilder() {
        return new Manager().new ManagerBuilder();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getYearBonus() {
        return yearBonus;
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
                ", age='" + super.getAge() + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", yearBonus='" + yearBonus + '\'' +
                '}';
    }

    public class ManagerBuilder extends UserBuilder {


        public ManagerBuilder setCarNumber(String carNumber) {
            Manager.this.carNumber = carNumber;
            return this;
        }

        public ManagerBuilder setYearBonus(String yearBonus) {
            Manager.this.yearBonus = yearBonus;
            return this;
        }

        @Override
        public ManagerBuilder setLastName(String lastName) {
            return (ManagerBuilder) super.setLastName(lastName);
        }

        @Override
        public ManagerBuilder setFirstName(String firstName) {
            return (ManagerBuilder) super.setFirstName(firstName);
        }

        @Override
        public ManagerBuilder setPhoneNumber(String phoneNumber) {
            return (ManagerBuilder) super.setPhoneNumber(phoneNumber);
        }

        @Override
        public ManagerBuilder setAge(int age) {
            return (ManagerBuilder) super.setAge(age);
        }

        public Manager build() {
            return Manager.this;
        }
    }
}
