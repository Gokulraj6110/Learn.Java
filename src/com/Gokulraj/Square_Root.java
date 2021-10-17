package com.Gokulraj;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args){
        double num;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextDouble();

        double square = Math.pow(num, 2);
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
