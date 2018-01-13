package com.greenfox.messageservice.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String msg, String address) {
        System.out.println("Email sent to " + address + " with message: " + msg);
    }
}
