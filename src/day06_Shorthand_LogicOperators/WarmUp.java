package day06_Shorthand_LogicOperators;

public class WarmUp {
    public static void main(String[] args) {
    double numberOfGalons = 1;
    double galonsToLiters = numberOfGalons * 3.785;
    String result = numberOfGalons + " Gallon is equal to: " +galonsToLiters +" Liters";
        System.out.println(result);
        System.out.println("======================================================================");

    double numberOfLiters = 100;
    double  litersTogallons = numberOfLiters / 3.785;
    String result2 = numberOfLiters+" Liters equal to "+litersTogallons+ " galons";
        System.out.println(result2);
        System.out.println("======================================================================");

    int a = 200; // now 199
    int b= -a++ + - --a * a-- % 2;
    // -200 + -200 * 200 % 2
        // b = -200 + -40000 % 2
        // b = -200 + 0
        // b = -200
        System.out.println(b);
        System.out.println(a);
    }
}

/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */