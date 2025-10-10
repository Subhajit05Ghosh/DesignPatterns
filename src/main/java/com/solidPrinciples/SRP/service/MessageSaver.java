package com.solidPrinciples.SRP.service;

import com.solidPrinciples.SRP.model.Message;

import java.io.FileWriter;
import java.io.IOException;

public class MessageSaver {
    public void saveToFile(Message message, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(message.getContent());
        } catch (IOException e) {
            System.out.println("Error saving message: " + e.getMessage());
        }
    }
}
