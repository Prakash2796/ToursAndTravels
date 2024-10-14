package com.toursandtravels.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.toursandtravels.api.model.ContactUsResponse;
import com.toursandtravels.api.service.ContactUsService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
@RestController
public class
GetContactUsDetailsApiController implements GetContactUsDetailsApi {

    private static final Logger log = LoggerFactory.getLogger(GetContactUsDetailsApiController.class);

    @Autowired
    ContactUsService contactUsService;
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetContactUsDetailsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity postContactUsDetails(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody ContactUsResponse body){
        log.trace("Inside GetContactUsDetailsApiController>postContactUsDetails()");
        return contactUsService.addContactUsDetails(body);
    }
    public ResponseEntity<ContactUsResponse> getContactUsDetailsGet() {
       return contactUsService.getContactUsDetails();
    }

}
