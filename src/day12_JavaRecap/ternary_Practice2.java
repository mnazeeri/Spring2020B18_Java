package day12_JavaRecap;

import java.util.Scanner;

public class ternary_Practice2 {
    public static void main(String[] args) {
/*
Create a new switch statement using char instead of int.
Create a new char variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found.
 */


        char    ch1 = 'f';

        String result = (ch1 == 'A') ? "A is selected" : (ch1 == 'B') ? "B is selected" : (ch1 == 'C') ? "C is selected"
                          : (ch1 == 'D') ? "D is selected": (ch1 == 'E')? "E is slected": "Wrong Character is selected";
        System.out.println(result);
    }
}
