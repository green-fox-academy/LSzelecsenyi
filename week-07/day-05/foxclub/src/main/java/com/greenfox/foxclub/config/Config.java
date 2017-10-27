package com.greenfox.foxclub.config;

import com.greenfox.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Fox getFox () { return new  Fox();}

}
