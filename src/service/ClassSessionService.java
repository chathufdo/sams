/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ClassSessionDAO;
import model.ClassSession;

import java.util.ArrayList;

public class ClassSessionService {

    ClassSessionDAO dao = new ClassSessionDAO();

    public void createSession(String course, String subject, String lecturer, String date, String time) {

        ClassSession s = new ClassSession();

        s.setCourse(course);
        s.setSubject(subject);
        s.setLecturer(lecturer);
        s.setDate(date);
        s.setTime(time);

        dao.addSession(s);
    }

    public ArrayList<ClassSession> getSessions() {
        return dao.getAllSessions();
    }
}
