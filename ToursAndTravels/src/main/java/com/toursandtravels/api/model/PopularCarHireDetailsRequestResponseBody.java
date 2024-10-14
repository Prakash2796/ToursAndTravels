package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PopularCarHireDetailsRequestResponseBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")


public class PopularCarHireDetailsRequestResponseBody {

  @JsonProperty("cabImageList")
  @Valid
  private List<String> cabImageList = null;

  @JsonProperty("cabType")
  private String cabType = null;

  @JsonProperty("numberOfPassenger")
  private Integer numberOfPassenger = null;

  @JsonProperty("luggageSize")
  private BigDecimal luggageSize = null;

  @JsonProperty("transmission")
  private String transmission = null;

  @JsonProperty("fuelType")
  private String fuelType = null;

  @JsonProperty("rating")
  private Float rating = null;

  @JsonProperty("reviewCount")
  private Integer reviewCount = null;

  @JsonProperty("ratePerKilometer")
  private Float ratePerKilometer = null;

  public PopularCarHireDetailsRequestResponseBody(List<String> cabImageList, String cabType, Integer numberOfPassenger, BigDecimal luggageSize, String transmission, String fuelType, Float rating, Integer reviewCount, Float ratePerKilometer) {
    this.cabImageList = cabImageList;
    this.cabType = cabType;
    this.numberOfPassenger = numberOfPassenger;
    this.luggageSize = luggageSize;
    this.transmission = transmission;
    this.fuelType = fuelType;
    this.rating = rating;
    this.reviewCount = reviewCount;
    this.ratePerKilometer = ratePerKilometer;
  }

  public PopularCarHireDetailsRequestResponseBody() {

  }

  public PopularCarHireDetailsRequestResponseBody cabImageList(List<String> cabImageList) {
    this.cabImageList = cabImageList;
    return this;
  }

  public PopularCarHireDetailsRequestResponseBody addCabImageListItem(String cabImageListItem) {
    if (this.cabImageList == null) {
      this.cabImageList = new ArrayList<String>();
    }
    this.cabImageList.add(cabImageListItem);
    return this;
  }

  /**
   * List of car images
   * @return cabImageList
   **/
  @Schema(description = "List of car images")
  
    public List<String> getCabImageList() {
    return cabImageList;
  }

  public void setCabImageList(List<String> cabImageList) {
    this.cabImageList = cabImageList;
  }

  public PopularCarHireDetailsRequestResponseBody cabType(String cabType) {
    this.cabType = cabType;
    return this;
  }

  /**
   * Type of cab e.g Hackback Cab
   * @return cabType
   **/
  @Schema(description = "Type of cab e.g Hackback Cab")
  
    public String getCabType() {
    return cabType;
  }

  public void setCabType(String cabType) {
    this.cabType = cabType;
  }

  public PopularCarHireDetailsRequestResponseBody numberOfPassenger(Integer numberOfPassenger) {
    this.numberOfPassenger = numberOfPassenger;
    return this;
  }

  /**
   * Number of seats in the car
   * @return numberOfPassenger
   **/
  @Schema(description = "Number of seats in the car")
  
    public Integer getNumberOfPassenger() {
    return numberOfPassenger;
  }

  public void setNumberOfPassenger(Integer numberOfPassenger) {
    this.numberOfPassenger = numberOfPassenger;
  }

  public PopularCarHireDetailsRequestResponseBody luggageSize(BigDecimal luggageSize) {
    this.luggageSize = luggageSize;
    return this;
  }

  /**
   * Size of luggage space
   * @return luggageSize
   **/
  @Schema(required = true, description = "Size of luggage space")
      @NotNull

    @Valid
    public BigDecimal getLuggageSize() {
    return luggageSize;
  }

  public void setLuggageSize(BigDecimal luggageSize) {
    this.luggageSize = luggageSize;
  }

  public PopularCarHireDetailsRequestResponseBody transmission(String transmission) {
    this.transmission = transmission;
    return this;
  }

  /**
   * Get transmission
   * @return transmission
   **/
  @Schema(description = "")
  
    public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public PopularCarHireDetailsRequestResponseBody fuelType(String fuelType) {
    this.fuelType = fuelType;
    return this;
  }

  /**
   * Get fuelType
   * @return fuelType
   **/
  @Schema(description = "")
  
    public String getFuelType() {
    return fuelType;
  }

  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }

  public PopularCarHireDetailsRequestResponseBody rating(Float rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Rating of the car
   * @return rating
   **/
  @Schema(required = true, description = "Rating of the car")
      @NotNull

    public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public PopularCarHireDetailsRequestResponseBody reviewCount(Integer reviewCount) {
    this.reviewCount = reviewCount;
    return this;
  }

  /**
   * Number of reviews
   * @return reviewCount
   **/
  @Schema(required = true, description = "Number of reviews")
      @NotNull

    public Integer getReviewCount() {
    return reviewCount;
  }

  public void setReviewCount(Integer reviewCount) {
    this.reviewCount = reviewCount;
  }

  public PopularCarHireDetailsRequestResponseBody ratePerKilometer(Float ratePerKilometer) {
    this.ratePerKilometer = ratePerKilometer;
    return this;
  }

  /**
   * Cost per kilometer
   * @return ratePerKilometer
   **/
  @Schema(description = "Cost per kilometer")
  
    public Float getRatePerKilometer() {
    return ratePerKilometer;
  }

  public void setRatePerKilometer(Float ratePerKilometer) {
    this.ratePerKilometer = ratePerKilometer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularCarHireDetailsRequestResponseBody popularCarHireDetailsRequestResponseBody = (PopularCarHireDetailsRequestResponseBody) o;
    return Objects.equals(this.cabImageList, popularCarHireDetailsRequestResponseBody.cabImageList) &&
        Objects.equals(this.cabType, popularCarHireDetailsRequestResponseBody.cabType) &&
        Objects.equals(this.numberOfPassenger, popularCarHireDetailsRequestResponseBody.numberOfPassenger) &&
        Objects.equals(this.luggageSize, popularCarHireDetailsRequestResponseBody.luggageSize) &&
        Objects.equals(this.transmission, popularCarHireDetailsRequestResponseBody.transmission) &&
        Objects.equals(this.fuelType, popularCarHireDetailsRequestResponseBody.fuelType) &&
        Objects.equals(this.rating, popularCarHireDetailsRequestResponseBody.rating) &&
        Objects.equals(this.reviewCount, popularCarHireDetailsRequestResponseBody.reviewCount) &&
        Objects.equals(this.ratePerKilometer, popularCarHireDetailsRequestResponseBody.ratePerKilometer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabImageList, cabType, numberOfPassenger, luggageSize, transmission, fuelType, rating, reviewCount, ratePerKilometer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularCarHireDetailsRequestResponseBody {\n");
    
    sb.append("    cabImageList: ").append(toIndentedString(cabImageList)).append("\n");
    sb.append("    cabType: ").append(toIndentedString(cabType)).append("\n");
    sb.append("    numberOfPassenger: ").append(toIndentedString(numberOfPassenger)).append("\n");
    sb.append("    luggageSize: ").append(toIndentedString(luggageSize)).append("\n");
    sb.append("    transmission: ").append(toIndentedString(transmission)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
    sb.append("    ratePerKilometer: ").append(toIndentedString(ratePerKilometer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
