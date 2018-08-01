package com.bm.rra.crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
@SecondaryTable(name = "managers")
public class Manager {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Column(table = "managers")
    private String carNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
