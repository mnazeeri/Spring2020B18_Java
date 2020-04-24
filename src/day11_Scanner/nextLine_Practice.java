package day11_Scanner;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt(); // 30 + Enter

        System.out.println("Your age is: "+ age);

        input.nextLine();

        System.out.println("Please enter your full name: ");
        String fullname = input.nextLine();

        System.out.println("Your Full Name is: " + fullname);


    }
}
