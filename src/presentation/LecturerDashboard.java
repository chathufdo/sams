/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import java.util.Scanner;

public class LecturerDashboard {

    public static void showMenu() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== LECTURER DASHBOARD =====");
            System.out.println("1. View My Classes");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance Report");
            System.out.println("4. Logout");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("View Classes (coming next)");
                    break;

                case 2:
                    System.out.println("Mark Attendance (coming next)");
                    break;

                case 3:
                    System.out.println("Attendance Report (coming next)");
                    break;

                case 4:
                    return;
            }
        }
    }
}
