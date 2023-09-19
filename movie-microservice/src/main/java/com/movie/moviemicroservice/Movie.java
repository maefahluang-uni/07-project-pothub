package com.movie.moviemicroservice;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movid_id;
    private String title;
    private Date year;

    public Movie(Long movid_id, String title, Date year) {
        this.movid_id = movid_id;
        this.title = title;
        this.year = year;
    }

    public Long getMovid_id() {
        return movid_id;
    }

    public void setMovid_id(Long movid_id) {
        this.movid_id = movid_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

}
