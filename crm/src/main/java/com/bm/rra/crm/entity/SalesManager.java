package com.bm.rra.crm.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
@SecondaryTable(name = "sales")
public class SalesManager {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;

    @Column(table = "sales")
    private BigDecimal yearBonus;

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

    public BigDecimal getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(BigDecimal yearBonus) {
        this.yearBonus = yearBonus;
    }
}
