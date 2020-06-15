package day46_final_abstruct;

public class Circle extends shape {

    public double radius;
    public final static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void Area (){

        double area = radius * radius * PI;
        System.out.println ("Area is: CM"+area);
    }



}
