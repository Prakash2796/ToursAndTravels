package com.toursandtravels.api.utils;

import com.toursandtravels.api.datamodel.*;
import com.toursandtravels.api.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ObjectMapperUtils {

    ObjectMapperUtils INSTANCE = Mappers.getMapper(ObjectMapperUtils.class);

    @Mapping(source = "fullName", target = "fullName")
    @Mapping(source = "pickUpLocation", target = "pickUpLocation")
    @Mapping(source = "dropLocation", target = "dropLocation")
    @Mapping(source = "phone", target = "phone")
    @Mapping(source = "travelDate", target = "travelDate")
    @Mapping(source = "cabType", target = "cabType")
    @Mapping(source = "cabName", target = "cabName")
    @Mapping(source = "noOfPassenger", target = "noOfPassenger")
    BookTravelNowDataModel toEntity(BookTravelFormWithCarModelRequest request);


    @Mapping(source = "customerName", target = "customerName")
    @Mapping(source = "profession", target = "profession")
    @Mapping(source = "reviewDetails", target = "reviewDetails")
    CustomerReviewDataModel toEntity(CustomerReviewResponse request);

    // If needed, you can also add a reverse mapping
    CustomerReviewResponse toRequest(CustomerReviewDataModel entity);



    @Mapping(source = "customerCare", target = "customerCare")
    @Mapping(source = "needLiveSupportEmail", target = "needLiveSupportEmail")
    ContactUsDataModel toEntity(ContactUsResponse request);
    CustomerCare toEntity(CustomerCareResponse customerCareResponse);

    CustomerCareResponse toRequest(CustomerCare entity);

    ContactUsResponse toRequest(ContactUsDataModel contactUsDataModel);

}
