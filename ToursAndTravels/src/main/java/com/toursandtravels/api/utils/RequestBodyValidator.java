package com.toursandtravels.api.utils;

import com.toursandtravels.api.model.BookTravelFormRequest;
import com.toursandtravels.api.model.BookTravelFormWithCarModelRequest;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Component
public class RequestBodyValidator {

    public Boolean isRequestBodyValid(Object object){
        if(object instanceof BookTravelFormWithCarModelRequest){
            BookTravelFormWithCarModelRequest body = ((BookTravelFormWithCarModelRequest) object);
           return Strings.isNotEmpty(body.getFullName()) && Strings.isNotEmpty(body.getPhone().toString()) &&
                   body.getPhone().toString().length() == 10 &&
                    (body.getTravelDate().isEqual(LocalDate.now()) || body.getTravelDate().isAfter(LocalDate.now()));
        }
        return Boolean.FALSE;
    }
    //__________________________________________________________________________________________________________________
}
