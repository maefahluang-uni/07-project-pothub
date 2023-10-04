package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    public List<Company> findAll();
}
