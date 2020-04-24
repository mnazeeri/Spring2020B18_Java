package OfficeHoursPractice.Practice_04_08_2020;

public class WhileLoops_Practice {
    public static void main(String[] args) {
      /*
      While (Condition){
             statements

      }
        While Loop: is repeated "if statements"
       */
      for ( int i = 0; i< 5; i++){
          System.out.println("Hello World!");
      }
        System.out.println("=========================================================================================");
        int z = 0;
        while (z<5){
            System.out.println("Hello Dear!");
            z++;
        }
        System.out.println("=========================================================================================");

        int j = 0;
        while (j<=100){
            if (j%15 ==0) {
                System.out.print(j + " ");
            }
            j++;
        }
    }
}
