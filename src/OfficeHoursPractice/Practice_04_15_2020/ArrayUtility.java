package OfficeHoursPractice.Practice_04_15_2020;

/*
Arrays.sort(); sorts arrays to ascending orders
Arrays.equal(); arr1 == arr2
Arrays.toString(); converts single dimensional arrays to string

Arrays.deepToString(); converts multi-dimensional arrays to string

 */
import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int [] arr = {9,80,7,60,50,4,13};

        Arrays.sort(arr); // sort the arrays elements

        System.out.println(Arrays.toString(arr));

        int [] salaries = {10000, 200000, 20, 500, 432, 123123,200000,123000,250000,5};
        int length = salaries.length;
        int lastIndex = length-1;
        Arrays.sort(salaries); //ascending
        System.out.println(Arrays.toString(salaries));

        System.out.println("Minimum salary is: "+salaries[0]);
        System.out.println("Maximum salary is: "+salaries[length-1]);

        System.out.println("============================================================");

        int [] arr1 = {2,1,3};
        int [] arr2 = {3,2,1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
