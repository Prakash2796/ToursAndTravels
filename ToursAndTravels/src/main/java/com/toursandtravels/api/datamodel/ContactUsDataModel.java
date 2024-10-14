package com.toursandtravels.api.datamodel;

import com.toursandtravels.api.model.CustomerCareResponse;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contact_us")
public class ContactUsDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_us_id")
    private List<CustomerCare> customerCare;

    private String needLiveSupportEmail;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CustomerCare> getCustomerCare() {
        return customerCare;
    }

    public void setCustomerCare(List<CustomerCare> customerCare) {
        this.customerCare = customerCare;
    }

    public String getNeedLiveSupportEmail() {
        return needLiveSupportEmail;
    }

    public void setNeedLiveSupportEmail(String needLiveSupportEmail) {
        this.needLiveSupportEmail = needLiveSupportEmail;
    }
}

