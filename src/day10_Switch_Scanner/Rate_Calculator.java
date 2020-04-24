package day10_Switch_Scanner;
/*
write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */
import java.util.Scanner;

public class Rate_Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work per week? ");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year? ");
        byte weekPerYear = scan.nextByte();

        //hourlyRate = (salary/weekPerYear)/weeklyHours

        int hourlyRate = (salary/ weekPerYear)/ weeklyHours;

        System.out.println("Your hourly rate is: $"+ hourlyRate);

    }
}
