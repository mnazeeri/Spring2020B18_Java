package day29_Wrapper_ArrayList;

/*
Given:
String[] arr = {"1", "2.5", "3", "3.5", "4.4"}
Find the maximum and minimum numbers.
Note: Do not use sort method
 */

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        String [] arr = {"1", "2.5", "3", "3.5", "4.4"};

       Double max = Double.MIN_VALUE;

        for (String each: arr){ // 5, each: 1, 2.5, 3, 3.5, 4.5
            double num = Double.valueOf(each);
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);

        System.out.println("____________________________________________________");

        String [] arr2 = {"1", "2.5", "3", "3.5", "4.4"};
        double [] numbers = new double[arr2.length]; // [0.0, 0.0, 0.0, 0.0, 0.0]

        for (int i = 0; i<arr2.length; i++){
            numbers [i] = Double.parseDouble(arr2[i]);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);

    }
}
