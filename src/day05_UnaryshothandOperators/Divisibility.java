package day05_UnaryshothandOperators;

public class Divisibility {
    public static void main(String[] args) {

        /*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int
				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
				number = 80;
			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */
        //DataType VariableName = Data;
        int number = 65;
                boolean divisibleBy2 = number % 2 == 0;
        // if the number is divisible by 2 without a remainder that means it's even.
        boolean divisibleBy3 = number % 3 == 0;
        // if the number is divisible by 3 without a remainder that means it's even.
        boolean divisibleBy5 = number % 5 == 0;
        // if the number is divisible by 5 without a remainder that means it's even.

        String result1 = number + " is divisible by 2: "+ divisibleBy2;
        System.out.println(result1);

        String result2 = number + " is divisible by 3: " + divisibleBy3;
        System.out.println(result2);

        String result3 = number + " is divisible by 5: " + divisibleBy5;
        System.out.println( result3);

        //System.out.println(result1 + "\n " + result2 + "\n" + result3);

        String FinalResult = (result1 + "\n " + result2 + "\n" + result3);
        System.out.println(FinalResult);
    }



}
