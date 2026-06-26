/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.LecturerService;

public class LecturerTest {

    public static void main(String[] args) {

        LecturerService service = new LecturerService();

        service.addLecturer("Dr. Smith", "smith@gmail.com", "OOP");

        System.out.println("Lecturer Added!");
    }
}
