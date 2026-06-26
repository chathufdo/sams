/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.CourseService;

public class CourseTest {

    public static void main(String[] args) {

        CourseService service = new CourseService();

        service.addCourse("Software Engineering", "3 Years");

        System.out.println("Course Added!");
    }
}
