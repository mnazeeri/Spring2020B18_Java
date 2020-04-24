package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Write a program that asks user's first and last name and their initials at the end.
 */
public class Initials {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName =input.next();

        System.out.println("Enter your Last Name: ");
        String lastName = input.next();

        // String initials = firstName.substring(0,1) + lastName.substring(0,1);
       //  initials = initials.toUpperCase();

        // Solving with charAt method:
        String initials =" "+firstName.charAt(0)+lastName.charAt(0);
        initials = initials.toUpperCase();

        System.out.println("Initials: " + initials);

    }
}
