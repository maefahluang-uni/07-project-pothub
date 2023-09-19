package com.adverstis.adverstismicroservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advertise_id;

    private String adsName;

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
