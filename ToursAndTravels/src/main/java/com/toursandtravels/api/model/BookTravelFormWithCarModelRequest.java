package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

/**
 * BookTravelFormWithCarModelRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")


public class BookTravelFormWithCarModelRequest   {
  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("pickUpLocation")
  private String pickUpLocation = null;

  @JsonProperty("dropLocation")
  private String dropLocation = null;

  @JsonProperty("phone")
  private BigDecimal phone = null;

  @JsonProperty("travelDate")
  private LocalDate travelDate = null;

  @JsonProperty("cabType")
  private String cabType = null;

  @JsonProperty("cabName")
  private String cabName = null;

  @JsonProperty("noOfPassenger")
  private BigDecimal noOfPassenger = null;

  private String emailTo;

  public BookTravelFormWithCarModelRequest fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the traveler
   * @return fullName
   **/
  @Schema(required = true, description = "Full name of the traveler")
      @NotNull

    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public BookTravelFormWithCarModelRequest phone(BigDecimal phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the traveler
   * @return phone
   **/
  @Schema(required = true, description = "Phone number of the traveler")
      @NotNull

    @Valid
    public BigDecimal getPhone() {
    return phone;
  }

  public void setPhone(BigDecimal phone) {
    this.phone = phone;
  }

  public BookTravelFormWithCarModelRequest pickUpLocation(String pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
    return this;
  }

  /**
   * Pick-up location
   * @return pickUpLocation
   **/
  @Schema(description = "Pick-up location")
  
    public String getPickUpLocation() {
    return pickUpLocation;
  }

  public void setPickUpLocation(String pickUpLocation) {
    this.pickUpLocation = pickUpLocation;
  }

  public BookTravelFormWithCarModelRequest dropLocation(String dropLocation) {
    this.dropLocation = dropLocation;
    return this;
  }

  /**
   * Drop location
   * @return dropLocation
   **/
  @Schema(description = "Drop location")
  
    public String getDropLocation() {
    return dropLocation;
  }

  public void setDropLocation(String dropLocation) {
    this.dropLocation = dropLocation;
  }

  public BookTravelFormWithCarModelRequest travelDate(LocalDate travelDate) {
    this.travelDate = travelDate;
    return this;
  }

  /**
   * Date of travel
   * @return travelDate
   **/
  @Schema(required = true, description = "Date of travel")
      @NotNull

    @Valid
    public LocalDate getTravelDate() {
    return travelDate;
  }

  public void setTravelDate(LocalDate travelDate) {
    this.travelDate = travelDate;
  }

  public BookTravelFormWithCarModelRequest cabType(String cabType) {
    this.cabType = cabType;
    return this;
  }

  /**
   * Type of the car
   * @return cabType
   **/
  @Schema(required = true, description = "Type of the car")
      @NotNull

    public String getCabType() {
    return cabType;
  }

  public void setCabType(String cabType) {
    this.cabType = cabType;
  }

  public BookTravelFormWithCarModelRequest cabName(String cabName) {
    this.cabName = cabName;
    return this;
  }

  /**
   * Name of the cab
   * @return cabName
   **/
  @Schema(required = true, description = "Name of the cab")
      @NotNull

    public String getCabName() {
    return cabName;
  }

  public void setCabName(String cabName) {
    this.cabName = cabName;
  }

  public BookTravelFormWithCarModelRequest noOfPassenger(BigDecimal noOfPassenger) {
    this.noOfPassenger = noOfPassenger;
    return this;
  }

  /**
   * number of passenger
   * @return noOfPassenger
   **/
  @Schema(description = "number of passenger")
  
    @Valid
    public BigDecimal getNoOfPassenger() {
    return noOfPassenger;
  }

  public void setNoOfPassenger(BigDecimal noOfPassenger) {
    this.noOfPassenger = noOfPassenger;
  }

   /*
   *emailTo
   * @return emailTo
   **/
  @Schema(description = "emailTo")

  public String getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(String emailTo) {
    this.emailTo = emailTo;
  }

  public BookTravelFormWithCarModelRequest emailTo(String emailTo) {
    this.emailTo = emailTo;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookTravelFormWithCarModelRequest bookTravelFormWithCarModelRequest = (BookTravelFormWithCarModelRequest) o;
    return Objects.equals(this.fullName, bookTravelFormWithCarModelRequest.fullName) &&
        Objects.equals(this.phone, bookTravelFormWithCarModelRequest.phone) &&
        Objects.equals(this.pickUpLocation, bookTravelFormWithCarModelRequest.pickUpLocation) &&
        Objects.equals(this.dropLocation, bookTravelFormWithCarModelRequest.dropLocation) &&
        Objects.equals(this.travelDate, bookTravelFormWithCarModelRequest.travelDate) &&
        Objects.equals(this.cabType, bookTravelFormWithCarModelRequest.cabType) &&
        Objects.equals(this.cabName, bookTravelFormWithCarModelRequest.cabName) &&
        Objects.equals(this.noOfPassenger, bookTravelFormWithCarModelRequest.noOfPassenger) &&
        Objects.equals(this.emailTo, bookTravelFormWithCarModelRequest.emailTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, phone, pickUpLocation, dropLocation, travelDate, cabType, cabName, noOfPassenger, emailTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookTravelFormWithCarModelRequest {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pickUpLocation: ").append(toIndentedString(pickUpLocation)).append("\n");
    sb.append("    dropLocation: ").append(toIndentedString(dropLocation)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    cabType: ").append(toIndentedString(cabType)).append("\n");
    sb.append("    cabName: ").append(toIndentedString(cabName)).append("\n");
    sb.append("    noOfPassenger: ").append(toIndentedString(noOfPassenger)).append("\n");
    sb.append("    emailTo: ").append(toIndentedString(emailTo)).append("\n");
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
