package com.Gokulraj.Learn_Java;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args){
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if (year % 400 != 0) {
                }
                else {
                    isLeap = true;
                }
            }
            else
                isLeap = true;
        }

        if(isLeap)
                    System.out.println(year + " is a Leap Year.");
                else
                    System.out.println(year + " is not a Leap Year.");
    }
}
