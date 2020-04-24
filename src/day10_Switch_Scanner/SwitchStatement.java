package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        byte  a = 3;
        float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;
        boolean a4 = true;
        switch (a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Invalid case");
                break;
            case 4:
                System.out.println("Four");
        }

    }
}
