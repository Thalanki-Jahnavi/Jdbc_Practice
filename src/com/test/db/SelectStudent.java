package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudent {

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
            String sql = "SELECT * FROM student";

            // 4. Execute SELECT query
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Read the records
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("----------------");
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}