/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.AttendanceService;
import model.Attendance;

import java.util.ArrayList;

public class AttendanceReportTest {

    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();

        System.out.println("===== ALL ATTENDANCE =====");

        ArrayList<Attendance> list = service.getByStudent(1); 
        // change to test filters

        for (Attendance a : list) {
            System.out.println(
                    "StudentID: " + a.getStudentId() +
                    " | SessionID: " + a.getSessionId() +
                    " | Status: " + a.getStatus()
            );
        }
    }
}
