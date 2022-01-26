package com.company;
// Java code to calculate the bmi of a person
// @Author: Bamidele Oluwatomisin
// Email: o.bamidele@alustudent.com.

// Installing scanner
import java.util.*;
// This is the beginning of the code using the intellij IDE template
public class Main {

    public static void main(String[] args) {
        // Including scanner so java can take inputs
        Scanner sc = new Scanner(System.in);
        // User enters their name
        System.out.println("Enter your name:");
        String str= sc.nextLine(); // Used this since it is a string input
        System.out.println("Input height in meters: ");
        // implicit type casting
        double height = sc.nextDouble(); // Used the double method to format to string and accept decimal inputs
        System.out.println("Input weight in pounds");
        double weight = sc.nextDouble(); // Used the double method to format to string and accept decimal inputs
        double BMI = weight / (height * height);
        System.out.print("\nYour Body Mass Index (BMI) is " + BMI + " kg/m2");


    }
}
