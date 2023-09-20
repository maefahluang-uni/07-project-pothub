package com.filmingmovie.pubsubfilmingmovie;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
    public List<Director> findAll();
}
