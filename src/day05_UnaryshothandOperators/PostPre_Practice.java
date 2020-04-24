package day05_UnaryshothandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {
        int a = 50;
        a = --a + a++ + a-- + a++;
        // 49 + 49 + 50 + 49
        System.out.println(a);

        int b =1;
        b = -b-- + b++ / -b-- * --b;
        


    }
}
