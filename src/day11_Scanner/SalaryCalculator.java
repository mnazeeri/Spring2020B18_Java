package day11_Scanner;

/* Write a program that can calculate the salary after
tax needed information: Employee's Salary : State Tax
Federal Tax
 */

import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner object

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax/100.0;

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax/100.0;

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * salary.
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        //salaryAfterTax = salary - totalTax

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax you paid is $"+ totalTax);


    }


}
