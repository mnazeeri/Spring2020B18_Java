package day07_IfStatements;
/*
write a java program that accepts three numbers
and return the maximum number
(assume that none of them are equal)
 */
public class MaxNumber {

    public static void main(String[] args) {

double a = 100;
double b = 200;
double c = 300;

boolean aGreater = a > b && a > c;
boolean bGreater = b > a && b > c;
boolean cgreater = c > a && c > b;

if (aGreater){
    System.out.println(a + "is the greatest number");
}
if (bGreater) {
    System.out.println(b + "is the greatest number");
}
if (cgreater) {
    System.out.println(c+ "is the greatest number");
}
    }
}
