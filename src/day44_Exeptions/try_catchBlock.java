package day44_Exeptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlock {

    public static void main(String[] args) {
        System.out.println("Test Started");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //System.out.println(list.get(10)); inserted in "try and catch" block



        try{
            System.out.println(list.get(10));

        }catch(IndexOutOfBoundsException e){

        }
        System.out.println("Test Completed");
    }
}
