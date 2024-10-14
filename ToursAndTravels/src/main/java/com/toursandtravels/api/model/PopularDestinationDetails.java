package com.toursandtravels.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * PopularDestinationDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")


public class PopularDestinationDetails   {
  @JsonProperty("destinationName")
  private String destinationName = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("mapAddress")
  private String mapAddress = null;

  @JsonProperty("address")
  private String address = null;

  public PopularDestinationDetails(String destinationName, String image, String mapAddress, String address) {
    this.destinationName = destinationName;
    this.image = image;
    this.mapAddress = mapAddress;
    this.address = address;
  }

  public PopularDestinationDetails destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  /**
   * Name of the destination
   * @return destinationName
   **/
  @Schema(description = "Name of the destination")
  
    public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public PopularDestinationDetails image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Image of the destination
   * @return image
   **/
  @Schema(description = "Image of the destination")
  
    public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public PopularDestinationDetails mapAddress(String mapAddress) {
    this.mapAddress = mapAddress;
    return this;
  }

  /**
   * map location of booking office
   * @return mapAddress
   **/
  @Schema(description = "map location of booking office")
  
    public String getMapAddress() {
    return mapAddress;
  }

  public void setMapAddress(String mapAddress) {
    this.mapAddress = mapAddress;
  }

  public PopularDestinationDetails address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get contactUs
   * @return contactUs
   **/
  @Schema(description = "")
  
    @Valid
    public String getAddress() {
    return address;
  }

  public void setContactUs(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopularDestinationDetails popularDestinationDetails = (PopularDestinationDetails) o;
    return Objects.equals(this.destinationName, popularDestinationDetails.destinationName) &&
        Objects.equals(this.image, popularDestinationDetails.image) &&
        Objects.equals(this.mapAddress, popularDestinationDetails.mapAddress) &&
        Objects.equals(this.address, popularDestinationDetails.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationName, image, mapAddress, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularDestinationDetails {\n");
    
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    mapAddress: ").append(toIndentedString(mapAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
