package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdvertiseRepository extends CrudRepository<Advertise, Long> {
    public List<Advertise> findAll();
    public List<Advertise> findByid(Long id);
}
