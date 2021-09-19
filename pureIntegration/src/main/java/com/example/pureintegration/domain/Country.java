package com.example.pureintegration.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Country {

    private String [] breed;

    public Country(String[] breed) {
        this.breed = breed;
    }

    public String[] getBreed() {
        return breed;
    }

    public void setBreed(String[] breed) {
        this.breed = breed;
    }
}
