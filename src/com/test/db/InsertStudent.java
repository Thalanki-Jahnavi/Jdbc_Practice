package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            // 1. Create connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "root"
            );

            // 2. Create statement
            Statement stmt = con.createStatement();

            // 3. SQL query
            String sql = "INSERT INTO student VALUES (1, 'Jahnavi', 22)";

            // 4. Execute query
            int rows = stmt.executeUpdate(sql);

            // 5. Display result
            System.out.println(rows + " record inserted");

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}