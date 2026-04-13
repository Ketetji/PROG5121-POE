/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
/**
 *Object-oriented structure adapted from W3Schools Java examples (W3Schools, 2026).
 * Represent a task entity 
 * @author ketet
 */


public class Task {  //(W3Schools, 2026).
    private String taskName;
    private String developer;
    private int duration;
    private String status;
    
    //Constructor
    public Task(String taskName, String developer, int duration, String status) {
        this.taskName = taskName;
        this.developer = developer;
        this.duration = duration;
        this.status = status;
    }
    
    //Display task details
    public void displayTaskDetails() {
        System.out.println("Task: " + taskName);
        System.out.println("Developer: " + developer);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Status: " + status);
        System.out.println("---------------------------" );
    }
    
    //Duration
    public int getDuration(){
        return duration;
    }
    
}
