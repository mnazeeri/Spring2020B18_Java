package day20_ArraysContinue;

import java.util.Arrays;

public class Arrays_Utilities {
    public static void main(String args[]) {

        int [] arr = {1,2,3};

        String r = Arrays.toString(arr);
        System.out.println(r); // Array must be converted to string before being able to print

        String names [] = {"Messi", "Suarez", "Neymar"};
        System.out.println(Arrays.toString(names));

        double[] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));

        System.out.println(nums [0]+1);
/*
Write a program that can combone two arrays of any lengths, and return a third array:
arr1 ==> [1,2,3]
arr2 ==> [4,5,6,7]
arr3 ==> [1,2,3,4,5,6,7]
 */
    }
}
