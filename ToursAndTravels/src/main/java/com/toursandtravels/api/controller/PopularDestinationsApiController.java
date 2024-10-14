package com.toursandtravels.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toursandtravels.api.model.PopularDestinationDetails;
import com.toursandtravels.api.service.PopularDestinationDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
@RestController
public class PopularDestinationsApiController implements PopularDestinationsApi {

    private static final Logger log = LoggerFactory.getLogger(PopularDestinationsApiController.class);

    @Autowired
    PopularDestinationDetailsService popularDestinationDetailsService;

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PopularDestinationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PopularDestinationDetails>> popularDestinationsGet() {
        return popularDestinationDetailsService.popularDestinationsGet();
    }

    /**
     * @param PopularDestinationDetails
     * @return
     * @throws JsonProcessingException
     */
    @Override
    public ResponseEntity addPopularDestinationDetails(PopularDestinationDetails popularDestinationDetails)  {
        return popularDestinationDetailsService.addPopularDestinationDetails(popularDestinationDetails);
    }
}
