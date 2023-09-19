package com.adverstis.adverstismicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertiseController {

    @Autowired
    private AdvertiseRepository advertiseRepository;

    @PostMapping("/advertises")
    public ResponseEntity<Advertise> post() {
        return null;
    }
}
