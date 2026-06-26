/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Lecturer;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class LecturerDAO {

    Connection con = DBConnection.getConnection();

    // CREATE
    public void addLecturer(Lecturer l) {

        try {
            String sql = "INSERT INTO lecturer(name, email, subject) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, l.getName());
            ps.setString(2, l.getEmail());
            ps.setString(3, l.getSubject());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public ArrayList<Lecturer> getAllLecturers() {

        ArrayList<Lecturer> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM lecturer";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Lecturer l = new Lecturer();

                l.setId(rs.getInt("id"));
                l.setName(rs.getString("name"));
                l.setEmail(rs.getString("email"));
                l.setSubject(rs.getString("subject"));

                list.add(l);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}
