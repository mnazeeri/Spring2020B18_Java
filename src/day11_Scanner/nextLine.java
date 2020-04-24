package day11_Scanner;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Full Name: ");
        String fullName = input.nextLine(); // nextLine() accepts "Enter".

        System.out.println(fullName);
        System.out.println("Your Full Name is: "+ fullName);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();

        System.out.println("You entered: "+ sentence);






    }
}
