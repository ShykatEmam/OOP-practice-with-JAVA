/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Overlord
 */
// Draw a rectangle on a frame windows content panel

import javax.swing.*; // for JFrame
import java.awt.*; //for Graphics and Container



public class Ch5SampleGraphics {
    public static void main(String[] args) {
        
        JFrame win;
        Container contentPanel;
        Graphics g;
        
        win = new JFrame("My First Rectangle");
        win.setSize(300, 200);
        win.setLocation(100, 100);
        win.setVisible(true);
        
        contentPanel = win.getContentPane();
        g = contentPanel.getGraphics();
        g.drawRect(50, 50, 100, 30);
    }
}
