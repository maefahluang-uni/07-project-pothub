package com.director.directormicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectorController {

    @Autowired
    private DirectorRepository directorRepository;

    @GetMapping("/directors")
    public ResponseEntity<Director> get() {
        return null;
    }

    @PostMapping("/directors")
    public ResponseEntity<Director> post() {
        return null;
    }

    @PutMapping("/directors")
    public ResponseEntity<Director> put() {
        return null;
    }

    @PatchMapping("/directors")
    public ResponseEntity<Director> patch() {
        return null;
    }

    @DeleteMapping("/directors")
    public ResponseEntity<Director> delete() {
        return null;
    }
}
