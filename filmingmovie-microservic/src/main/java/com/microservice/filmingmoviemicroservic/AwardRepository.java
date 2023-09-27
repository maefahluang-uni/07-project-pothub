package com.microservice.filmingmoviemicroservic;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AwardRepository extends CrudRepository<Award, Long> {
    public List<Award> findByName(String name);
}
