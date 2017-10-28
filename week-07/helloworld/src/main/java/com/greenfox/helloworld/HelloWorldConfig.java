package com.greenfox.helloworld;
import org.testng.annotations.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){

        return new HelloWorld();
    }
}