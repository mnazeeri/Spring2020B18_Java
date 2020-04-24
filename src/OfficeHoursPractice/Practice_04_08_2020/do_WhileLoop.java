package OfficeHoursPractice.Practice_04_08_2020;

public class do_WhileLoop {
    public static void main(String[] args) {
        /*
        do{

        }While(Condition){
                statements
                }
                Repeated if statement execution order:
                1. statements;
                2. Condition:
                        if true: repeats step 1
                        if false: stops the loop

         */

        boolean b = false;
        while( b){
            System.out.println("Hello Dear!");
        }
        System.out.println("========================================================");

        do{
            System.out.println("Hello Bro!");
        }while(b);

        System.out.println("========================================================");

        int j = 1;
        do{
            if(j%20==0)
            System.out.print(j+" ");


            j++;
        }while(j <=100);
    }
}
