/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeworkchapter2.Sample;

/**
 *
 * @author Overlord
 */
import java.util.*;

public class Ch2RecordFiling {
    public static void main(String[] args) {
        
        String firstName, lastName;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Your full name: ");
        
        firstName = scanner.next();
        lastName = scanner.next();
        
        System.out.println("Your medical record is filled under " + lastName + ", " + firstName + ".");
    }
}
