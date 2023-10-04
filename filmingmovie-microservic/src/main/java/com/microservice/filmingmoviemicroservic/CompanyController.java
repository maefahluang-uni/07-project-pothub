package com.microservice.filmingmoviemicroservic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/company")
    public ResponseEntity<List<Company>> getAllCompanye() {

        List<Company> company = companyRepository.findAll();

        return new ResponseEntity<>(company, HttpStatus.OK);
    }
}
