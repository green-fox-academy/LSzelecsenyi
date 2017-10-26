package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageProceeder;
import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }

    @Bean
    public MessageService twitterService() {
        return new TwitterService();
    }

    public MessageService emailService() {
        return new EmailService();
    }



}
