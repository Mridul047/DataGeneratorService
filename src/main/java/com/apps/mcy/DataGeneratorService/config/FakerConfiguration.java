package com.apps.mcy.DataGeneratorService.config;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerConfiguration {

    @Bean(name="CustomFaker")
    public Faker faker(){
        return new Faker();
    }
}
