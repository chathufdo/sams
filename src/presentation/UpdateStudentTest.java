/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.StudentService;

public class UpdateStudentTest {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        // Example: update student with ID = 1
        service.updateStudent(1, "Alice Updated", "S001", "aliceupdated@gmail.com");

        System.out.println("Student updated successfully!");
    }
}
