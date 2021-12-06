package com.Gokulraj.Learn_Java;

import java.util.Scanner;

public class Input_Classes {
    public static void main(String[] args){

        String input;
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name : ");
        input = name.next();

        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your age : ");
        num = number.nextInt();

        float flo;
        Scanner flot = new Scanner(System.in);
        System.out.println("Enter your height : ");
        flo = flot.nextFloat();

        System.out.println("hi,"+input);
        System.out.println("you age is "+num);
        System.out.println("you height is "+flo);

    }
}
