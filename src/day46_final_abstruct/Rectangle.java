package day46_final_abstruct;

public class Rectangle extends shape {

    public double with;
    public double length;

    public Rectangle(double length, double with){
        this.with = with;
        this.length = length;
    }
    public void Area(){
        double area = with * length;
        System.out.println("Area of Rectangle is: "+area+"CM");
    }

}
