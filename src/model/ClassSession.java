/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ClassSession {

    private int id;
    private String course;
    private String subject;
    private String lecturer;
    private String date;
    private String time;

    public ClassSession() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getLecturer() { return lecturer; }
    public void setLecturer(String lecturer) { this.lecturer = lecturer; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
}
