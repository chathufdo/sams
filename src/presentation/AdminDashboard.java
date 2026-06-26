/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package presentation;

import java.util.Scanner;
import service.StudentService;

public class AdminDashboard {

    public static void showMenu() {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n===== ADMIN DASHBOARD =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Logout");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Reg No: ");
                    String reg = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    service.registerStudent(name, reg, email);
                    System.out.println("Student Added!");
                    break;

                case 2:
                    service.getStudents().forEach(s ->
                        System.out.println(s.getId() + " " + s.getName() + " " + s.getRegNo() + " " + s.getEmail())
                    );
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String n1 = sc.nextLine();

                    System.out.print("New Reg No: ");
                    String r1 = sc.nextLine();

                    System.out.print("New Email: ");
                    String e1 = sc.nextLine();

                    service.updateStudent(id, n1, r1, e1);
                    System.out.println("Updated!");
                    break;

                case 4:
                    System.out.print("ID to delete: ");
                    int delId = sc.nextInt();

                    service.deleteStudent(delId);
                    System.out.println("Deleted!");
                    break;

                case 5:
                    System.out.println("Logging out...");
                    return;
            }
        }
    }
}