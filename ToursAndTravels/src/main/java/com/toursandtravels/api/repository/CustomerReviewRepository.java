package com.toursandtravels.api.repository;

import com.toursandtravels.api.datamodel.CustomerReviewDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReviewRepository extends JpaRepository<CustomerReviewDataModel, Long> {
}