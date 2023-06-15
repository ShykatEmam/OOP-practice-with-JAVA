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

public class Ch2Monogram {
    public static void main(String[] args) {
        
        String name;
        
        Scanner scanner = new Scanner(System.in);
        
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("Enter your full name (first, middle, last):");
        name = scanner.next();
        
        System.out.println("Name entered: " + name);
    }
}
