package com.toursandtravels.api.service;

import com.toursandtravels.api.controller.GetContactUsDetailsApiController;
import com.toursandtravels.api.datamodel.ContactUsDataModel;
import com.toursandtravels.api.datamodel.CustomerCare;
import com.toursandtravels.api.datamodel.CustomerReviewDataModel;
import com.toursandtravels.api.model.ContactUsResponse;
import com.toursandtravels.api.model.CustomerCareResponse;
import com.toursandtravels.api.repository.ContactUsRepository;
import com.toursandtravels.api.utils.ObjectMapperUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ContactUsService {

    private static final Logger log = LoggerFactory.getLogger(ContactUsService.class);

    @Autowired
    ContactUsRepository contactUsRepository;

    public ResponseEntity addContactUsDetails(ContactUsResponse contactUsResponse) {
        log.trace("Inside ContactUsService>addContactUsDetails() method.");
        try {
            ContactUsDataModel contactUsDataModel = new ContactUsDataModel();

            List<CustomerCare> customerCare = new ArrayList<>();

            contactUsResponse.getCustomerCare().forEach(cc -> customerCare.add(ObjectMapperUtils.INSTANCE.toEntity(cc)));

            contactUsDataModel.setNeedLiveSupportEmail(contactUsResponse.getNeedLiveSupportEmail());
            contactUsDataModel.setCustomerCare(customerCare);

            contactUsRepository.save(contactUsDataModel);

            return new ResponseEntity("Contact details added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Failed to add contact details", e);
            return new ResponseEntity("Failed to add contact details", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ContactUsResponse> getContactUsDetails() {

        HttpHeaders headers = new HttpHeaders();
        try {
            return new ResponseEntity<>(ObjectMapperUtils.INSTANCE.toRequest(contactUsRepository.findAll().get(0)), headers, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Failed to get contact us details", e);
            return new ResponseEntity("Failed to get contact us details", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
