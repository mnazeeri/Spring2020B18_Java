package day23_methods;


import java.util.Scanner;

public class methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age, Please: ");
        int age = scan.nextInt();

        eligibleToBuyAlcohol(30);
    }




    public static void  eligibleToBuyAlcohol(int age){

        if (age>=21){
            System.out.println("Eligible to purchase alcohol");
        }else{
            System.out.println("Eligible to purchase non-alcoholic drinks");
        }

    }
}
