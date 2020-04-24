package day05_UnaryshothandOperators;

public class VariablesPractice {
    public static void main(String[] args) {
        // whole number: byte, short, int, and long
        // decimal numb: float & double

        int a1 = 100;
        float f1 = (long) a1;
        // f1 = 100L;
        //f1 = 100.0;
        System.out.println(f1);

        long l1 = (short) f1;
        //l1= 100;
        System.out.println(l1);

        String name;
        //System.out.println(name); //not compiling : In java: first come first serve

        String Name= "Cybertek";
        System.out.println(Name);



    }


}
