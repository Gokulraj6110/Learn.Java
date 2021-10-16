package com.Gokulraj;

import java.util.Random;

public class Random_Number {
    public static void main(String[] args){
        int num;
        Random rnum = new Random();
        System.out.println("Random Number : ");
        for (num = 1; num <= 5; num++ );
        System.out.println(rnum.nextInt(200));
    }
}
