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

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long movid_id;
    private String firstname;
    private String lastname;
    private Date birthday;

    // One-to-Many relationship with Advertise
    @OneToMany(mappedBy = "director")
    private List<Advertise> advertisements;

    // Many-to-One relationship with Company
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Director() {
    }

    public Director(Long movid_id, String firstname, String lastname, Date birthday) {
        this.movid_id = movid_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public Long getMovid_id() {
        return movid_id;
    }

    public void setMovid_id(Long movid_id) {
        this.movid_id = movid_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Advertise> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(List<Advertise> advertisements) {
        this.advertisements = advertisements;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
