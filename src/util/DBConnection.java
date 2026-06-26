/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sams",
                    "root",
                    "chathu85"
                );
            }
        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
        }
        return con;
    }
}

