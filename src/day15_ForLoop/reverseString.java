package day15_ForLoop;

public class reverseString {
    public static void main(String[] args) {

        String str = "!TAOG eht si isseM";
        //01234
        String reverse1=""+str.charAt(4)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        //System.out.println(reverse1);

        int lastIndexnum = str.length()-1;

       String reverse2 = "";
        for (int i = lastIndexnum; i>= 0; i--){
           // System.out.print(str.charAt(i));

            reverse2 += str.charAt(i);
        }
        System.out.println(reverse2);




    }
}
