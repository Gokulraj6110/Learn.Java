package com.Gokulraj;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String args[]) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r= s.nextDouble();
        double  area=(22*r*r)/7 ;
        System.out.println("Area of Circle is: " + area);
    }
}
