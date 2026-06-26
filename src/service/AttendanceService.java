/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.AttendanceDAO;
import model.Attendance;

import java.util.ArrayList;

public class AttendanceService {

    AttendanceDAO dao = new AttendanceDAO();

    public void markAttendance(int studentId, int sessionId, String status) {

        Attendance a = new Attendance();
        a.setStudentId(studentId);
        a.setSessionId(sessionId);
        a.setStatus(status);

        dao.markAttendance(a);
    }

    public ArrayList<Attendance> getAttendance() {
        return dao.getAllAttendance();
        
    }
    public ArrayList<Attendance> getByStudent(int studentId) {
    return dao.getByStudent(studentId);
}

public ArrayList<Attendance> getBySession(int sessionId) {
    return dao.getBySession(sessionId);
}
}