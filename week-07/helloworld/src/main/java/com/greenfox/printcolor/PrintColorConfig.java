package com.greenfox.printcolor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintColorConfig {
    @Bean
    public MyColor letsColor() {
        return new blueColor();
    }
}
