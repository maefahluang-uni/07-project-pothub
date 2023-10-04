package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertiseController {

    @Autowired
    private AdvertiseRepository advertiseRepository;

    @GetMapping("/advertises")
    public ResponseEntity<List<Advertise>> getAllAdvertise() {
        List<Advertise> advertises = advertiseRepository.findAll();

        return new ResponseEntity<>(advertises, HttpStatus.OK);
    }

    @GetMapping("/advertises/{id}")
    public ResponseEntity<List<Advertise>> getByidAdvertise(@PathVariable Long id) {
        List<Advertise> advertises = advertiseRepository.findByid(id);

        return new ResponseEntity<>(advertises, HttpStatus.OK);
    }

    @PostMapping("/advertises")
    public ResponseEntity<Advertise> createAdvertise(@RequestBody Advertise advertise) {
        // Perform the logic to save the new advertisement to the database
        Advertise savedAdvertise = advertiseRepository.save(advertise);

        // Return a ResponseEntity with the saved advertisement and a status code
        return new ResponseEntity<>(savedAdvertise, HttpStatus.CREATED);
    }
}
