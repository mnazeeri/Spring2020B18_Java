package day15_ForLoop;

public class forLoop_Practice {
    public static void main(String[] args) {

        String resultOdd ="";

        for (int number=1; number <=100; number += 2){
            //System.out.print(number+" ");

            resultOdd +=number+" ";
        }
        System.out.println(resultOdd);


        String resultEven = "";
        for (int number = 2; number <= 100; number += 2){

            resultEven +=number+" ";
        }
        System.out.println(resultEven);

    }
}
