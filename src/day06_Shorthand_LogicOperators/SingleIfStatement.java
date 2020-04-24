package day06_Shorthand_LogicOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldweather = true;
        if(coldweather){ // it gets to be executed since the condition is assigned as "true"
            System.out.println("wear your hat");
            System.out.println("wear your jacket");
        }
        boolean coronaDetected = true;
        if (coronaDetected);
        {
            System.out.println("Buy more toilet papers:(");
            System.out.println("Stay home and don't get out:(");
            System.out.println("Make yourself busy with more Java practices:D");
        }
        System.out.println("____________________________________________________________________________________");

        int a = 201;
       // int b = 101;
        boolean evenNumber = a % 2 == 0; //if a number can be divided by 2
        //boolean oddNumber = a % 2 != 0; // if a number cannot be divided evenly
        if (evenNumber) {
            System.out.println(a + " is even number");
        }

        if (!evenNumber) {
            System.out.println(a + " is odd number");
        }



    }
}
