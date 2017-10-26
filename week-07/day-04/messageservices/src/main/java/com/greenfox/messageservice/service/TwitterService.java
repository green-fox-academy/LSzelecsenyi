package com.greenfox.messageservice.service;

public class TwitterService implements MessageService {

    @Override
    public void sendMessage(String msg, String address) {
        System.out.println("Twitter message sent to " + address + " with Message: " + msg);
    }
}
