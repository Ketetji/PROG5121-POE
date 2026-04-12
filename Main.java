/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import com.mycompany.poe1.Login;
import java.util.Scanner;
import com.mycompany.poe1.Task;

/**
 *Main class handles user login and task display.
 * Menu input logic adapted fro W3Schools Java examples (W3Schools, 2026).
 * Developed according to IIE Programming 1A POE brief (IIE, 2026).
 * @author ketet
 */


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Login setup and account creation
        Login login = new Login("student123", "pass123", "Martha", "Adams");
        
        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();
        
        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();
        
        String message = login.getLoginStatus(enteredUsername, enteredPassword);
        System.out.println(message);
        
        if (message.contains("Welcome")) {
            System.out.println("You can now access your tasks.");
            
            Task task1 = new Task("Design Login Class", "Martha", 5, "To Do");
            task1.displayTaskDetails();
        } else {
            System.out.println("Access denied.");
        }
        
        input.close();
    }
    
    
}
