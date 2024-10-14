package com.toursandtravels.api.repository;

import com.toursandtravels.api.datamodel.PopularDestinationDetailsDataModel;
import com.toursandtravels.api.model.PopularDestinationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopularDestinationDetailsRepository extends JpaRepository<PopularDestinationDetailsDataModel, Long> {
}
