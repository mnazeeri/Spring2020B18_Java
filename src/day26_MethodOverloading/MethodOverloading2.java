package day26_MethodOverloading;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    1. First method: print the sum of two int numbers
    2. Second method: print the sum of three int numbers
    3. Third method: print the sum of four int numbers
       */

    public static void main(String[] args) {
        // 10, 5
        sum2Numbers(10,5);

        //10, 5, 5
        sumThreeNumbers(10,5,5);

        //10, 20, 30 ,40
        sumFourNumbers(10,20,30,40);

       // int [] arr = {5,4,7,1,2}; int sort, double sort, char sort ...etc
       // Arrays.sort(arr);


        System.out.println("==================================================");
        // 10, 5
        sum(10,5);

        //10, 5, 5
        sum(10,5,5);

        //10, 20, 30 ,40
        sum(10,20,30,40 );

        int [] arr1 = {3,2,1};
        char [] arr2 = {'z','s','a'};
        double [] arr3 = {7.4, 5.3, 9.01};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        //Same method name can be used for different parameters
    }

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }

    public static void  sumThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void  sumFourNumbers (int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    //===========================================================================


    public  static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void  sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void  sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}
