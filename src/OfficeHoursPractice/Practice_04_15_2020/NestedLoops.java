package OfficeHoursPractice.Practice_04_15_2020;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {

        char [] [] arr2D = { { 'A','B'}, { 'C','D', 'E'}, {'F','G','H', 'I'} };
        //                        0              2                   3
        // arr2D[0]

        for (int j=0; j<arr2D.length; j++){   // J: represents the index nums of 1D array

            for (int i = 0; i<arr2D[j].length; i++){ // i: represents index nums of the elements in 1D
                System.out.println(arr2D[j][i]);

            }
        }
        System.out.println("______________________________________________________________________");
        // arr2D = { { 'A','B'}, { 'C','D', 'E'}, {'F','G','H', 'I'} };
        //                0              1                   3

        for ( char [] each1DArray :arr2D){
            for(char eachElement  :each1DArray)
            System.out.println(eachElement);
        }



    }
}
