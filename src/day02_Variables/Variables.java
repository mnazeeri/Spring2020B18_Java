package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        /* declare variables:
        DataTypes Variablename = Data;
         */
        byte l = 4;
        byte w = 2;
        byte are = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(are);
        //byte should not be out of -128 and 127 range
        // no decimal number can work for byte either

        short num3 = 1000;
        //short num4 = 40000;  exceeds the rang of short

        System.out.println(num3);
        System.out.println(12345); //by defualt compiler takes it as int primitive
        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2);
        //long n3 = 9999999999; // out of int' range
        Long n4 = 9999999999L; // forcefully telling the compiler that this is a long data number

        System.out.println(n4);
        System.out.println(9999999999999L);

        long n5 = 19;

        // in num = 7L Larger one cannot be assigned to a smaller one

        //double > float > long > Int > short > byte

        // short s1 = 10;
        //byte b1 = s1; short is larger than byte

        //int il = sl; larger one cannot be assigned to smaller on

        System.out.println(3.5);
        double d1 = 3.5;
         //float f1= 4.5; // double primitive is larger than float primitive cannot be assigbed

        float f2 = 5.5f;
        System.out.println(f2);
        System.out.println("====================================================");

        float pi = 1.14f;
        double p =  3.14;

        int a1 = 3000;
        double d2 = a1; //3000.0

        System.out.println(d2);

        //neeed a reciewe here!



    }


}
