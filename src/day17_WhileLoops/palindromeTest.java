package day17_WhileLoops;

public class palindromeTest {
    public static void main(String[] args) {

        String str = "Level";
        String reversedStr = ""; //store the reversed version of str

        int index = str.length()-1; //returns the last index number

        while (index >= 0){
            reversedStr += str.charAt(index);
            index--;
        }

        boolean palindrome = reversedStr.equalsIgnoreCase(str);
        System.out.println(palindrome);










    }
}
