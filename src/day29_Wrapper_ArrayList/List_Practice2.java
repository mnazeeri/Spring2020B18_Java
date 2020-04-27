package day29_Wrapper_ArrayList;

import Resources.Library;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_Practice2 {

    /*
        1. Create a list of Integers
        2. Add 5 Integers
        3. Return the maximum number from the list
                Note: do not use sort method
         */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);


       // int maximum = Integer.MIN_VALUE;
        int maximum = list.get(0);
        for (int i = 0; i<list.size();i++){ // i: 0,1,2,3,4
            if (list.get(i)>maximum){
                maximum = list.get(i);
            }
        }
        System.out.println(maximum);

        int maximum2 = Integer.MIN_VALUE;
        for (Integer each : list){
            if (each > maximum2){
                maximum2 = each;
            }
        }
        System.out.println(maximum2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5000);
        list2.add(200);
        list2.add(300);
        list2.add(4500);

        int maximum3 = Library.max(list2);
        System.out.println(maximum3);
    }

    public static int max(ArrayList<Integer> list){
        int maximum = list.get(0);
        for (int i = 0; i<list.size();i++){ // i: 0,1,2,3,4
            if (list.get(i)>maximum){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
}
