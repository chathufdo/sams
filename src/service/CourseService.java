/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.CourseDAO;
import model.Course;

import java.util.ArrayList;

public class CourseService {

    CourseDAO dao = new CourseDAO();

    public void addCourse(String name, String duration) {

        Course c = new Course();
        c.setCourseName(name);
        c.setDuration(duration);

        dao.addCourse(c);
    }

    public ArrayList<Course> getCourses() {
        return dao.getAllCourses();
    }
}
