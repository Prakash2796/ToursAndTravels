package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CustomerReviewResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")



public class CustomerReviewResponse   {

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("profession")
  private String profession = null;

  @JsonProperty("reviewDetails")
  private String reviewDetails = null;

  private byte[] image;

  public CustomerReviewResponse(String customerName, String profession, String reviewDetails, byte[] image) {
    this.customerName = customerName;
    this.profession = profession;
    this.reviewDetails = reviewDetails;
    this.image = image;
  }

  public CustomerReviewResponse customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Name of the customer
   * @return customerName
   **/
  @Schema(required = true, description = "Name of the customer")
      @NotNull

    public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public CustomerReviewResponse profession(String profession) {
    this.profession = profession;
    return this;
  }

  /**
   * Profession of the customer
   * @return profession
   **/
  @Schema(required = true, description = "Profession of the customer")
      @NotNull

    public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public CustomerReviewResponse reviewDetails(String reviewDetails) {
    this.reviewDetails = reviewDetails;
    return this;
  }

  /**
   * Details of the review
   * @return reviewDetails
   **/
  @Schema(required = true, description = "Details of the review")
      @NotNull

    public String getReviewDetails() {
    return reviewDetails;
  }

  public void setReviewDetails(String reviewDetails) {
    this.reviewDetails = reviewDetails;
  }


  public CustomerReviewResponse image(byte[] image) {
    this.image = image;
    return this;
  }
  /**
   * Image
   * @return reviewDetails
   **/
  @Schema(required = true, description = "Image")
  @NotNull

  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerReviewResponse customerReviewResponse = (CustomerReviewResponse) o;
    return Objects.equals(this.customerName, customerReviewResponse.customerName) &&
        Objects.equals(this.profession, customerReviewResponse.profession) &&
        Objects.equals(this.reviewDetails, customerReviewResponse.reviewDetails) &&
       Objects.equals(this.image, customerReviewResponse.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, profession, reviewDetails, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerReviewResponse {\n");
    
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    reviewDetails: ").append(toIndentedString(reviewDetails)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
