package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CustomerCareResponse {
    @JsonProperty("name")
    private String name;

    @JsonProperty("contactNumber")
    private BigDecimal contactNumber;

    // Constructor
    public CustomerCareResponse(String name, BigDecimal contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
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

    @Override
    public String toString() {
        return "InnerContactUs{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
