// Low-level module

package com.solidPrinciples.DIP.withoutDIP.com.example.database;

public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}
