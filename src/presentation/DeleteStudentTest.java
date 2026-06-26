/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.StudentService;

public class DeleteStudentTest {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        // delete student with ID = 1
        service.deleteStudent(1);

        System.out.println("Student deleted successfully!");
    }
}
