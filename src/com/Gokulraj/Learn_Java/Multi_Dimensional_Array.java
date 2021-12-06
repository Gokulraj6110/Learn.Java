package com.Gokulraj.Learn_Java;

import java.util.Arrays;

public class Multi_Dimensional_Array {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,0}; //single dimensional array
        int[][] arrayOf2Dim = {{1,2},{3,4},{5,6}}; //two dimensional array
        int[][][] arrayOf3Dim = {{ {1,2,3},{4,5,3}},{{5,2,4},{6,8,7}},{{4,2,1},{2,3,2} }}; //three-dimensional array
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayOf2Dim [2]));
        System.out.println(Arrays.toString(new int[]{arrayOf3Dim[0][0][0]}));
    }
}
