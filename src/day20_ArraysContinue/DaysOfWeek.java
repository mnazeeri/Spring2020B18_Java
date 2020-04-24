package day20_ArraysContinue;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        String [] days = {"Monday", "Tuesday", "Wednesda", "Thursday", "Friday", "Satruday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();


        int attempt = 1;
        while (num > 7 || num <=0){
            System.out.println("Invalid Entree! Please, enter a valid number");
            num = input.nextInt();
            attempt ++;

            if (attempt==3 &&(num > 7 || num <=0)){
                System.out.println("You have reached your limit of three attempts!");
                System.exit(0);
            }
        }

        String result = days [num-1];
        System.out.println(result);
    }
}
