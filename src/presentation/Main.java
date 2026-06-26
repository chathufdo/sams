/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import java.sql.Connection;
import util.DBConnection;

public class Main {
    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("Database Connected Successfully!");
        } else {
            System.out.println("Connection Failed!");
        }
    }
}