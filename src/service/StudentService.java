/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.StudentDAO;
import model.Student;

import java.util.ArrayList;

public class StudentService {

    private StudentDAO dao = new StudentDAO();
    public void registerStudent(String name, String regNo, String email) {

        Student s = new Student();
        s.setName(name);
        s.setRegNo(regNo);
        s.setEmail(email);

        dao.addStudent(s);
    }
public void updateStudent(int id, String name, String regNo, String email) {

    Student s = new Student();
    s.setId(id);
    s.setName(name);
    s.setRegNo(regNo);
    s.setEmail(email);

    dao.updateStudent(s);
}
public void deleteStudent(int id) {
    dao.deleteStudent(id);
}
    public ArrayList<Student> getStudents() {
        return dao.getAllStudents();
    }

    public void registerStudentObject(Student s) {
        dao.addStudent(s);
    }
}
