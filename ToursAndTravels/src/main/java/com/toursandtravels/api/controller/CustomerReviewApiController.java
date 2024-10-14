package com.toursandtravels.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.toursandtravels.api.model.CustomerReviewResponse;
import com.toursandtravels.api.service.CustomerReviewService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
@RestController
public class CustomerReviewApiController implements CustomerReviewApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerReviewApiController.class);

    @Autowired
    CustomerReviewService customerReviewService;

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;



    @org.springframework.beans.factory.annotation.Autowired
    public CustomerReviewApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity customerReviewPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody CustomerReviewResponse body) {
       log.trace("Inside CustomerReviewApiController>customerReviewPost()");
        return customerReviewService.createReview(body);
    }

    @Operation(summary = "Get customer reviews", description = "", tags = {"Customer Review"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CustomerReviewResponse.class)))),
            @ApiResponse(responseCode = "400", description = "Invalid input")})
    @RequestMapping(value = "/getcustomerReview",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<CustomerReviewResponse>> getCustomerReview(){
        log.trace("Inside CustomerReviewApiController>getCustomerReview() method");
        return customerReviewService.getCustomerReview();
    }

}
