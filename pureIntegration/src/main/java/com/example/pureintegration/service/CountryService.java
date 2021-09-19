package com.example.pureintegration.service;

import com.example.pureintegration.data.CountryRepo;
import com.example.pureintegration.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService {
    @Autowired
    CountryRepo repo;
    public List<Country> getAllCountry(){

        return repo.findAll();
    }
}
