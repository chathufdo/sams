/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.LecturerDAO;
import model.Lecturer;

import java.util.ArrayList;

public class LecturerService {

    LecturerDAO dao = new LecturerDAO();

    public void addLecturer(String name, String email, String subject) {

        Lecturer l = new Lecturer();
        l.setName(name);
        l.setEmail(email);
        l.setSubject(subject);

        dao.addLecturer(l);
    }

    public ArrayList<Lecturer> getLecturers() {
        return dao.getAllLecturers();
    }
}
