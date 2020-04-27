package day29_Wrapper_ArrayList;

import day07_IfStatements.MaxNumber;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integers, 123

        System.out.println(a);

        double b = Integer.valueOf(str); // unboxing
        // double = Integer

        System.out.println(b);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double // none

        double d2 = Double.valueOf(str2);
        //   double = Double
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1 == d2);

        System.out.println("________________________________________");

        int z1 = 2000;
       // Long L1 = z1; // does not accept any other primitives except for Long
        Short sh1 = 3000;
        int z2 = sh1;

        /*
        "True"
        FAlSe" ==> to boolean
        "100000000.5" ==> to float
        "123456" ==> to int
         */

        String r1 = "tRuE";
        Boolean t1 = Boolean.valueOf(r1); // Boolean, true
        // boolean = Boolean  // non

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        //boolean = Boolean //unBoxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("_________________________________________________________");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum4 = Byte.MIN_VALUE;
        System.out.println(minNum4);


    }
}
