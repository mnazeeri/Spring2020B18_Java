package day37_Constructors;

public class ConstructorIntro{

   // public method () { }

    public ConstructorIntro(int a ){ // Constructor with argument

        System.out.println("Constructor with argument of int");

    }



    public static void main(String[] args) {

      //  ConstructorIntro obj = new ConstructorIntro(); object MUST be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10);

        ConstructorIntro obj3 = new ConstructorIntro(10);
    }
}

