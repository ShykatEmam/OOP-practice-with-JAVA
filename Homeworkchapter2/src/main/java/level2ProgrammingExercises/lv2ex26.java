/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level2ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Using the Scanner, input a string that contains a single exclamation mark. Divide the input string
//into two strings, one before and the other after the exclamation mark, and output them. 
//Do not include the exclamation mark in the output. For example, if the input string is one potato
//two potato !three, then the output would be
//one potato two potato
//three
import java.util.Scanner;
public class lv2ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string with single exclamation mark: ");
        String line = input.nextLine();
        
        int n = line.indexOf('!');
        
        String line1 = line.substring(0, n);
        String line2 = line.substring(n+1);
        
        System.out.println(line1);
        System.out.println(line2);
        
    }
}
