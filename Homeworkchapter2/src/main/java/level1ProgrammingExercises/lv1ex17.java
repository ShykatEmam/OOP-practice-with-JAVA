/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Write a program that displays a frame window 800 pixels wide and 600 pixels high. 
//Set the title of the frame to Welcome to Java.

import javax.swing.*;

public class lv1ex17 {
    public static void main(String[] args) {

        JFrame myWindow = new JFrame();

        myWindow.setSize(800,600);
        
        myWindow.setTitle("Welcome to Java");
        
        myWindow.setVisible(true);
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    
    }
    
    
}
