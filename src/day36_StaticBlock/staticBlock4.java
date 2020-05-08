package day36_StaticBlock;

import day34_CustomCLass.Tester;

public class staticBlock4 {

    static String name = "CyberTek School";
    static Tester tester1 = new Tester();
    //tester1.setInfo("Murtaza", 123, "SDET", 120000);
   int  insVariable;

    static { // deisgned for statics only
        //gets executed as soon as the class is loaded
        // deisgned to initialize stati variable
        name = "Cybertek School";
        tester1.setTesterInfo("Murtaza", 123, "SDET", 120000);
        tester1.setTesterInfo("Namik", 12343, "SDET", 120000);

        // staticBlock4 obj1 = new staticBlock4();
        // obj1.insVariable = 300; // DO NOT use static block for initializing the instance variables
    }



    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);

        staticBlock4 obj2 = new staticBlock4();
        System.out.println( obj2.insVariable ); // 0


    }
}
