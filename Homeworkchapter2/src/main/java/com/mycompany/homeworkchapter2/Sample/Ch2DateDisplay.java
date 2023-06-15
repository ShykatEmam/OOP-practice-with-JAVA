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
import java.text.*;
public class Ch2DateDisplay {
    public static void main(String[] args) {
        
        Date today;
        SimpleDateFormat simpleDF1, simpleDF2;
        
        today = new Date();
        
        simpleDF1 = new SimpleDateFormat();
        simpleDF2 = new SimpleDateFormat ("EEEE MMMM dd, YYYY");
        
        //Default short format display
        System.out.println("Today is " + simpleDF1.format(today));
        
        //Programmer-designated long format display
        System.out.println("Today is " + simpleDF2.format(today));
        
    }
    
}
