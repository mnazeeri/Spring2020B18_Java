package day04_JavaRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class ArithmeticOperations {
    public static void main(String[] args) {


    // 10/3 = 3.33333

    int a = 10/3; //3
        System.out.println(a);

        //10/4 ==> 2.5
        System.out.println(10/4); //2

        //11/10/4 = 2.5
        float f1 = 10/4;
        // float f1 = 2;
        System.out.println(f1); //2.0

        double d= 10/4;
        //double d = 2;
        // d==> 2.0
        System.out.println(d);; //2.0
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10.0/4.0); //2.5


     boolean evenNum = 25 % 2 == 0;
     // if 25 /2 has a remainder of zero, then it's even number
        System.out.println(evenNum);
        System.out.println(25%2);

        boolean oddNum = 25%2 == 1;
        System.out.println(oddNum);

        boolean OddNum = 22%2 == 0;
        // 0 != 0 ==> false
        System.out.println(OddNum);

        System.out.println(10%2 == 2); //10 is an even number
        System.out.println(11%2 ==1); //11 is an odd number

        System.out.println("10 is even number " + ( 10 % 2 ==0));
        System.out.println("11 is even number " + (11%2 ==0));
        System.out.println( "25 is odd number " + (25 % 2 != 0));

        System.out.println("25 is even number " + !(25%2 !=0));
        System.out.println("25 is even number " + (25 % 2 ==0));



    }

}
