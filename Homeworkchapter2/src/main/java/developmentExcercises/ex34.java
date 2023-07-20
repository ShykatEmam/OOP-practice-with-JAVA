/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developmentExcercises;

/**
 *
 * @author Overlord
 */
//Follow the incremental development methodology explained in this chapter to implement a program 
//for the following problem statement. You must clearly write down the program tasks, create a design
//document with class descriptions, and draw the program diagram. Identify the development steps.
//State any assumptions you must make about the input. Articulate any design alternatives, 
//and justify your selection. Be sure to perform adequate testing at the end of each development step.

//Problem Statement: Write a program that asks the user for his or her birth
//date and replies with the day of the week on which he or she was born.
//We learned in this chapter that we can create a Date object for today’s date by writing

//import java.util.*;
//...
//Date today = new Date();

//To create a Date object for a date other than today, we can use the Date class from the java.sql 
//package. (A more general and flexible way to deal with a

//date by using the GregorianCalendar class is introduced in Chap. 3.) Notice that there are two
//distinct classes with the same name Date, but from different packages—one from java.util and
//another from java.sql. To distinguish the two, we will use the fully qualified names. To create a
//new java.util.Date object, we can call the class method valueOf of the java.sql.Date class with the
//string representation of a date. The string representation must be in the format yyyy-MM-dd. 
//For example, to create a java.util.Date object for July 4, 1776, we write

//java.util.Date bdate = java.sql.Date.valueOf("1776-07-04");

//Notice that valueOf is a class method of the Date class in the java.sql package. 
//Calling it with a correct argument will return a java.util.Date object for the specified date 

public class ex34 {
    public static void main(String[] args) {
        
    }
    
}
