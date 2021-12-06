package com.Gokulraj.Learn_Java;

public class Operators_2 {
    public static void main(String[] args){
        byte num = 10;
        byte num1 = 20;

        System.out.println(num == num1);
        System.out.println(num != num1);

        int num3 = num+num1;
        System.out.println(num3);

        //num1 = num1+10; == num1 += 10;
        num1 += 10;
        System.out.println(num3);

        int num4 = 5+5-5+20*8*4/2/4; //Bodmas theory
        System.out.println(num4);

    }
}
