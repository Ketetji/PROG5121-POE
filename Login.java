/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.poe1;

/**
 *Handles user login and authentication.
 * Developed according to IIE Programming 1A POE brief (IIE, 2026).
 * Login logic adapted from W3Schools Java examples (W3Schools, 2026).
 * @author ketet
 */


public class Login {
    private String storedUsername;
    private String storedPassword;
    private String firstName;
    private String lastName;
    
    
    //Constructor initialises user credentials
    public Login(String username, String password, String firstName, String lastName) {
        this.storedUsername = username;
        this.storedPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Validates login credentials using stored data.
    //Equality check adapted from W3Schools Java tutorials (W3Schools, 2026)
    public boolean checkLogin(String username, String password) {
        return username.equals(storedUsername) && password.equals(storedPassword);
    }
    
    //Returns login status message.
    //String concatenation approach ispired by W3Schools Java String examples (W3Schools, 2026).
    public String getLoginStatus(String username, String password) {
        if (checkLogin(username, password)) {
            return "Welcome " + firstName + ", " + lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }

    //Integrates validation from POE1.java for account creation
    public static void createAccount(String username, String password, String phone) {
        System.out.println(POE1.validateUsername(username));
        System.out.println(POE1.validatePassword(password));
        System.out.println(POE1.validateCellphone(phone));
    }
    
}
