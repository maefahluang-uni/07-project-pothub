package com.movie.moviemicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public ResponseEntity<Movie> get() {
        return null;
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> post() {
        return null;
    }

    @PutMapping("/movies")
    public ResponseEntity<Movie> put() {
        return null;
    }

    @PatchMapping("/movies")
    public ResponseEntity<Movie> patch() {
        return null;
    }

    @DeleteMapping("/movies")
    public ResponseEntity<Movie> delete() {
        return null;
    }

    @GetMapping("/movies/{title}")
    public ResponseEntity<Movie> getTitle(Long id, String title) {
        return null;
    }
}
