package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30, 20, 40, 50, 45, 35, 200

        list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(200);

        System.out.println(list1);

        System.out.println("==================================================");

        //addAll Method:
        list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));
        System.out.println(list1);

        System.out.println("==================================================");
        // Alternative solution to addAll method:

        Integer [] arr1 = { 30, 20, 40, 50, 45, 35, 200};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(arr1);

        System.out.println("==================================================");

        String [] names = {"Murtaza", "Muhtar", "Mehsong", "Sada", "Rustem"};
                        //    0          1          2        3         5
        // names [5] = "Osman"

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList  = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
                        // collectionType

        nameList.add("Osman");
        nameList.remove("Muhtar");

        System.out.println(nameList);

        System.out.println("==================================================");

        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList< Integer> numList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numList);
    }
}
