package com.example.pureintegration.data;
import com.example.pureintegration.domain.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends MongoRepository<Country, String[]>{
}
