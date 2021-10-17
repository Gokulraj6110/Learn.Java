package com.Gokulraj;

public class Voting_Register {
    public static void main(String[] args){
        int age = 45;
        boolean Indian = true;

        if (age>=18) {
            if (Indian == true) {
                System.out.println("You are eligible to vote");
            }    else {
                    System.out.println("You are not eligible to vote");
            }
        }
            else{
                System.out.println("you are not eligible to vote");
        }
    }
}
