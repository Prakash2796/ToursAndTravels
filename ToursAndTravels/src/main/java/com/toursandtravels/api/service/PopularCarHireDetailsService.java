package com.toursandtravels.api.service;

import com.toursandtravels.api.datamodel.CabImage;
import com.toursandtravels.api.datamodel.PopularCarHireDetailsDataModel;
import com.toursandtravels.api.model.PopularCarHireDetailsRequestResponseBody;
import com.toursandtravels.api.repository.PopularCarHireDetailsRepository;
import com.toursandtravels.api.utils.ObjectMapperUtils;
import com.toursandtravels.api.utils.TravelsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Service
public class PopularCarHireDetailsService {
    private static final Logger log = LoggerFactory.getLogger(PopularCarHireDetailsService.class);

    @Autowired
    TravelsUtils travelsUtils;

    @Autowired
    PopularCarHireDetailsRepository popularCarHireDetailsRepository;


    public ResponseEntity addPopularCarHireDetails(PopularCarHireDetailsRequestResponseBody request) {

        HttpHeaders headers = new HttpHeaders();
        try {
            PopularCarHireDetailsDataModel popularCarHireDetailsDataModel = new PopularCarHireDetailsDataModel();
            popularCarHireDetailsDataModel.setCabType(request.getCabType());
            popularCarHireDetailsDataModel.setNumberOfPassenger(request.getNumberOfPassenger());
            popularCarHireDetailsDataModel.setLuggageSize(request.getLuggageSize());
            popularCarHireDetailsDataModel.setTransmission(request.getTransmission());
            popularCarHireDetailsDataModel.setFuelType(request.getFuelType());
            popularCarHireDetailsDataModel.setRating(request.getRating());
            popularCarHireDetailsDataModel.setReviewCount(request.getReviewCount());
            popularCarHireDetailsDataModel.setRatePerKilometer(request.getRatePerKilometer());

            // Handle cab images
            for (String base64Image : request.getCabImageList()) {
                byte[] imageData = Base64.getDecoder().decode(base64Image);
                CabImage cabImage = new CabImage(imageData);
                popularCarHireDetailsDataModel.addCabImage(cabImage);
            }

            popularCarHireDetailsRepository.save(popularCarHireDetailsDataModel);
            return new ResponseEntity<>("Booking added successfully", HttpStatus.CREATED);
        } catch (Exception exception) {
            log.error("Failed to add popular car hire details in database : ", exception);
            headers.add("Message", "Failed to add popular car hire details in database : " + exception);
            return new ResponseEntity<>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<PopularCarHireDetailsRequestResponseBody>> getPopularCarHireDetailsGet() {

        HttpHeaders headers = new HttpHeaders();
        try {

            List<PopularCarHireDetailsDataModel> popularCarHireDetailsDataModelList = popularCarHireDetailsRepository.findAll();

            List<PopularCarHireDetailsRequestResponseBody> popularCarHireDetailsRequestResponseBodiesList = new ArrayList<>();

            popularCarHireDetailsDataModelList.forEach(p -> {
                List<String> cabImageList = new ArrayList<>();
                p.getCabImageList().forEach(pi -> {
                    try {
                        Blob blob = new SerialBlob(pi.getImageData());
                        String base64Image = Base64.getEncoder().encodeToString(blob.getBytes(1, (int) blob.length()));
                        cabImageList.add(base64Image);
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }

                });
                popularCarHireDetailsRequestResponseBodiesList.add(new PopularCarHireDetailsRequestResponseBody(cabImageList, p.getCabType(), p.getNumberOfPassenger(), p.getLuggageSize(), p.getTransmission(), p.getFuelType(), p.getRating(), p.getReviewCount(), p.getRatePerKilometer()));
            });


//            popularCarHireDetailsRequestResponseBodyList.add(new PopularCarHireDetailsRequestResponseBody(Arrays.asList(travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString(),
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString()),
//                    "Hatchback Cab", 4, BigDecimal.ONE, "Automatic", "Petrol", 4.8f, 6554, 11f));
//
//            popularCarHireDetailsRequestResponseBodyList.add(new PopularCarHireDetailsRequestResponseBody(Arrays.asList(travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString(),
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString()),
//                    "Sedan Cab", 4, BigDecimal.ONE, "Automatic", "Petrol", 4.8f, 6554, 11f));
//
//            popularCarHireDetailsRequestResponseBodyList.add(new PopularCarHireDetailsRequestResponseBody(Arrays.asList(travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString(),
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString()),
//                    "Luv Cab", 4, BigDecimal.ONE, "Automatic", "Petrol", 4.8f, 6554, 11f));
//
//
//            popularCarHireDetailsRequestResponseBodyList.add(new PopularCarHireDetailsRequestResponseBody(Arrays.asList(travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString(),
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString()),
//                    "Suv Cab", 4, BigDecimal.ONE, "Automatic", "Petrol", 4.8f, 6554, 11f));
//
//            popularCarHireDetailsRequestResponseBodyList.add(new PopularCarHireDetailsRequestResponseBody(Arrays.asList(travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString(),
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG").toString()),
//                    "Tempo Cab", 4, BigDecimal.ONE, "Automatic", "Petrol", 4.8f, 6554, 11f));
//

            headers.add("Message", "All Popular car hire details");
            return new ResponseEntity<>(popularCarHireDetailsRequestResponseBodiesList, headers, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Failed to get car hire details :", e);
            headers.add("Message", "Failed to get car hire details");
            return new ResponseEntity<>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
