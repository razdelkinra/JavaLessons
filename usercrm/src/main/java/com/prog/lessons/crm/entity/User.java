package com.prog.lessons.crm.entity;


import java.util.Comparator;

public class User implements Comparator<User> {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;

    public static UserBuilder newUserBuilder() {
        return new User().new UserBuilder();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(User o1, User o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }

    public class UserBuilder {

        public UserBuilder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            User.this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}

