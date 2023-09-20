package com.advertisement.pubsubadvertisement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertiseController {

    @Autowired
    private AdvertiseRepository advertiseRepository;

    @PostMapping("/advertises")
    public ResponseEntity<Advertise> createAdvertise(@RequestBody Advertise advertise) {
        // Perform the logic to save the new advertisement to the database
        Advertise savedAdvertise = advertiseRepository.save(advertise);

        // Return a ResponseEntity with the saved advertisement and a status code
        return new ResponseEntity<>(savedAdvertise, HttpStatus.CREATED);
    }
}
