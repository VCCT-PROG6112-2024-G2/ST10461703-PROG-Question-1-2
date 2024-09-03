/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_book_management_system;

import java.util.Scanner;

/**
 *
 * @author ruite
 */
public class LibraryApp {
    
    private static LibraryManager manager = new LibraryManager();

    public static void main(String[] args) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("\nLIBRARY BOOK MANAGEMENT SYSTEM");
            System.out.println("(1) Add a book.");
            System.out.println("(2) Search for a book.");
            System.out.println("(3) Display all books.");
            System.out.println("(4) Exit.");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    manager.addBook();
                    break;
                case "2":
                    manager.searchBook();
                    break;
                case "3":
                    manager.displayBooks();
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }
        }
    }
}


