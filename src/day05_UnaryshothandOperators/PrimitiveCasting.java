package day05_UnaryshothandOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //Implicit Casting; Automatically done
        int a = 10;
        long b = a; //implicit casting is done automatically
        // b = 10L

        // int c = b; // b already assigned as long datatype


        int a1 = 100;
        long b1 = (long)a1; //manually doing the implicit casting
        // int c1 = b1;

        // Explicit Casting ; casting larger to smaller primitives

        int Inum = 100;
        byte Bnum = (byte)Inum;

        short Snum = (short) Inum; // Exp casting ; should be same size or smaller to compile
        double Dnum = 5.5;
        float   Fnum = (float)Dnum;
        System.out.println(Fnum);

        //we need to make sure if Fnum is a numer so refer to below example;
        System.out.println(Fnum + 1);

        float fnum= (int) Dnum; // 5.0
        // fnum = (int) 5.5
        // Fnum = 5 ;
        //Fnum = 5.0
        System.out.println(Fnum);

        double D1 = 10.5 ;
        long L1 = (int) D1;
        System.out.println(L1);

        float F1 = 60.5f;
        int I1 = (int)F1; //preferred
        System.out.println(I1);

        long largeNum = 999999999999999999L;
        int intNum = (int)largeNum;
        System.out.println(largeNum);

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        double  dbl1 = ch2; //23456.0
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1; //10.0
        short y1 = (short)z1; // explicit casting




    }

}
