package com.Gokulraj;

public class Increment_Operators {
    public static void main(String[] args){
        int count = 1;
        // count = count+1
        count++; // post increment Operator
        ++count; // pre increment Operator
        System.out.println(count);
        System.out.println(--count+count++);
    }
}
