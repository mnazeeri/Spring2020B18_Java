package day44_Exeptions;

import jdk.nashorn.internal.runtime.ECMAException;

public class Practice {
    public static void main(String[] args) {

        /*
        Print Hello,
        after two seconds print Cybertek,
        after three seconds print Java
            */

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        System.out.println("Cybertek");

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("Java");
       try {
           Thread.sleep(4000);
       }catch (Exception e){

       }
        System.out.println("Completed");
    }

}
