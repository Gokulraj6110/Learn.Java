package com.Gokulraj;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){

        String name;
        Scanner nama = new Scanner(System.in);
        System.out.println("Enter your name here : ");
        name = nama.next();


        switch(name) {
            case "Raj":
                System.out.println("Hi, Raj you are so handsome today");
                break;
            case "Raju":
                System.out.println("Hi, Raju you are so handsome today");
                break;
            case "Gokulraj":
                System.out.println("Hi, Gokulraj you are so handsome today");
                break;
            default:
                System.out.println("yourname is not in the list");
        }
    }
}
