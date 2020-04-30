package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result = new ArrayList<>(); // expected result [1,2,3]

        for (Integer each : list ){ // values of each: 1,1,2,2,3,3

            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);

        System.out.println("=================================================");

        /*
        Write a program that can remove duplicates from an array of integer.
        Note: Do not use "for each loop"
         */

        Integer [] arr1 = {1,1,2,2,3,3};
        ArrayList<Integer> nonDuplist = new ArrayList<>();

        for ( int i = 0; i < arr1.length; i++){
            if (!nonDuplist.contains(arr1[i])){

                nonDuplist.add(arr1[i]);
            }
        }
        System.out.println(nonDuplist);
    }
}
