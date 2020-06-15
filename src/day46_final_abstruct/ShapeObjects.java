package day46_final_abstruct;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle obj1 = new Circle(3.5);
        obj1.Area();

        Square obj2 = new Square(4);
        obj2.Area();

        Triangle obj3 = new Triangle(6, 3);
        obj3.Area();

        Rectangle obj4 = new Rectangle(10, 5);
        obj4.Area();
    }


}
