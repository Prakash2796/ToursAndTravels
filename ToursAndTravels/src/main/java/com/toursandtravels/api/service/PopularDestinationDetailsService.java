package com.toursandtravels.api.service;

import com.toursandtravels.api.datamodel.CabImage;
import com.toursandtravels.api.datamodel.PopularDestinationDetailsDataModel;
import com.toursandtravels.api.model.PopularCarHireDetailsRequestResponseBody;
import com.toursandtravels.api.model.PopularDestinationDetails;
import com.toursandtravels.api.repository.PopularDestinationDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class PopularDestinationDetailsService {

    private static final Logger log = LoggerFactory.getLogger(PopularDestinationDetailsService.class);

    @Autowired
    PopularDestinationDetailsRepository popularDestinationDetailsRepository;

    public ResponseEntity addPopularDestinationDetails(PopularDestinationDetails popularDestinationDetails) {
        log.trace("Inside PopularDestinationDetailsService>addPopularDestinationDetails() method.");
        try {

            PopularDestinationDetailsDataModel popularCarHireDetailsDataModel = new PopularDestinationDetailsDataModel();
            popularCarHireDetailsDataModel.setDestinationName(popularDestinationDetails.getDestinationName());
            popularCarHireDetailsDataModel.setImage(Base64.getDecoder().decode(popularDestinationDetails.getImage()));
            popularCarHireDetailsDataModel.setMapAddress("");
            popularCarHireDetailsDataModel.setAddress(popularDestinationDetails.getAddress());

            popularDestinationDetailsRepository.save(popularCarHireDetailsDataModel);
            return new ResponseEntity<>("Popular destination details added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Failed to add popular destination details :", e);
            return new ResponseEntity<>("Failed to add popular destination details", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public ResponseEntity popularDestinationsGet() {
        log.trace("Inside PopularDestinationDetailsService>popularDestinationsGet() method.");

        try {
            List<PopularDestinationDetailsDataModel> popularDestinationDetailsDataModelList = popularDestinationDetailsRepository.findAll();
            List<PopularDestinationDetails> popularDestinationDetailsList = new ArrayList<>();

            popularDestinationDetailsDataModelList.forEach(p -> {
                String base64Image = "";
                try {
                    Blob blob = new SerialBlob(p.getImage());
                    base64Image = Base64.getEncoder().encodeToString(blob.getBytes(1, (int) blob.length()));
                } catch (SQLException e) {
                    log.error("Failed to get destination image:", e);
                }

                popularDestinationDetailsList.add(new PopularDestinationDetails(p.getDestinationName(), base64Image, p.getMapAddress(), p.getAddress()));
            });
            return new ResponseEntity(popularDestinationDetailsList, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
