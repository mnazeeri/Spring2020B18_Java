package day06_Shorthand_LogicOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1); //false

        boolean result2 = ! (10 + 15 > 15);
        System.out.println(result2);

        boolean result3 = !true == !false;
        System.out.println(result3);

        boolean R1 = "Corona Virus" != "End of the world" && "toilet paper" =="cure";
                    //                      True            and             false   == false
        System.out.println(R1);

        boolean R2 = 10>15 && 15<13;
        //           false and false == false
        System.out.println(R2);

        boolean R3 = 'a' == 'b' -1 && 'b' +1 == 'c';
        // 97 == 98-1 && 98+1 = 99 ==> true
        System.out.println(R3);

        boolean R4 = true != false || false == !true;
                    // True     ||      True ==> True
        System.out.println(R4);

        boolean R5 = true != false && false == !true;
                    // true && false ==>
        System.out.println(R5);

        boolean R6 = !!!!!false; //if "!" is odd it will return the opposite of the expression
        System.out.println(R6);


    }
}
