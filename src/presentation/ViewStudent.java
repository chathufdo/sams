/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import model.Student;
import service.StudentService;

import java.util.ArrayList;

public class ViewStudent {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        ArrayList<Student> list = service.getStudents();

        System.out.println("===== STUDENT LIST =====");

        for (Student s : list) {
            System.out.println(
                    "ID: " + s.getId() +
                    " | Name: " + s.getName() +
                    " | RegNo: " + s.getRegNo() +
                    " | Email: " + s.getEmail()
            );
        }
    }
}
