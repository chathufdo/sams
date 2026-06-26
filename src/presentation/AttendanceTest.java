/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.AttendanceService;

public class AttendanceTest {

    public static void main(String[] args) {

        AttendanceService service = new AttendanceService();

        service.markAttendance(1, 1, "PRESENT");

        System.out.println("Attendance marked successfully!");
    }
}
