package com.toursandtravels.api.repository;

import com.toursandtravels.api.datamodel.BookTravelNowDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTravelRepository extends JpaRepository<BookTravelNowDataModel, Long> {
    boolean existsByPhone(String phone);
    BookTravelNowDataModel findByPhone(String phone);
}