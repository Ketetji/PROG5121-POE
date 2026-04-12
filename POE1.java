/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe1;
import java.util.Scanner;
/**
 *Validation logic adapted from W3Schools Java examples (W3Schools, 2026).
 * Developed according to IIE Programming 1A POE brief (IIE, 2026).
 * @author ketet
 */


public class POE1 {
    
    //Username validation based on POE rubric (IIE, 2026)
    public static String validateUsername(String username) {
       if (username.contains("_") && username.length() > 5) {
           return "Username successfully captured.";
       } else {
           return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
       }
    }
    
    //Password validation adapted from W3Schools Java tutorials (W3Schools, 2026)
    public static String validatePassword (String password) {
        if (password.length() >= 8) {
            return "Password successfully captured.";
        } else {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
    }
    
    //Cellphone validation logic based on POE brief (IIE, 2026)
    public static String validateCellphone(String cellphone) {
        if (cellphone.matches("\\+27\\d{9}")) {
            return "Cellphone number successfully added.";
        } else {
            return "Cellphone number incorrectly formatted or does not contain international code.";
        }
    }
    
    public static void createAccount(String username, String password, String phone) {
        System.out.println(validateUsername(username));
        System.out.println(validatePassword(password));
        System.out.println(validateCellphone(phone));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.print("Enter cellphone number: ");
        String cellphone = scanner.nextLine();
        
        createAccount(username, password, cellphone);
        scanner.close();
 
    }
    
}
