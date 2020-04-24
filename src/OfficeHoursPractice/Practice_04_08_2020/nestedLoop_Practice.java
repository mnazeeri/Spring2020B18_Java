package OfficeHoursPractice.Practice_04_08_2020;

public class nestedLoop_Practice {
    public static void main(String[] args) {
        /*
        Nested Loop: It means one loop inside another loop.
                     inner & outer loop
        Anything that needs to be repeated we can place them in another loop


         */

        int j = 1;
        while (j < 6){

            for (int i = 10; i <=50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();
            j++;
        }
        System.out.println("===============================================");

        /*

        print below on the console:
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */

        for (int l = 1; l < 7; l++) {

            for (int k = 1; k <= 6; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        System.out.println("==============================================");
        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *

         */
        for ( int i = 1; i <8; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
            System.out.println("===============================================");

            for ( int i = 8; i > 0; i--){
                for (int k = 0; k < i; k++) {
                    System.out.print("*" + " ");
                }

                System.out.println();
        }


    }
}

