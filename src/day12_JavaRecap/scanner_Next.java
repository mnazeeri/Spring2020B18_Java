package day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scanner_Next {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //String str = input.next();

       // System.out.println(str);

       // 12365 Plano Rd. Dallas TX 75243
        String fullAddress = "";

        System.out.println("Enter the building number: ");
        short Bnumber = input.nextShort();
        fullAddress += Bnumber+" ";

        System.out.println("Enter the street name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the road type: ");
        String roadType = input.next();
        fullAddress += roadType+". ";

        System.out.println("Enter City name, State, and Zipcode: ");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state+", ";

        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: "+ fullAddress);








    }

}
