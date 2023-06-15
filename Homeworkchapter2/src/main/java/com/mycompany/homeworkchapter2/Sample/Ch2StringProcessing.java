/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeworkchapter2.Sample;

/**
 *
 * @author Overlord
 */
public class Ch2StringProcessing {
    public static void main(String[] args) {
        String fullName, firstName, lastName, space;
        
        fullName = new String("Decafe L");
        space = new String(" ");
        
        firstName = fullName.substring(0, fullName.indexOf(space));
        lastName = fullName.substring(fullName.indexOf(space) + 1 , fullName.length());
        
        System.out.println("Full Name: " + fullName);
        System.out.println("First: " + firstName);
        System.out.println("Last: " + lastName);
        System.out.println("Your last name has " + lastName.length() + " characters.");
        
    }
    
}
