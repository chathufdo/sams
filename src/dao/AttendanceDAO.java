/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Attendance;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AttendanceDAO {

    Connection con = DBConnection.getConnection();

    // MARK ATTENDANCE
    public void markAttendance(Attendance a) {

        try {
            String sql = "INSERT INTO attendance(student_id, session_id, status) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, a.getStudentId());
            ps.setInt(2, a.getSessionId());
            ps.setString(3, a.getStatus());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // VIEW ALL
    public ArrayList<Attendance> getAllAttendance() {

        ArrayList<Attendance> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM attendance";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Attendance a = new Attendance();

                a.setId(rs.getInt("id"));
                a.setStudentId(rs.getInt("student_id"));
                a.setSessionId(rs.getInt("session_id"));
                a.setStatus(rs.getString("status"));

                list.add(a);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
    public ArrayList<Attendance> getByStudent(int studentId) {

    ArrayList<Attendance> list = new ArrayList<>();

    try {
        String sql = "SELECT * FROM attendance WHERE student_id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, studentId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Attendance a = new Attendance();

            a.setId(rs.getInt("id"));
            a.setStudentId(rs.getInt("student_id"));
            a.setSessionId(rs.getInt("session_id"));
            a.setStatus(rs.getString("status"));

            list.add(a);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    return list;
}
    public ArrayList<Attendance> getBySession(int sessionId) {

    ArrayList<Attendance> list = new ArrayList<>();

    try {
        String sql = "SELECT * FROM attendance WHERE session_id=?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, sessionId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Attendance a = new Attendance();

            a.setId(rs.getInt("id"));
            a.setStudentId(rs.getInt("student_id"));
            a.setSessionId(rs.getInt("session_id"));
            a.setStatus(rs.getString("status"));

            list.add(a);
        }

    } catch (Exception e) {
        System.out.println(e);
    }

    return list;
}
}
