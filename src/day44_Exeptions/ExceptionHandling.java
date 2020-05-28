package day44_Exeptions;

import sun.security.krb5.internal.crypto.Des;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {

            System.out.println(str.charAt(500));

        }catch (RuntimeException e){

            String description = e.getMessage();
            System.out.println(description);
        }
        System.out.println("===========================================");

        try {
            System.out.println(10 / 0);

        } catch (ArithmeticException e){

            System.out.println("Catch Block");
            String descripbtion2 = e.getMessage();
            System.out.println(descripbtion2);

        }

        System.out.println("Completed");
    }
}
