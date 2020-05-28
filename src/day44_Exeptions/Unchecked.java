package day44_Exeptions;

public class Unchecked {

    public static void main(String[] args) {

        System.out.println("Test Started");

       // System.out.println(9/0);

        String str = "Cybertek";

       // System.out.println(str.charAt(-1)); // unchecked - outofbondExecption

        int[] arr = {1,2,3};
        System.out.println(arr [200]); //ArrayIndexOutOfBoundsException

        System.out.println("Test completed");
    }
}
