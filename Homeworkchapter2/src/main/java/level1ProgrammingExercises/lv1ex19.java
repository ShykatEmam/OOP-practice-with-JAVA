/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Input the user's first, middle, and last name as three separate strings and display the name in the
//order of the first name, the middle initial, and the last name. Include the period after the middle
//initial. If the input strings Wolfgang, Amadus, and Mozart, for example, then the output would be
//WOlfgang A. Mozart. Use the console window for output.

import java.util.Scanner;
public class lv1ex19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("First Name: ");
        String first = input.next();
        
        System.out.println("Middle Name: ");
        String middle = input.next();
        
        System.out.println("Last name: ");
        String last = input.next();
        
        String fullName = first + " " + middle.charAt(0)+ ". " + last;
        
        System.out.println(fullName);
    }
}
