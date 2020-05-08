package day36_StaticBlock;

import day34_CustomCLass.Tester;

public class staticBlock3 {

    static String name ;
    static int num;
    static Tester tester1;

    static{

        name = "Murtaza";
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("Murtaza", 123, "SDET", 123000);
    }
/*
    public static void main(String[] args) {

        name = "Murtaza";
        num = 200;



        System.out.println(name );
        System.out.println(num );
    }

 */
}
