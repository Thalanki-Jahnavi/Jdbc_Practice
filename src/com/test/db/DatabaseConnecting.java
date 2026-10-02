package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnecting {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root"
            );

            System.out.println("Database connected successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}