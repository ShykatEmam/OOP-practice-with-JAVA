/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level3ProgrammingExcercises;

/**
 *
 * @author Overlord
 */
//Write a program that accepts a string input and outputs the number of characters in the string and 
//the first and last character in separate lines. For 80 Chapter 2 Getting Started with Java
//example, if the input is I like Java then the output would be
//11
//I
//a

import java.util.Scanner;
public class lv3ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("input: ");
        String line = input.nextLine();
        int n = line.length();
        
        System.out.println("Output: ");
        System.out.println(n);
        System.out.println(line.charAt(0));
        System.out.println(line.charAt(n-1));
    }
}
