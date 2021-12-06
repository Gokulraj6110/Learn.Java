package com.Gokulraj.Learn_Java;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args){
        //In this program we identify the number is odd or even
        int num;
        System.out.println("Enter the integer number : ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println("It is an Even Number");
        else
            System.out.println("It is an Odd Number");
        }
    }

