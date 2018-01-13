package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.MessageProcessor;
import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    MessageProcessor messageProcessor() {
        return new MessageProcessor();
    }

    @Bean
    public MessageService twitterService() {
        return new TwitterService();
    }

    public MessageService emailService() {
        return new EmailService();
    }
}
