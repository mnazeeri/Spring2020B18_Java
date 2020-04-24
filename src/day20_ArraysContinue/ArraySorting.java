package day20_ArraysContinue;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4, -4,5,6,7,8,9};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println("First mim number is: " +arr1[0]);
        System.out.println("Second min number is: "+ arr1[1]);

        System.out.println("First max number is: "+ arr1[arr1.length-1]);
        System.out.println("Second max numebr is: "+ arr1 [arr1.length-2]);

    }
}
