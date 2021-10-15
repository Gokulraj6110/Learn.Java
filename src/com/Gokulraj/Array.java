package com.Gokulraj;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        //We are going to see about arrays
        int[] a = new int[5];
        a[0] = 5;
        a[1] = 6;
        a[2] = 7;
        a[3] = 8;
        a[4] = 9;
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);

        int[] a2 ={10,12,13,14,15,4,3,2,33,4,5};
        System.out.println(Arrays.toString(a2));

        char[] alpha = {'a','b','c'};
        int lenu = alpha.length;
        System.out.println(Arrays.toString(alpha));
        System.out.println(lenu);

        String[] name = {"Gokulraj is my name"};
        int len = name.length;
        System.out.println(Arrays.toString(name));
        System.out.println(len);

        char[] name1 = alpha.clone();
        System.out.println(name1);
    }
}
