package com.filmingmovie.pubsubfilmingmovie;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long company_id;
    private String company_name;

    // One-to-Many relationship with Advertise
    @OneToMany(mappedBy = "company")
    private List<Advertise> advertisements;

    public Company() {
    }

    public Company(Long company_id, String company_name) {
        this.company_id = company_id;
        this.company_name = company_name;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

}
