/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UserDAO;

public class UserService {

    UserDAO dao = new UserDAO();

    public String login(String username, String password) {
        return dao.validateLogin(username, password);
    }
}
