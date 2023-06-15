/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Overlord
 */

import java.util.*;

public class Ch2Greetings {
    public static void main(String[] args) {
        String firstName;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name?");
        
        firstName = scanner.next(); //accept characters up to but not including, the first space
        
        System.out.println(" Hi, " + firstName + ". Nice to meet your. ");
    }
    
}
