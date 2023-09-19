package com.aword.awordmicroservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Award {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long award_id;
    private String award_name;
    private String genre;

    public Award() {
    }

    public Award(Long award_id, String award_name, String genre) {
        this.award_id = award_id;
        this.award_name = award_name;
        this.genre = genre;
    }

    public Long getAward_id() {
        return award_id;
    }

    public void setAward_id(Long award_id) {
        this.award_id = award_id;
    }

    public String getAward_name() {
        return award_name;
    }

    public void setAward_name(String award_name) {
        this.award_name = award_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
