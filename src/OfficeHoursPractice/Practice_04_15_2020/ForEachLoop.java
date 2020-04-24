package OfficeHoursPractice.Practice_04_15_2020;

import java.util.Arrays;

/*
for each loop:
        for(DataType variableName : ArrayName){

        }
 */
public class ForEachLoop {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};

        for ( int each:arr){
            if(each == 3){
                break;
            }
            System.out.println(each);

        }
        System.out.println("_________________________________________________________________");
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        for (int each : arr2){
            if(each%2==0){
                System.out.println(each);
            }
        }



    }
}
