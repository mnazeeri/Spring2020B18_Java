package day24_Methods;

import java.util.Scanner;

public class BirthYear {

    public static void  Age(int birthYear){ //2000
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current year, please:");
        int currentYear = scan.nextInt();


        int age = currentYear - birthYear;
        if(age > 0 && birthYear >1900){
            System.out.println(age);
        }else {
            System.out.println("Invalid Birth Year, Please try again!");
        }


    }

    public static void main(String[] args) {

       // Age(1989);
        printHelloCybertek();
    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void  printHelloCybertek(){
        printHello();
        printCybertek();

    }

}
