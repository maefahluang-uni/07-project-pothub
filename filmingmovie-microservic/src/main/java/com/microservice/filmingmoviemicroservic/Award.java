package com.microservice.filmingmoviemicroservic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long award_id;
    private String name;
    private String genre;

    // Many-to-One relationship with Movie
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    // One-to-One relationship with Advertise
    @OneToOne
    @JoinColumn(name = "advertise_id", unique = true)
    private Advertise advertise;

    public Award() {
    }

    public Award(Long award_id, String award_name, String genre) {
        this.award_id = award_id;
        this.name = award_name;
        this.genre = genre;
    }

    public Long getAward_id() {
        return award_id;
    }

    public void setAward_id(Long award_id) {
        this.award_id = award_id;
    }

    public String getAward_name() {
        return name;
    }

    public void setAward_name(String award_name) {
        this.name = award_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Advertise getAdvertise() {
        return advertise;
    }

    public void setAdvertise(Advertise advertise) {
        this.advertise = advertise;
    }

}
