package com.microservice.filmingmoviemicroservic;

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
    private Long id;
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
        this.id = advertise_id;
        this.adsName = adsName;
    }

    public Long getAdvertise_id() {
        return id;
    }

    public void setAdvertise_id(Long advertise_id) {
        this.id = advertise_id;
    }

    public String getAdsName() {
        return adsName;
    }

    public void setAdsName(String adsName) {
        this.adsName = adsName;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Award getAward() {
        return award;
    }

    public void setAward(Award award) {
        this.award = award;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
