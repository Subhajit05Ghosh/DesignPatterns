// High-level module (directly depends on MySQLDatabase)

package com.solidPrinciples.DIP.withoutDIP.com.example.service;

import com.solidPrinciples.DIP.withoutDIP.com.example.database.MySQLDatabase;

public class UserService {
    private MySQLDatabase database = new MySQLDatabase(); // Direct dependency

    public void saveUser(String username) {
        database.save(username);
    }
}