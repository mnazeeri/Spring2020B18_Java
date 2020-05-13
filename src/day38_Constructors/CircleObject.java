package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextDouble();

        //double r = 5.5;

        Circle circle1 = new Circle(r);

        double areOfCicrle = circle1.area();
        System.out.println("Diameter is: "+ circle1.diameter);
        System.out.println("Perimeter is: "+circle1.perimeter());

        System.out.println("Area is: "+ df.format(areOfCicrle));
    }
}
