package com.example.pureintegration.web;

import com.example.pureintegration.domain.Country;
import com.example.pureintegration.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryService service;
    @GetMapping("/api/breeds/list/all")
    public ResponseEntity<?> getAll(){
       List<Country> list= service.getAllCountry();

        return new ResponseEntity<List<Country>>(list, HttpStatus.OK);

    }
}
