package com.prog.lessons.crm.entity;

public class SalesPerson extends User {

    private int salesLevel;

    public static SalesPersonBuilder newSalesPersonBuilder() {
        return new SalesPerson().new SalesPersonBuilder();
    }

    public int getSalesLevel() {
        return salesLevel;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", age='" + super.getAge() + '\'' +
                "salesLevel='" + salesLevel +
                '}';
    }

    public class SalesPersonBuilder extends UserBuilder {

        public SalesPersonBuilder setSalesLevel(int salesLevel) {
            SalesPerson.this.salesLevel = salesLevel;
            return this;
        }

        @Override
        public SalesPersonBuilder setLastName(String lastName) {
            return (SalesPersonBuilder) super.setLastName(lastName);
        }

        @Override
        public SalesPersonBuilder setFirstName(String firstName) {
            return (SalesPersonBuilder) super.setFirstName(firstName);
        }

        @Override
        public SalesPersonBuilder setPhoneNumber(String phoneNumber) {
            return (SalesPersonBuilder) super.setPhoneNumber(phoneNumber);
        }

        @Override
        public SalesPersonBuilder setAge(int age) {
            return (SalesPersonBuilder) super.setAge(age);
        }

        @Override
        public SalesPerson build() {
            return SalesPerson.this;
        }
    }

}