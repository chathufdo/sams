/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.ClassSession;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class ClassSessionDAO {

    Connection con = DBConnection.getConnection();

    // CREATE
    public void addSession(ClassSession s) {

        try {
            String sql = "INSERT INTO class_session(course, subject, lecturer, class_date, class_time) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getCourse());
            ps.setString(2, s.getSubject());
            ps.setString(3, s.getLecturer());
            ps.setString(4, s.getDate());
            ps.setString(5, s.getTime());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public ArrayList<ClassSession> getAllSessions() {

        ArrayList<ClassSession> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM class_session";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                ClassSession s = new ClassSession();

                s.setId(rs.getInt("id"));
                s.setCourse(rs.getString("course"));
                s.setSubject(rs.getString("subject"));
                s.setLecturer(rs.getString("lecturer"));
                s.setDate(rs.getString("class_date"));
                s.setTime(rs.getString("class_time"));

                list.add(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}
