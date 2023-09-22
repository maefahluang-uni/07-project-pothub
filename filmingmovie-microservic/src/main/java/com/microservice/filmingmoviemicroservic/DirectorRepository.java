package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
    public List<Director> findAll();
}
