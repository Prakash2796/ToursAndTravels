/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.toursandtravels.api.controller;

import com.toursandtravels.api.model.ContactUsResponse;
import com.toursandtravels.api.model.CustomerReviewResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
@Validated
public interface CustomerReviewApi {

    @Operation(summary = "Submit a customer review", description = "", tags = {"Customer Review"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Customer review submitted successfully"),

            @ApiResponse(responseCode = "400", description = "Invalid input")})
    @RequestMapping(value = "/customerReview",
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> customerReviewPost(@Parameter(in = ParameterIn.DEFAULT, description = "", required = true, schema = @Schema()) @Valid @RequestBody CustomerReviewResponse body);


    @Operation(summary = "Get customer reviews", description = "", tags = {"Customer Review"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CustomerReviewResponse.class)))),
            @ApiResponse(responseCode = "400", description = "Invalid input")})
    @RequestMapping(value = "/getcustomerReview",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<CustomerReviewResponse>> getCustomerReview();
}

