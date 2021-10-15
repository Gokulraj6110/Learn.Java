package com.Gokulraj;

public class Data_Types {

    public static void main(String[] args) {
            //In this programme we could see the data types of java
            // there are primitive and non-primitive data types are present in java
            // primitive - Boolean, Character, Integer and Floating points, Non-primitive - Array, String, Class, Interface, etc...
            // Integer - Byte, Short, Int, Long, Floating Points - Float, Double

            boolean boole = false; //boolean is used to store either true or false.
            char letter = 'A'; //char is used to store characters in 16-bit
            byte num = 15; //byte can store -128 to 127
            short num1 = 1235; //short can store -32,768 to 32,767
            int num2 = 123456789;//int can store 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive)
            long num3 = 123456789098755L; //long can store -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).
            float num4 = 5.343F; //float can store 32-bit IEEE 754 floating point.
            double num5 = 5.23452646454; //double can store 64-bit IEEE 754 floating point.

            System.out.println(boole+"\n"+letter+"\n"+num+"\n"+num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5);
    }

}