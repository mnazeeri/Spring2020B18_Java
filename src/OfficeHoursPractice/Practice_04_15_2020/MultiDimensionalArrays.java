package OfficeHoursPractice.Practice_04_15_2020;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3,};
        //                  0 1 2    0 1 2 3
        int [][] arr2D = { {1,2,3,},{4,5,6,7}  };
        //                    0        2
        // [Index num of 1DArray][index num of elements]

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        //7
        System.out.println(arr2D[1][3]);
        //4
        System.out.println(arr2D[1][0]);

        //Print the whole arrays
        System.out.println(Arrays.deepToString(arr2D));

    }
}
