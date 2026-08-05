package com.solidPrinciples.DIP.database;


import com.solidPrinciples.DIP.database.Database;

public class PostgreSQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving data to PostgreSQL: " + data);
    }
}
