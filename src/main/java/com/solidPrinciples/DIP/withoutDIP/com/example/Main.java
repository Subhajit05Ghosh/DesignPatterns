package com.solidPrinciples.DIP.withoutDIP.com.example;


import com.solidPrinciples.DIP.withoutDIP.com.example.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser("Alice");
    }
}
