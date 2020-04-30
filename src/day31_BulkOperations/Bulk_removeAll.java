package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,3,3,3,3,3,3,3,3,3));
        // Remove 1,3,5,8

        Integer a= 1;
        list.remove(a);
        list.remove(a);

        Integer b = 3;
        list.remove(b);
        list.remove(b);

        System.out.println(list);

        System.out.println("======================================================");

        //Bulk Operations Remove all Method;

        list.removeAll(Arrays.asList(3));
        System.out.println(list);

        System.out.println("======================================================");

        //alternative solution - RemoveAll

        Integer [] arr = {3,2,5,8};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("======================================================");

        String [] names = {"Ahmed", "John", "Aaron", "Ahmed", "Daniel", "Ahmed", "Murtaza", "Ahmed"};

        ArrayList<String> namesList = new ArrayList<>( Arrays.asList(names) );

        namesList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(namesList);

    }
}
