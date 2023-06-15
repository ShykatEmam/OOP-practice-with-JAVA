/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Repeat Exercise 20, but this time use this Format: Monday December 10, 2008.

import java.util.*;
import java.text.*;
public class lv1ex21 {
    public static void main(String[] args) {
        Date today = new Date();
        
        SimpleDateFormat simpleDF = new SimpleDateFormat("EEEE MMMM dd, YYYY");
        
        System.out.println("Today : " + simpleDF.format(today));
        
        
    }
}
