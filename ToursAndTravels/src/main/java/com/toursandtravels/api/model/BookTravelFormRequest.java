package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

/**
 * BookTravelFormRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")


public class BookTravelFormRequest   {
  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("pickUp")
  private String pickUp = null;

  @JsonProperty("drop")
  private String drop = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("travelDate")
  private LocalDate travelDate = null;

  @JsonProperty("carModelType")
  private String carModelType = null;

  public BookTravelFormRequest fullName(String fullName) {
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

  public BookTravelFormRequest pickUp(String pickUp) {
    this.pickUp = pickUp;
    return this;
  }

  /**
   * Pick-up location
   * @return pickUp
   **/
  @Schema(required = true, description = "Pick-up location")
      @NotNull

    public String getPickUp() {
    return pickUp;
  }

  public void setPickUp(String pickUp) {
    this.pickUp = pickUp;
  }

  public BookTravelFormRequest drop(String drop) {
    this.drop = drop;
    return this;
  }

  /**
   * Drop location
   * @return drop
   **/
  @Schema(required = true, description = "Drop location")
      @NotNull

    public String getDrop() {
    return drop;
  }

  public void setDrop(String drop) {
    this.drop = drop;
  }

  public BookTravelFormRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the traveler
   * @return phone
   **/
  @Schema(required = true, description = "Phone number of the traveler")
      @NotNull

    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public BookTravelFormRequest travelDate(LocalDate travelDate) {
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

  public BookTravelFormRequest carModelType(String carModelType) {
    this.carModelType = carModelType;
    return this;
  }

  /**
   * Type of car model requested
   * @return carModelType
   **/
  @Schema(required = true, description = "Type of car model requested")
      @NotNull

    public String getCarModelType() {
    return carModelType;
  }

  public void setCarModelType(String carModelType) {
    this.carModelType = carModelType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookTravelFormRequest bookTravelFormRequest = (BookTravelFormRequest) o;
    return Objects.equals(this.fullName, bookTravelFormRequest.fullName) &&
        Objects.equals(this.pickUp, bookTravelFormRequest.pickUp) &&
        Objects.equals(this.drop, bookTravelFormRequest.drop) &&
        Objects.equals(this.phone, bookTravelFormRequest.phone) &&
        Objects.equals(this.travelDate, bookTravelFormRequest.travelDate) &&
        Objects.equals(this.carModelType, bookTravelFormRequest.carModelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, pickUp, drop, phone, travelDate, carModelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookTravelFormRequest {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    pickUp: ").append(toIndentedString(pickUp)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    travelDate: ").append(toIndentedString(travelDate)).append("\n");
    sb.append("    carModelType: ").append(toIndentedString(carModelType)).append("\n");
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
