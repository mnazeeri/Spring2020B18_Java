package OfficeHoursPractice.Practice_04_08_2020;

import javax.sound.sampled.EnumControl;
import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;

        int i = 1;
        while (i<=3){
            System.out.println("Please enter a number: ");
            int num = input.nextInt();

            if(num > max){
                max = num;
            }
            if(num < min) {
                min = num;
            }
            i++;
        }

        System.out.println("Maximum number entered is: "+ max);
        System.out.println("Minimum number entered is: "+ min);



    }
}
