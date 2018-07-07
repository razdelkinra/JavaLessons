package com.bm.rra.crm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sales")
public class SalesManager extends User{

    private BigDecimal yearBonus;

    public BigDecimal getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(BigDecimal yearBonus) {
        this.yearBonus = yearBonus;
    }
}
