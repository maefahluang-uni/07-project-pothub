package com.microservice.filmingmoviemicroservic;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AwardRepository extends CrudRepository<Award, Long> {
    public List<Award> findByName(String name);
}
