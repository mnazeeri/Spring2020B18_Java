package day19_Arrays;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.util.Scanner;

public class arraysPracticeTwo {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30};
        System.out.println(arr.length); // length is "3"

        int [] arr2 = new int [5];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        System.out.println("======================================================");
        String [] Testers = new String [3]; // {"Me", "Myself", "I"};
                            // 0, 1, 2
        Testers [0] = "Me";
        Testers [1] = "Myself";
        Testers [2] = "I";
        System.out.println(Testers[0]); // Me
        System.out.println(Testers[1]); // Myslef
        System.out.println(Testers[2]); // null ==> by default

        System.out.println(Testers.length); //3

        System.out.println("=========================================================");

        String [] students = new String [10];
        // write a program that asks a user to enter a name 10 times, and store each of the name in the array students

        Scanner input = new Scanner(System.in);


    }
}
