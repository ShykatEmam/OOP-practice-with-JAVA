/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Write a program to display today's date in this format: 10 December 2008. Use the console window for 
//output. Refer to Table 2.1 for the necessary designator symbols.

import java.util.*;
import java.text.*;
public class lv1ex20 {
    public static void main(String[] args) {
        
        Date today = new Date();
        
        SimpleDateFormat simpleDF = new SimpleDateFormat("dd MMMM YYYY.");
        
        System.out.println("Today : " + simpleDF.format(today));
        
    }
    
}
