/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level2ProgrammingExercises;

/**
 *
 * @author Overlord
 */

//Write a Java program that displays a frame window 300 pixels wide and 200 pixels high with the title
//MY First Frame. Place the frame so that its top left corner is at a position 50 piexels from the top
//of the screen and 100 pixels from the left of the screen. To position a window at a specified location, 
//you use the setLocation method, as in
//                    //assume mainWindow is declared and created
//                      frame.setLocation(50, 50);
//Through experimentation, determine how the two arguments in the setLocation method affect the 
//positioning  of the window

import javax.swing.JFrame;
public class lv2ex24 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("First frame");
        frame.setSize(300,200);
        
        frame.setLocation(50,100);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
