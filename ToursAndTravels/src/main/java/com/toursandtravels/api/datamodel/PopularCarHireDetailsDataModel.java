package com.toursandtravels.api.datamodel;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "popular_Car_Hire_Details")
public class PopularCarHireDetailsDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "popular_car_hire_id")  // Maps the relationship
    private List<CabImage> cabImageList = new ArrayList<>();

    private String cabType;

    private Integer numberOfPassenger;

    private BigDecimal luggageSize;

    private String transmission;

    private String fuelType;

    private Float rating;

    private Integer reviewCount;

    private Float ratePerKilometer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CabImage> getCabImageList() {
        return cabImageList;
    }

    public void setCabImageList(List<CabImage> cabImageList) {
        this.cabImageList = cabImageList;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public Integer getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(Integer numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public BigDecimal getLuggageSize() {
        return luggageSize;
    }

    public void setLuggageSize(BigDecimal luggageSize) {
        this.luggageSize = luggageSize;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Float getRatePerKilometer() {
        return ratePerKilometer;
    }

    public void setRatePerKilometer(Float ratePerKilometer) {
        this.ratePerKilometer = ratePerKilometer;
    }

    public void addCabImage(CabImage cabImage) {
        this.cabImageList.add(cabImage);
    }
}
