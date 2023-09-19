package com.adverstis.adverstismicroservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Advertise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advertise_id;
    private String adsName;

    // One-to-One relationship with Movie
    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    // One-to-One relationship with Award
    @OneToOne(mappedBy = "advertise")
    private Award award;

    // Many-to-One relationship with Director
    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    // Many-to-One relationship with Company
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Advertise() {
    }

    public Advertise(Long advertise_id, String adsName) {
        this.advertise_id = advertise_id;
        this.adsName = adsName;
    }

    public Long getAdvertise_id() {
        return advertise_id;
    }

    public void setAdvertise_id(Long advertise_id) {
        this.advertise_id = advertise_id;
    }

    public String getAdsName() {
        return adsName;
    }

    public void setAdsName(String adsName) {
        this.adsName = adsName;
    }

}
