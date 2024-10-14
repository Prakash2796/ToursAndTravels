package com.toursandtravels.api.service;

import com.toursandtravels.api.datamodel.BookTravelNowDataModel;
import com.toursandtravels.api.model.BookTravelFormRequest;
import com.toursandtravels.api.model.BookTravelFormWithCarModelRequest;
import com.toursandtravels.api.repository.BookTravelRepository;
import com.toursandtravels.api.utils.ObjectMapperUtils;
import com.toursandtravels.api.utils.RequestBodyValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CabBookingService {

    @Autowired
    private RequestBodyValidator requestBodyValidator;

    @Autowired
    private EmailService emailService;

    @Autowired
    private BookTravelRepository bookTravelRepository;

    @Autowired
    EmailTemplateService emailTemplateService;

    @Value("${com.tour-and-travels-email-sender}")
    String emailSender;


    public ResponseEntity bookTravelJourney(BookTravelFormWithCarModelRequest bookTravelFormWithCarModelRequest) {
        if (requestBodyValidator.isRequestBodyValid(bookTravelFormWithCarModelRequest)) {
            try {

                if (bookTravelRepository.existsByPhone(bookTravelFormWithCarModelRequest.getPhone().toString())) {
                    BookTravelNowDataModel existingBokTravelNowDataModel = bookTravelRepository.findByPhone(bookTravelFormWithCarModelRequest.getPhone().toString());
                    existingBokTravelNowDataModel.setUpdatedDate(LocalDate.now());
                    existingBokTravelNowDataModel.setPickUpLocation(bookTravelFormWithCarModelRequest.getPickUpLocation());
                    existingBokTravelNowDataModel.setDropLocation(bookTravelFormWithCarModelRequest.getDropLocation());
                    bookTravelRepository.save(existingBokTravelNowDataModel);

                   //Sending email to customer
                    emailService.sendEmail(bookTravelFormWithCarModelRequest.getEmailTo(), "Travel Booking Confirmation", emailTemplateService.generateBookingEmail(bookTravelFormWithCarModelRequest));

                    //Sending email to owner
                    emailService.sendEmail(emailSender, "Travel Booking Confirmation", emailTemplateService.generateOwnerNotificationEmail(bookTravelFormWithCarModelRequest));


                    return new ResponseEntity<>("Journey already booked by phone number, journey details has been updated", HttpStatus.OK);
                }
                BookTravelNowDataModel bookTravelNowDataModel = ObjectMapperUtils.INSTANCE.toEntity(bookTravelFormWithCarModelRequest);
                bookTravelNowDataModel.setCreatedDate(LocalDate.now());
                bookTravelNowDataModel.setUpdatedDate(LocalDate.now());

                bookTravelRepository.save(bookTravelNowDataModel);

                //Sending email to customer
                emailService.sendEmail(bookTravelFormWithCarModelRequest.getEmailTo(), "Travel Booking Confirmation", emailTemplateService.generateBookingEmail(bookTravelFormWithCarModelRequest));

                //Sending email to owner
                emailService.sendEmail(emailSender, "Travel Booking Confirmation", emailTemplateService.generateOwnerNotificationEmail(bookTravelFormWithCarModelRequest));

                return new ResponseEntity<>("Booking added successfully", HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>("Failed to book a travel", HttpStatus.INTERNAL_SERVER_ERROR);
            }

//            emailService.sendSimpleEmail("prakash.sathe1491@gmail.com", "test mail", "sample");
        } else {
            return new ResponseEntity<>("Invalid request body", HttpStatus.BAD_REQUEST);
        }

    }


}
