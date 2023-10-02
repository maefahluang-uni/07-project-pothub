package com.microservice.filmingmoviemicroservic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies") // Set the base path for this controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        // Retrieve all movies from the database
        List<Movie> movies = movieRepository.findAll();

        // Return the list of movies with a 200 OK status
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE) // Specify JSON consumption
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        // Perform the logic to save the new movie to the database
        Movie savedMovie = movieRepository.save(movie);

        // Return a ResponseEntity with the saved movie and a 201 Created status
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE) // Specify JSON consumption
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie updatedMovie) {
        // Check if a movie with the given ID exists
        if (!movieRepository.existsById(id)) {
            // If the movie doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Set the ID of the updatedMovie to match the path variable
        updatedMovie.setMovid_id(id);

        // Perform the logic to update the movie in the database
        Movie savedMovie = movieRepository.save(updatedMovie);

        // Return a ResponseEntity with the saved movie and a 200 OK status
        return new ResponseEntity<>(savedMovie, HttpStatus.OK);
    }

    @PatchMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE) // Specify JSON consumption
    public ResponseEntity<Movie> patchMovie(@PathVariable Long id, @RequestBody Movie updatedMovie) {
        // Check if a movie with the given ID exists
        if (!movieRepository.existsById(id)) {
            // If the movie doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Retrieve the existing movie from the database
        Movie existingMovie = movieRepository.findById(id).orElse(null);

        if (existingMovie != null) {
            // Update only the fields that are not null in the updatedMovie
            if (updatedMovie.getTitle() != null) {
                existingMovie.setTitle(updatedMovie.getTitle());
            }
            if (updatedMovie.getYear() != null) {
                existingMovie.setYear(updatedMovie.getYear());
            }

            // Perform the logic to update the movie in the database
            Movie savedMovie = movieRepository.save(existingMovie);

            // Return a ResponseEntity with the saved movie and a 200 OK status
            return new ResponseEntity<>(savedMovie, HttpStatus.OK);
        } else {
            // Handle the case when the existing movie is null (should not occur)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        // Check if a movie with the given ID exists
        if (!movieRepository.existsById(id)) {
            // If the movie doesn't exist, return a 404 Not Found status
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // Perform the logic to delete the movie from the database
        movieRepository.deleteById(id);

        // Return a ResponseEntity with a 204 No Content status
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{title}")
    public ResponseEntity<List<Movie>> getMoviesByTitle(@PathVariable String title) {
        // Retrieve movies by title from the database
        List<Movie> movies = movieRepository.findByTitle(title);

        // Return the list of movies with a 200 OK status
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }
}
