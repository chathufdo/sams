/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.StudentService;

public class TestStudent {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        service.registerStudent("John Doe", "S001", "john@gmail.com");

        System.out.println("Student inserted successfully!");
    }
}
