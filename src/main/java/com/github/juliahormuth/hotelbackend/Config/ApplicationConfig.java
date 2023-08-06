package com.github.juliahormuth.hotelbackend.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    // TO DO: To implement a better architecture with modelMapper
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}