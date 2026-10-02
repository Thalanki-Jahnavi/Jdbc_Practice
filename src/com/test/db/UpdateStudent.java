package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {

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
            String sql = "UPDATE student SET age = 23 WHERE id = 1";

            // 4. Execute UPDATE query
            int rows = stmt.executeUpdate(sql);

            // 5. Display result
            System.out.println(rows + " record updated");

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}