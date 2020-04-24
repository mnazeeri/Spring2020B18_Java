package day05_UnaryshothandOperators;

public class PostPre {
    public static void main(String[] args) {
        //pre: changes the value of the varibles immediately

        int a = 100;
        System.out.println( ++a); //a = 101
        System.out.println(a); // 101

        int b = 100;
        System.out.println(--b); // b will be 99
        System.out.println(b); // 99

        // Post: first passes the current value, then eventually changes the variable's value
        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--); //100
        System.out.println(B); //99

        //Post & Pre examples:

      int z = 10;
      int x = ++z; // at line 28, x is increased by 1
        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++; // 10, after line 34 the value of s will be increased by 1
        System.out.println(f); //10
        System.out.println(s); //11

        double t1 = 3.5;
        double t2 = t1--; //3.5, after ine 37 t1 will be decreased by 1
        System.out.println(t2); // 3.5
        System.out.println(t1); // 2.5

        int num = 35;
        System.out.println(num++);
        System.out.println(num);




    }
}
