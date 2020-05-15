package day40_Encapsulation;

public class Quiz_Question_12 {

    public  static String name = "Osman";

    public Quiz_Question_12(){

        name = "Hilal";
    }

    {
        name = "Marionela";
    }

    static {
        name = "Madina";
    }

    public static void main(String[] args) {

       // System.out.println(name); //Expected result "Madina"

        Quiz_Question_12 obj = new Quiz_Question_12();

       // name = "Madina";

        // name = "amarionela";

        // name = "Hilal"; expected result if the object is created

        System.out.println(name);
    }
}
