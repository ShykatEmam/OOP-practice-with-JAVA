/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Overlord
 */
public class Ch5DrawShape {
    private DrawingBoard canvas;
    public Ch5DrawShape(){
        canvas = new DrawingBoard();
    }
    public void start(){
      canvas.setVisible(true);  
    }
    public static void main(String[] args) {
        Ch5DrawShape screensaver = new Ch5DrawShape();
        screensaver.start();
    }
}
