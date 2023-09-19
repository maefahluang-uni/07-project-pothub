package com.aword.awordmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwardController {

    @Autowired
    private AwardRepository awardRepository;

    @GetMapping("/awards/{name}")
    public ResponseEntity<Award> getName(@PathVariable Long id, String name) {
        return null;
    }

    @PostMapping("/awards")
    public ResponseEntity<Award> post() {
        return null;
    }
}
