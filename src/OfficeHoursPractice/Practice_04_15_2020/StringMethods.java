package OfficeHoursPractice.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    /*
    String Methods:
    ToChartArray(); returns char array
    Split(); Splits the string by given str,
     */

    public static void main(String[] args) {

        String str = "Cybertek";

        char [] ch = str.toCharArray(); // ['C','y','b','e','r','t','k']
        System.out.println(str.length() == ch.length);

        /*
        Task: str1 = "abc, str2="cab"
        approach: creating arrays out of the above two strings
        ['a','b','c']
        ['c','a','b']

        ['a','b','c']
        ['a','b','c']
         */

        String str1 = "ABCD";
        String str2 = "DBAC";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("_______________________________________________________________________");

        String sentence = "I like to learn Java very much!";
        String [] words = sentence.split(" "); // [I, like, to, learn, Java, very, much!]
        System.out.println(Arrays.toString(words));

        int totalWords = words.length;
        System.out.println(totalWords);
        System.out.println("_______________________________________________________________________");

        // [I, like, to, learn, Java, very, much!]
        // Task: !much very Java learn to like I

        String result = " ";
            for (int i = words.length-1; i>=0; i--){
            // System.out.print(words[i]+" ");
            result += words[i]+" ";
        }
        System.out.println(result);



    }
}
