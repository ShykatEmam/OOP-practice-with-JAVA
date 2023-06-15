/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level2ProgrammingExercises;

/**
 *
 * @author Overlord
 */
//Wirte a program that displays a frame window W pixels wide and H pixels high. 
//Use the scanner to enter the values for W and H. The title of the frame is also entered by the user.
import java.util.*;
import javax.swing.*;
public class lv2ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Title of the frame: ");
        String title = input.nextLine();
        
        System.out.println("Width: ");
        int w = input.nextInt();
        
        System.out.println("Height: ");
        int h = input.nextInt();
        
//        if i take the name of the frame here it doesn't work
//        System.out.println("Title of the frame: ");
//        String title = input.nextLine();
        
        JFrame myWindow = new JFrame();
        myWindow.setSize(w,h);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
}
