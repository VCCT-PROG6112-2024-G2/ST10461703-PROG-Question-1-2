/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.student_management_app;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruite
 */
public class StudentTest {

    private Scanner string;
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testSaveStudent() {
        System.out.println("SaveStudent");
        Student.SaveStudent(string);
        
    }

    
    @Test
    public void testSearchStudentName() {
        System.out.println("SearchStudent");
        String scanner = "10465255";
        Student.SearchStudent(scanner);
        
        
    }

   
    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        Scanner scanner = null;
        Student.DeleteStudent(scanner);
       
    }

    
    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        Student.StudentReport();
        
    }
    @Test
    public void testExitStudentApplication() {
        System.out.println("ExitStudentApplication");
        Student.ExitStudentApplication();
      
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
