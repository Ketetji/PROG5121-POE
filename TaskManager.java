/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe1;
import java.util.ArrayList;
/**
 *TaskManager class manages a list of Task objects.
 * ArrayList and input logic adapted from W3Schools Java examples (W3Schools, 2026).
 * It allows adding tasks, displaying all tasks, and calculating total duration.
 * @author ketet
 */


public class TaskManager {
    private ArrayList<Task> tasks;
    
    public TaskManager() {
        tasks = new ArrayList<>();
    }
    
    //Adding a task
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    //Display all tasks
    public void displayAllTasks() {
        System.out.println("=== Task List ===");
        for (Task task : tasks) {
            task.displayTaskDetails();
        }
    }
    
    // Calculate total duration
    public int calculateTotalDuration() {
        int total = 0;
        for (Task task : tasks) {
            total += task.getDuration();//Changed from getTotalDuration() to getDuration()
        }
        return total;
    }
    
}
