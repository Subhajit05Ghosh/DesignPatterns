package com.solidPrinciples.SRP;


import com.solidPrinciples.SRP.model.Message;
import com.solidPrinciples.SRP.service.MessagePrinter;
import com.solidPrinciples.SRP.service.MessageSaver;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Hello, SRP !!");

        MessagePrinter printer = new MessagePrinter();
        printer.print(message);

        MessageSaver saver = new MessageSaver();
        saver.saveToFile(message, "message.txt");
    }
}
