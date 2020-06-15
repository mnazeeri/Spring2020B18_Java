package day44_Exeptions;

public class Practice3 {

    public static void main(String[] args) {

        System.out.println("Hello:)");
        waits(5);
        System.out.println("Hello to you as well:))");


    }

    public static void waits(double seconds) {
        try {
            Thread.sleep((long) seconds * 1000);
        }catch (Exception e){ }


    }
}
