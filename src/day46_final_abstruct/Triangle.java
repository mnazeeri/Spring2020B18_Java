package day46_final_abstruct;

public class Triangle extends shape {

    double height;
    double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public void Area(){
        double area = base*height*1/2;
        System.out.println("Area of Triangle is: "+area+"CM");
    }
}
