package day12_JavaRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class scanner_NextLinePractice {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        //12365 Plano Rd. Dallas, TX 75243
        //fulAddress: Building-number Street, City, State, Zip code

        System.out.println("Building number: ");
        int Bnumber = input.nextInt();
            System.out.println("Building number is: "+Bnumber);

            input.nextLine();

            System.out.println("Street: ");
            String street = input.nextLine();
            System.out.println("Street number is: "+ street);


            System.out.println("Enter the Zip code: ");
            int zipCode = input.nextInt();
            System.out.println("Zip code is: "+ zipCode);

            input.nextLine();

            System.out.println("Enter the City Name and State separated with comma: ");
            String cityState = input.nextLine();

            String fulladdress = Bnumber+" "+street+". \n"+cityState+" "+zipCode;
            System.out.println(fulladdress);




    }





}
