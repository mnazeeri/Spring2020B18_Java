package day11_Scanner;

import java.util.Scanner;

/*1. ask the user to enter first name
2. ask user to enter last name.
3. ask user to if employed or not? true == employed, false == unemploued
4. if he is employed, ask the salary
5. if he is not employed set the salary to 0.

output:
full name:
Employee status:
salary:
 */
public class Scanner_Practic1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name: ");
        String firstName = input.next();

        System.out.println("Enter your Last Name: ");
        String lastname = input.next();

        String fullName = firstName+" "+lastname;

        System.out.println("Are you employed? ");
        boolean employmentStatus = input.nextBoolean();

        double salary = 0;
        if (employmentStatus == true){
            System.out.println("Enter you salary: ");
            salary = input.nextDouble();
        } // else is not needed as the default salary is set to "zero"

        System.out.println("Full Name is: "+ fullName);
        System.out.println("Employeed: "+employmentStatus);
        System.out.println("Salary: $"+ salary);



    }


}
