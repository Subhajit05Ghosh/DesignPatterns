package com.solidPrinciples.SRP.service;

import com.solidPrinciples.SRP.model.Message;

public class MessagePrinter {
    public void print(Message message) {
        System.out.println("Message: " + message.getContent());
    }
}