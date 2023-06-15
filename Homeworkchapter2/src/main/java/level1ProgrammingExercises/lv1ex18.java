/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level1ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Input the user's first and last name as wo separate strings. Then display a frame window with its title
//set to <last>, <first>, where <last> and <first> are the input values. For example, if the input values
//are johann and Strauss, then the title would be Strauss, Johann..

import javax.swing.*;
import java.util.Scanner;
public class lv1ex18 {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("First name: ");
        String first = input.next();
        
        System.out.println("Last name: ");
        String last = input.next();
        
        myWindow.setSize(300,300);
        myWindow.setTitle(last + " " + first);
        myWindow.setVisible(true);
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
