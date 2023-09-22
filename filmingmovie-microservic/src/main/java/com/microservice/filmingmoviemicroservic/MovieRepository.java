package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
    public List<Movie> findByTitle(String title);

    public List<Movie> findAll();
}
