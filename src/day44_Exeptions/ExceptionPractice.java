package day44_Exeptions;

public class ExceptionPractice {

    public static void main(String[] args) {

        try {
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println(9/0);
            System.out.println("Salam");
            System.out.println("Merhaba");

        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
