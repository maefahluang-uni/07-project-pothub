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
public class AwardController {

    // @Autowired
    // private AwardRepository awardRepository;

    // @GetMapping("/awards/{name}")
    // public ResponseEntity<List<Award>> getAwardsByName(@PathVariable String name)
    // {
    // // Use the repository method to find awards by name
    // List<Award> awards = awardRepository.findByName(name);

    // if (awards.isEmpty()) {
    // // If no awards are found, return a 404 Not Found status
    // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    // } else {
    // // If awards are found, return them with a 200 OK status
    // return new ResponseEntity<>(awards, HttpStatus.OK);
    // }
    // }

    // @PostMapping("/awards")
    // public ResponseEntity<Award> createAward(@RequestBody Award award) {
    // // Perform the logic to save the new award to the database
    // Award savedAward = awardRepository.save(award);

    // // Return a ResponseEntity with the saved award and a status code
    // return new ResponseEntity<>(savedAward, HttpStatus.CREATED);
    // }
}
