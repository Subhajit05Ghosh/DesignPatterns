package com.solidPrinciples.DIP.service;

import com.solidPrinciples.DIP.database.Database;

public class UserService {
    private final Database database;

    // Constructor injection
    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser(String username) {
        database.save(username);
    }
}
