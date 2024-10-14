package com.toursandtravels.api.repository;

import com.toursandtravels.api.datamodel.ContactUsDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactUsRepository extends JpaRepository<ContactUsDataModel, Long> {
}