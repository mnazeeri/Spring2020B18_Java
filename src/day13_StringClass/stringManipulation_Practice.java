package day13_StringClass;

/*
input: cyBerTeK ScHoOl
outut:
    Cybertek
    School

 */
import java.util.Scanner;

public class stringManipulation_Practice {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //Cybertek School

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1 );

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("Your First Name is: "+firstName);
        System.out.println("Your Last Name is: "+lastName);

        /*
        Assignment:
        Write a program that asks the user first and last name, then it prints the initials:
        Ex:
        Input: Cybertek
               School

        Output:
              CS
         */




    }
}
