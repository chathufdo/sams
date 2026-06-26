/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    Connection con = DBConnection.getConnection();

    public String validateLogin(String username, String password) {

        try {
            String sql = "SELECT role FROM user WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("role");
            }

        } catch (Exception e) {
            System.out.println("Login error: " + e.getMessage());
        }

        return null;
    }
}
