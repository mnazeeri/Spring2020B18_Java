package day16_ForLoop;

public class alphabet {
    public static void main(String[] args) {

        String uppercase = ""; //A-Z
        String lowercase =""; //a-z

        for (char ch = 'A'; ch <= 'Z'; ch++ ){
            uppercase +=ch;
        }
        System.out.println(uppercase);

        for (char ch = 'a' ; ch <= 'z'; ch++){
            lowercase +=ch;
        }

        System.out.println(lowercase);

        String result = "";
        for (int i=0; i<=uppercase.length()-1; i++){
            result += uppercase.charAt(i)+ "" + lowercase.charAt(i)+" ";
        }
        System.out.println(result);

        //Second approach:

        int a = 97;
        int A = 65;

        String result2= "";
        for (int i = 0 ; i < 26; i++){
            char ch = (char) (A+i); // UpperCase Characters
            //                 65
            char ch2 =(char) (a+i); // LowerCase Characters
            //                 97+0
            System.out.println(ch);

            result2 += ch +""+ch2+" ";
        }
        System.out.println(result2);
    }
}
