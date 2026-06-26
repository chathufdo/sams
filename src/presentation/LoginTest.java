/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation;

import java.util.Scanner;
import service.UserService;

public class LoginTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOGIN SYSTEM =====");

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        UserService service = new UserService();
        String role = service.login(username, password);

        if (role != null) {

            System.out.println("Login Successful! Role: " + role);

            if (role.equals("ADMIN")) {
                AdminDashboard.showMenu();
            } 
            else if (role.equals("LECTURER")) {
                LecturerDashboard.showMenu();
            }

        } else {
            System.out.println("Invalid username or password");
        }
    }
}
