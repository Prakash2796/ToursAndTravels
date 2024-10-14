package com.toursandtravels.api.repository;

import com.toursandtravels.api.datamodel.PopularCarHireDetailsDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularCarHireDetailsRepository extends JpaRepository<PopularCarHireDetailsDataModel, Long> {
}
