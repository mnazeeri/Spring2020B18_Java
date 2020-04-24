package day04_JavaRecap;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class Variable_Practice {
    public static void main(String[] args) {
        //DataType Variablename = Data;

        byte num1= 127;
        short num2= num1;  //double > float > Long > Int> short> byte
       // byte num3 = num2; not allowed

        int num4 = num2; // int is preferred by compiler
        long num5 = 9999999999l;
        float num6 = 100L;
        System.out.println(num6);
        //1. 100, 2. 100L, 3. 100.0

        float num7 = 0.5f;
        System.out.println(num7);

        double num8 = 0.5f;
        double num9 = 999999L;
        double num10 = 100.5;
        System.out.println(num10);
        System.out.println(num9);

        char    ch1 = '$'; //every character has a corresponding number assigned to them
        System.out.println(ch1);

        char ch2 = 2500; //char 0~65565
        System.out.println(ch2);

        int al = '8';
        System.out.println(al); // 56 is a character

        int a2 = 'z';
        System.out.println(a2); //122

        double d1 = 'z' + '8'; //z8, 178, 178.0
        System.out.println(d1);

        char ch4 = 'z'+ '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(9>10); //false
        System.out.println(9>=9); //true
        System.out.println(9!=10); //true
        System.out.println('a' == 'b'); //false
        // System.out.println( 'a' == "b"); does not match
        System.out.println('a' == 'b' -1); //a = 97 and b = 98 -1 which is true

        System.out.println("Murtaza" == "good guy"); //false
        //                  bad guy ==   good guy ==> false
        System.out.println("Murtaza" != "good guy"); //true
        System.out.println("Murtaza" == "murtaza"); // false
        // System.out.println("Cybertek" == 10000);

        boolean r1 = !true; //false
        System.out.println(r1); //false
        System.out.println(!r1); //true

        System.out.println(!true == false); //true
        System.out.println(!true == !false); //false


    }





}
