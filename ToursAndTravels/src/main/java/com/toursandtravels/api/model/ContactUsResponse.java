package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * ContactUsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
public class ContactUsResponse {

  @JsonProperty("customerCare")
  private List<CustomerCareResponse> customerCare;

  @JsonProperty("needLiveSupportEmail")
  private String needLiveSupportEmail;



  // Constructor for CustomerCare
  public ContactUsResponse(List<CustomerCareResponse> customerCare, String needLiveSupportEmail) {
    this.customerCare = customerCare;
    this.needLiveSupportEmail = needLiveSupportEmail;
  }



  // Getters and Setters

  public List<CustomerCareResponse> getCustomerCare() {
    return customerCare;
  }

  public void setCustomerCare(List<CustomerCareResponse> customerCare) {
    this.customerCare = customerCare;
  }

  public String getNeedLiveSupportEmail() {
    return needLiveSupportEmail;
  }

  public void setNeedLiveSupportEmail(String needLiveSupportEmail) {
    this.needLiveSupportEmail = needLiveSupportEmail;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactUsResponse that = (ContactUsResponse) o;
    return Objects.equals(customerCare, that.customerCare) &&
            Objects.equals(needLiveSupportEmail, that.needLiveSupportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCare, needLiveSupportEmail);
  }

  @Override
  public String toString() {
    return "ContactUsResponse{" +
            "customerCare=" + customerCare +
            ", needLiveSupportEmail='" + needLiveSupportEmail + '\''+
            '}';
  }

  // Nested InnerContactUs class

}
