/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level3ProgrammingExcercises;

/**
 *
 * @author Overlord
 */
//Write a program that accepts a word and prints out the middle character. The length of the input
//word is odd. For example, if the input is magnificent, which has 11 characters, you output 
//the sixth character f. You use the division operator /. This operator returns only the quotient.
//For example, the expression 10/4 would result in 2 (not 2.5)

import java.util.Scanner;
public class lv3ex28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input: ");
        String word = input.next();
        
        int n = word.length();
        n = n /2;
        
        System.out.println("Output: " + word.charAt(n));
    }
}
