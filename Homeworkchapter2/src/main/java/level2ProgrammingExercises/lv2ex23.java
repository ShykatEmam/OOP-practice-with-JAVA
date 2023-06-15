/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package level2ProgrammingExercises;

/**
 *
 * @author Overlord
 */

//Display the current time in the title of a frame window using this format: 12:45:43 PM.
//Refer to Table 2.1 for the necessary designator symbols.

import javax.swing.JFrame;
import java.util.Date;
import java.text.SimpleDateFormat;

public class lv2ex23 {
    public static void main(String[] args) {
        Date today = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        
        String time = sdf.format(today);
        
        JFrame myWindow = new JFrame();
        
        myWindow.setSize(700,700);
        myWindow.setTitle(time);
        myWindow.setVisible(true);
        
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
}
