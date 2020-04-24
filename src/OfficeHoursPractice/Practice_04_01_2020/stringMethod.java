package OfficeHoursPractice.Practice_04_01_2020;

public class stringMethod {
    public static void main(String[] args) {

        //chrAt(indexNumber): returns the char at then given index. char primitive

        String str1= "Java";
        //            0123

       char ch1= str1.charAt(3);
        System.out.println(ch1);

        // char ch2 = str1.charAt(4); out of range
        // System.out.println(ch2);

        //length(): returns the total number of chars in "int".
        String str2 = "Cybertek School";
        int total = str2.length();
        System.out.println(total);

        int maxIndex = str2.length()-1;
        char ch3= str2.charAt(maxIndex);
        System.out.println(ch3);
        System.out.println("=======================================");

        //concat(str); it does the concatenation

        String str3= "Cybertek";
               str3 = str3.concat(" School"); //"Cybertek School"
        System.out.println(str3);

        String str4 = "Java";
       str4= str4.concat(" is fun"); // return new string as "Java is fun"

        System.out.println(str4);

        System.out.println("=======================================");

        //toLowerCase() & toUperCase(); converting strings to lower and uper cases.

        String str5 = "CYBERTEK SCHOOL";
        str5 = str5.toLowerCase(); //"cybertek school"
        System.out.println(str5);

        String str6 = "murtaza nazeeri";
        str6= str6.toUpperCase(); // reassigned to "MURTAZA NAZEERI"
        System.out.println(str6); //

        System.out.println("=======================================");

        //trim(): removes the unused(white) spaces from the string.

        String str7 = "      Messi        ";
            str7 = str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());

        String str8= "    ";
        str8 = str8.trim();

        System.out.println(str8.length());

        System.out.println("=========================================");

        //1) substring(beginning index, ending index): creates substring starting from beginnging to ending index.
        //the ending index is excluded.
        String sentence1= "I like Java";
        //                 0123456789..

        String word1 = sentence1.substring(7,sentence1.length()); //"Java"
        String word2 = sentence1.substring(2,6);
        System.out.println(word1);
        System.out.println(word2);

        String word3= sentence1.substring(2,6) + sentence1.substring(7,sentence1.length());
        System.out.println(word3);




        // 2) substring(begiining index): creates the sub string from beginning index till the end of the string. returns new string
        String sentence2 = "I like to learn Java";
        //                  0123456789

        String r1 =  sentence2.substring(10);  // "learn Java";
        System.out.println(r1);

        String r2 = "Java"; //JaVa;
        //       0123
        String r3 = r2.substring(0, 2);   //Ja

        String r4 = r2.substring(2,3) ;  // v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa

        System.out.println(result);


        System.out.println("=============================================");


    }
}
