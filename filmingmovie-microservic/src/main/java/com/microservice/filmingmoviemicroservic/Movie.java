package com.microservice.filmingmoviemicroservic;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movid_id;
    private String title;
    private Date year;

    // One-to-Many relationship with Award
    @OneToMany(mappedBy = "movie")
    private List<Award> awards;

    // Many-to-One relationship with Director
    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    // One-to-One relationship with Advertise
    @OneToOne(mappedBy = "movie")
    private Advertise advertise;

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

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Advertise getAdvertise() {
        return advertise;
    }

    public void setAdvertise(Advertise advertise) {
        this.advertise = advertise;
    }

}
