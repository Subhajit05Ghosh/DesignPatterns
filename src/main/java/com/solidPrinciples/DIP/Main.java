package com.solidPrinciples.DIP;

import com.solidPrinciples.DIP.database.Database;
import com.solidPrinciples.DIP.database.MySQLDatabase;
import com.solidPrinciples.DIP.service.UserService;

public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase(); // Switch to PostgreSQLDatabase if needed
        UserService userService = new UserService(database);
        userService.saveUser("Alice");
    }
}
