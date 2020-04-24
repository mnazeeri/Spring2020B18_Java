package day15_ForLoop;

public class QUIZ {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2: " +s1==s2);

        System.out.println("s1 == s2: " +(s1==s2)); //true

        String ta = "A";
        ta = ta.concat("B"); // ta="AB"
        String tb= "C";
        ta = ta+tb; //ta = "AC" +C = "ABS"
        ta.replace('C','D'); //"ACD"
        ta = ta+tb; //ABC+C = "ABCC"
        System.out.println(ta); //ABC+C


    }
}
