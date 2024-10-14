package com.toursandtravels.api.datamodel;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customer_care")
public class CustomerCare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal contactNumber;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(BigDecimal contactNumber) {
        this.contactNumber = contactNumber;
    }
}

