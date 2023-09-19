package com.director.directormicroservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping("/directors")
    public ResponseEntity<List<Director>> getAllDirectors() {
        // Retrieve all directors from the database
        List<Director> directors = directorRepository.findAll();

        // Return the list of directors with a 200 OK status
        return new ResponseEntity<>(directors, HttpStatus.OK);
    }

    @PostMapping("/directors")
    public ResponseEntity<Director> createDirector(@RequestBody Director director) {
        // Perform the logic to save the new director to the database
        Director savedDirector = directorRepository.save(director);

        // Return a ResponseEntity with the saved director and a 201 Created status
        return new ResponseEntity<>(savedDirector, HttpStatus.CREATED);
    }

    @PutMapping("/directors/{id}")
    public ResponseEntity<Director> updateDirector(@PathVariable Long id, @RequestBody Director updatedDirector) {
        // Check if a director with the given ID exists
        if (!directorRepository.existsById(id)) {
            // If the director doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Set the ID of the updatedDirector to match the path variable
        updatedDirector.setMovid_id(id);

        // Perform the logic to update the director in the database
        Director savedDirector = directorRepository.save(updatedDirector);

        // Return a ResponseEntity with the saved director and a 200 OK status
        return new ResponseEntity<>(savedDirector, HttpStatus.OK);
    }

    @PatchMapping("/directors/{id}")
    public ResponseEntity<Director> patchDirector(@PathVariable Long id, @RequestBody Director updatedDirector) {
        // Check if a director with the given ID exists
        if (!directorRepository.existsById(id)) {
            // If the director doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Retrieve the existing director from the database
        Director existingDirector = directorRepository.findById(id).orElse(null);

        if (existingDirector != null) {
            // Update only the fields that are not null in the updatedDirector
            if (updatedDirector.getFirstname() != null) {
                existingDirector.setFirstname(updatedDirector.getFirstname());
            }
            if (updatedDirector.getLastname() != null) {
                existingDirector.setLastname(updatedDirector.getLastname());
            }
            if (updatedDirector.getBirthday() != null) {
                existingDirector.setBirthday(updatedDirector.getBirthday());
            }

            // Perform the logic to update the director in the database
            Director savedDirector = directorRepository.save(existingDirector);

            // Return a ResponseEntity with the saved director and a 200 OK status
            return new ResponseEntity<>(savedDirector, HttpStatus.OK);
        } else {
            // Handle the case when the existing director is null (should not occur)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/directors/{id}")
    public ResponseEntity<Void> deleteDirector(@PathVariable Long id) {
        // Check if a director with the given ID exists
        if (!directorRepository.existsById(id)) {
            // If the director doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Perform the logic to delete the director from the database
        directorRepository.deleteById(id);

        // Return a ResponseEntity with a 204 No Content status
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
