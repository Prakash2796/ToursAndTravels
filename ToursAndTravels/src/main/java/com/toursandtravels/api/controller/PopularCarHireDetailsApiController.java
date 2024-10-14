package com.toursandtravels.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toursandtravels.api.model.PopularCarHireDetailsRequestResponseBody;
import com.toursandtravels.api.service.PopularCarHireDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-29T14:44:32.943+05:30[Asia/Calcutta]")
@RestController
public class PopularCarHireDetailsApiController implements GetPopularCarHireDetailsApi {

    private static final Logger log = LoggerFactory.getLogger(PopularCarHireDetailsApiController.class);

    @Autowired
    PopularCarHireDetailsService popularCarHireDetailsService;
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PopularCarHireDetailsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PopularCarHireDetailsRequestResponseBody>> getPopularCarHireDetailsGet() throws JsonProcessingException {
        return popularCarHireDetailsService.getPopularCarHireDetailsGet();
    }

    /**
     * @return
     * @throws JsonProcessingException
     */
    @Override
    public ResponseEntity addPopularCarHireDetailsGet(PopularCarHireDetailsRequestResponseBody popularCarHireDetailsRequestResponseBody) throws JsonProcessingException {
        return popularCarHireDetailsService.addPopularCarHireDetails(popularCarHireDetailsRequestResponseBody);
    }

}
