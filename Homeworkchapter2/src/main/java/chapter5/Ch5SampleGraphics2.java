/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Overlord
 */

import javax.swing.*; // for JFrame
import java.awt.*; //for Graphics and Container

public class Ch5SampleGraphics2 {
     public static void main(String[] args) {
        
        JFrame win;
        Container contentPanel;
        Graphics g;
        
        win = new JFrame("Rectangle");
        win.setSize(300, 200);
        win.setLocation(100, 100);
        win.setVisible(true);
        
        contentPanel = win.getContentPane();
        contentPanel.setBackground(Color.LIGHT_GRAY);
        
        
        
        g = contentPanel.getGraphics();
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 30);
        
        g.setColor(Color.RED);
        g.fillRect(175, 50, 100, 30);
    }
}
