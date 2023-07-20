/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5;

/**
 *
 * @author Overlord
 */
import java.util.*;
public class chapter5TheCircleClass {
    public static final int INVALID_DIMENSION = -1;
    
    private double radius;
    public chapter5TheCircleClass(double r){
        setRadius(r);
    }
    
    public double getArea(){
        double result = INVALID_DIMENSION;
        
        if(isRadiusValid()){
            result = Math.PI * radius * radius;
        }
        return result;
    }
    
    public double getCircumference(){
        double result = INVALID_DIMENSION;
        if (isRadiusValid()){
            result = 2.0 * Math.PI * radius;
        }
        return result;
    }
    public double getDiameter(){
        double diameter = INVALID_DIMENSION;
        
        if(isRadiusValid()){
            diameter = 2.0 * radius;
        }
        return diameter;
    }
    public double getRadius(){
        return radius;
    }
    public void setDiameter(double d){
        if(d>0){
            setRadius(d/2.0);
        }else{
            setRadius(INVALID_DIMENSION);
        }
    }
    
    public void setRadius(double r){
        if(r>0){
            radius = r;
        }else{
            radius = INVALID_DIMENSION;
        }
    }
    private boolean isRadiusValid(){
        return radius != INVALID_DIMENSION;
    }
    
    
    
    public static void main(String[] args) {
        double radius, circumference, area;
       
        chapter5TheCircleClass circle;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();

        circle = new chapter5TheCircleClass(radius);

        circumference = circle.getCircumference();

        area = circle.getArea();

        System.out.println("Input radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

     
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
