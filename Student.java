/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_management_app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ruite
 */
public class Student {

    static void SearchStudent(String scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    
    
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentEmail;
    private String studentCourse;
    // Static map to store student records
    private static Map<String, Student> studentMap = new HashMap<>();

    // Method to save a student
    public static void SaveStudent(Scanner scanner) {
        System.out.println("\nCAPTURE A NEW STUDENT");
        System.out.print("Enter the student id: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        int studentAge = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter the student age: ");
            try {
                studentAge = Integer.parseInt(scanner.nextLine());
                if (studentAge >= 16) {
                    validAge = true;
                } else {
                    System.out.println("Student age must be 16 or older. Please re-enter.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the student's age.");
            }
        }
        System.out.print("Enter the student email: ");
String studentEmail = scanner.nextLine();

System.out.print("Enter the student course: ");
String studentCourse = scanner.nextLine();

// Assuming the Student constructor doesn't need an 'outer' parameter
Student newStudent = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
studentMap.put(studentId, newStudent);

System.out.println("\nStudent details have been successfully saved.");
System.out.println(newStudent);

    }

    // Method to search for a student
    public static void SearchStudent(Scanner scanner) {
        System.out.println("\nSEARCH FOR A STUDENT");
        System.out.print("Enter the student ID: ");
        String studentId = scanner.nextLine();
        Student student = studentMap.get(studentId);
        if (student != null) {
            System.out.println("\nStudent found:");
            System.out.println(student);
        } else {
            System.out.println("\nError: Student with ID " + studentId + " cannot be located.");
        }
    }

    // Method to delete a student
    public static void DeleteStudent(Scanner scanner) {
        System.out.println("\nDELETE A STUDENT");
        System.out.print("Enter the student ID to delete: ");
        String studentId = scanner.nextLine();
        Student student = studentMap.get(studentId);
        if (student != null) {
            System.out.println("\nStudent found:");
            System.out.println(student);
            System.out.print("Are you sure you want to delete this student? (yes/no): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("yes")) {
                studentMap.remove(studentId);
                System.out.println("Student with ID " + studentId + " has been successfully deleted.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("\nError: Student with ID " + studentId + " cannot be located.");
        }
    }

    // Method to generate and display the student report
    public static void StudentReport() {
        System.out.println("\nSTUDENT REPORT");
        if (studentMap.isEmpty()) {
            System.out.println("No students found in the system.");
        } else {
            for (Student student : studentMap.values()) {
                System.out.println(student);
                System.out.println("---------------");
            }
        }
    }

    // Method to exit the application
    public static void ExitStudentApplication() {
        System.out.println("Exiting application...");
        System.exit(0);
    }

    // Constructor
    public Student(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse, String LukasGreen, String InformationTechnology) {
        
        this.studentId = 10465255;
        this.studentName = LukasGreen;
        this.studentAge = 18;
        this.studentEmail = "LukasGreen@gmail.com";
        this.studentCourse = InformationTechnology;
    }

    private Student(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  


    @Override
    public String toString() {
        return "Student ID: " + studentId + "\n" + "Student Name: " + studentName + "\n" + "Student Age: " + studentAge + "\n" + "Student Email: " + studentEmail + "\n" + "Student Course: " + studentCourse;
    }


   
    
}
