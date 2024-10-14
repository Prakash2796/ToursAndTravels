package com.toursandtravels.api.service;

import com.toursandtravels.api.controller.CustomerReviewApiController;
import com.toursandtravels.api.datamodel.CustomerReviewDataModel;
import com.toursandtravels.api.model.CustomerReviewResponse;
import com.toursandtravels.api.repository.CustomerReviewRepository;
import com.toursandtravels.api.utils.ObjectMapperUtils;
import com.toursandtravels.api.utils.TravelsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerReviewService {

    private static final Logger log = LoggerFactory.getLogger(CustomerReviewApiController.class);

    @Autowired
    TravelsUtils travelsUtils;

    @Autowired
    private CustomerReviewRepository customerReviewRepository;


    public ResponseEntity createReview(CustomerReviewResponse request) {
            log.trace("Inside CustomerReviewService>createReview() method.");
        try{
            CustomerReviewDataModel customerReviewDataModel = ObjectMapperUtils.INSTANCE.toEntity(request);
            customerReviewRepository.save(customerReviewDataModel);
            return new ResponseEntity("Review added successfully", HttpStatus.CREATED);
        }catch (Exception e){
            log.error("Failed to create customer review :", e);
            return new ResponseEntity("Booking added successfully", HttpStatus.CREATED);
        }
    }

    public ResponseEntity<List<CustomerReviewResponse>> getCustomerReview() {
        HttpHeaders headers = new HttpHeaders();
        try {

            List<CustomerReviewDataModel> customerReviewDataModelList = customerReviewRepository.findAll();
            List<CustomerReviewResponse> customerReviewResponsesList = new ArrayList<>();
            if(!customerReviewDataModelList.isEmpty()){
                customerReviewDataModelList.forEach(c -> customerReviewResponsesList.add(ObjectMapperUtils.INSTANCE.toRequest(c)));
            }

//            // first review
//            customerReviewResponsesList.add(new CustomerReviewResponse("Varsha Bedi",
//                    "Teacher", "I’ve used this service a few times now. The drivers are always on time, the cars are clean, and I feel safe during the ride. Definitely a reliable option.",
//                    travelsUtils.getByteImage("static/images/customer-review-images/female/female.PNG")));
//
//            //Scoend review
//            customerReviewResponsesList.add(new CustomerReviewResponse("Raj",
//                    "Doctor", "I’m really happy with the service. The driver arrived exactly when I needed, and the car was spotless. Felt safe, and everything was handled professionally.",
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG")));
//
//            //third review
//            customerReviewResponsesList.add(new CustomerReviewResponse("Vishma P. Kumar",
//                    "Engineer", "The car was very clean, and the driver was on time, which I really appreciated. I felt safe throughout the journey, and the whole process was easy.",
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG")));
//
//            //forth review
//            customerReviewResponsesList.add(new CustomerReviewResponse("Vinay",
//                    "Business", "Had a good experience with this service. The cab was clean, and the driver was careful and courteous. Arrived on time, which was a big plus for me.",
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG")));
//
//            //five review
//            customerReviewResponsesList.add(new CustomerReviewResponse("Prakash Sathe",
//                    "Engineer", "The cab was right on time, and I appreciated how clean and fresh it was. The driver was polite, and I felt safe the whole way. Great service!",
//                    travelsUtils.getByteImage("static/images/customer-review-images/male/male.PNG")));

            headers.add("Message", "All Customer Review details");
            return new ResponseEntity<>(customerReviewResponsesList,headers, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Failed to get Custom reviews :", e);
            headers.add("Message", "Failed to get Custom reviews");
            return new ResponseEntity<>(headers, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
