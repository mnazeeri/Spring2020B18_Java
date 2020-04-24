package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
            while(  ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, please re-enter yes or no");
                answer = input.next();
            }


            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }


        }
        /*
        Assignment:
        Write a program for the room reservation:
        King bed ==> 120
        Queen bed ==> 100
        Single bed ==> 80

        Should aks which bedreoom do you want to reserve.
        If user provides invalid entry ==> please re-enter

        Calculate the total price

        Do you want to reserve another room:
        if yes ==> repeat the previous steps
        if no ==> your total is: $$$

        if answer either yes or no ==> please re-enter


         */

    }
}
