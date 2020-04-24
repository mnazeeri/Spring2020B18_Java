package day12_JavaRecap;

import java.util.Scanner;

public class salary_Calculator {

    /*
    ask the user to enter salary:
    ask the user to enter full name:
    ask the user to enter company name:
    ask the user to enter SSN:
    ask the user to enter job title:
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you salary amount: ");
        double salary = input.nextDouble();
input.nextLine();
        System.out.println("Enter your Full Name: ");
        String fullName = input.nextLine();

        System.out.println("Enter company name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN number");
        int SSN = input.nextInt();
input.nextLine();
        System.out.println("Enter job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Full Name is: "+fullName);
        System.out.println("Job Title Is: "+jobTitle);
        System.out.println(" Company name is: "+ companyName);
        System.out.println("SSN number is: "+ SSN);
        System.out.println("Salary amount is: "+ salary);

    }
}
