/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import service.ClassSessionService;

public class ClassSessionTest {

    public static void main(String[] args) {

        ClassSessionService service = new ClassSessionService();

        service.createSession(
                "SE101",
                "OOP",
                "Dr. Smith",
                "2026-06-26",
                "10:00 AM"
        );

        System.out.println("Class Session Created!");
    }
}
