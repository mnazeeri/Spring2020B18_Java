package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Enter

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Your number is: "+num);

        input.nextLine(); // it's used to take out the "Enter" from automatically happening

        System.out.println("Enter your name: ");
        String name = input.nextLine(); //Enter
        System.out.println("Your name is: "+ name);






    }
}
