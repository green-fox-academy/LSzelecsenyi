package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService messageService;

    public void processMessage(String message, String address) {
        messageService.sendMessage(message, address);
    }

}
