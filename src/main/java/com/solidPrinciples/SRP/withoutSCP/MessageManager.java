package com.solidPrinciples.SRP.withoutSCP;

import java.io.FileWriter;
import java.io.IOException;

public class MessageManager {
    private String message;

    public MessageManager(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    public void saveMessage(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(message);
        } catch (IOException e) {
            System.out.println("Error saving message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MessageManager manager = new MessageManager("Hello, world!");
        manager.printMessage();
        manager.saveMessage("message.txt");
    }
}
