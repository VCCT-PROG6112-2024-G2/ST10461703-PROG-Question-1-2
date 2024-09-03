/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management_app;

import java.util.Scanner;

/**
 *
 * @author ruite
 */
public class StudentDisplayMenu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Student.SaveStudent(scanner);
                    break;
                case "2":
                    Student.SearchStudent(scanner);
                    break;
                case "3":
                    Student.DeleteStudent(scanner);
                    break;
                case "4":
                    Student.StudentReport();
                    break;
                case "5":
                    Student.ExitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid number.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nSTUDENT MANAGEMENT APPLICATION");
        System.out.println("******");
        System.out.println("******");
        System.out.println("Enter (1) to capture a new student.");
        System.out.println("Enter (2) to search for a student.");
        System.out.println("Enter (3) to delete a student.");
        System.out.println("Enter (4) to view student report.");
        System.out.println("Enter (5) to exit the application.");
        System.out.print("Enter your choice: ");
    }
}


