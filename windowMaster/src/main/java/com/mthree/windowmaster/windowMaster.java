/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.windowmaster;

import java.util.Scanner;

/**
 *
 * @author kyleo
 */
public class windowMaster {
    public static void main(String [] args) {
        
    // declare variables for height and width
    float height;
    float width;
    float numWindows;
    float trimCost;
    float windowCost;
    
    // declare variables 
    String stringHeight;
    String stringWidth;
    String stringTrimCost;
    String stringWindowCost;
    String stringNumWindows;

    // more variables
    float areaOfWindow;
    float cost;
    float perimeterOfWindow;
    

    // declare and initialize the Scanner
    Scanner myScanner = new Scanner(System.in);

    // inputs
    while (true){
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
            try {
            height = Float.parseFloat(stringHeight);
            if(height > 0){
                break; 
            }
            else{
                System.out.println("Please enter a number greater than 0");
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please input a number: ");
            }
    }
    
    while (true){
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
            try {
            width = Float.parseFloat(stringWidth);
            if(width > 0){
                break; 
            }
            else{
                System.out.println("Please enter a number greater than 0");
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please input a number: ");
            }
    }
    
    while (true){
        System.out.println("Please enter cost of trim:");
        stringTrimCost = myScanner.nextLine();
            try {
            trimCost = Float.parseFloat(stringTrimCost);
            if(trimCost > 0){
                break; 
            }
            else{
                System.out.println("Please enter a number greater than 0");
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please input a number: ");
            }
    }
    while (true){
        System.out.println("Please enter cost of window glass:");
        stringWindowCost = myScanner.nextLine();
            try {
            windowCost = Float.parseFloat(stringWindowCost);
            if(windowCost > 0){
                break; 
            }
            else{
                System.out.println("Please enter a number greater than 0");
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please input a number: ");
            }
    }
     while (true){
        System.out.println("Please enter the number of windows:");
        stringNumWindows = myScanner.nextLine();
            try {
            numWindows = Float.parseFloat(stringNumWindows);
            if(numWindows > 0){
                break; 
            }
            else{
                System.out.println("Please enter a number greater than 0");
            }
            } catch(NumberFormatException ex) {
                System.out.println("Please input a number: ");
            }
    }
    

    // convert String values of height and width to float values
    height = Float.parseFloat(stringHeight);
    width = Float.parseFloat(stringWidth);
    numWindows = Float.parseFloat(stringNumWindows);
    windowCost = Float.parseFloat(stringWindowCost);
    trimCost= Float.parseFloat(stringTrimCost);
    //Calculates the area of the window
    areaOfWindow = height*width;
    
    //Calculate perimeter of window
    perimeterOfWindow = 2 * (height + width);
    
    //Calculates the total cost
    cost = ((windowCost*areaOfWindow) + (trimCost * perimeterOfWindow)) * numWindows;
    
    System.out.println("Window height = " + stringHeight);
    System.out.println("Window width = " + stringWidth);
    System.out.println("Window area = " + areaOfWindow);
    System.out.println("Window perimeter = " + perimeterOfWindow);
    System.out.println("Total Cost =  " + cost);
    
}
}
