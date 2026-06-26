/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Student;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {

    Connection con = DBConnection.getConnection();

    public void addStudent(Student s) {
        try {
            String sql = "INSERT INTO student(name, reg_no, email) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getRegNo());
            ps.setString(3, s.getEmail());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateStudent(Student s) {

    try {
        String sql = "UPDATE student SET name=?, reg_no=?, email=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, s.getName());
        ps.setString(2, s.getRegNo());
        ps.setString(3, s.getEmail());
        ps.setInt(4, s.getId());

        ps.executeUpdate();

    } catch (Exception e) {
        System.out.println(e);
    }
}
    public void deleteStudent(int id) {

    try {
        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();

    } catch (Exception e) {
        System.out.println(e);
    }
}
    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setRegNo(rs.getString("reg_no"));
                s.setEmail(rs.getString("email"));

                list.add(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}