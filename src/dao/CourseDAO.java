/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Course;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;

public class CourseDAO {

    Connection con = DBConnection.getConnection();

    public void addCourse(Course c) {

        try {
            String sql = "INSERT INTO course(course_name, duration) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, c.getCourseName());
            ps.setString(2, c.getDuration());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Course> getAllCourses() {

        ArrayList<Course> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM course";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Course c = new Course();

                c.setId(rs.getInt("id"));
                c.setCourseName(rs.getString("course_name"));
                c.setDuration(rs.getString("duration"));

                list.add(c);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}
