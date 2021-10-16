package com.Gokulraj;

import java.util.Scanner;

public class Area_Of_Square {
    public static void main(String[] args){
        System.out.println("Enter the side of the Square : ");
        Scanner scan = new Scanner(System.in);
        double side = scan.nextDouble();
        double area = side * side;
        System.out.println("Area of Square is : "+area);

    }
}
