package com.greenfox.bankofsimba.bankofsimba;

import com.greenfox.bankofsimba.bankofsimba.model.Bank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

    @Bean
    Bank bank() {return new Bank();}

}
