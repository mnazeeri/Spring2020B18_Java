package day50_Polymorphism;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        int a  = 100;
        double b = a; //implicitly done

        Dog dog = new Dog("a", 1, "f");
        Animal animal1 = dog;   //upcasting, done implicitly

        Cat cat = new Cat("r", "femail", 4);
        //Dog dog2 = (Dog) cat;

        Animal animla2 = cat; // upcasting, done implicitly/automatically

        System.out.println("===============================================");

        double c = 10;
        int d = (int) c; // explicitly done

        Animal animal3 = new Dog("A", 12, "F");

        Dog dog3 = (Dog) animal3; // down-casting, which needs to be done manually.

        Animal animal4 = new Cat ("C", "F", 7);

        Cat cat2 = (Cat) animal4;

        System.out.println("===============================================");

        Animal animal5 = new Dog("lucy", 8,"Female");
        //animal5.bark();

       Dog dog2 = (Dog)animal5;
       dog2.bark();

       //Second way to down-cast:
        ((Dog)animal5).bark();


    }

}
