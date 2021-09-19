package com.example.pureintegration;

import com.example.pureintegration.web.CountryController;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PureIntegrationApplicationTests {
    CountryController obj;
    @Before
    public void initialize()
    {
         obj= new CountryController();
    }
    @Test
    void contextLoads() {
    }

}
