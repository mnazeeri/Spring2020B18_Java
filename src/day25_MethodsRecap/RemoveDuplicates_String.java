package day25_MethodsRecap;

/*
1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"
 */

public class RemoveDuplicates_String {
    public static void main(String[] args) {

        String str = "ABAB";
        String result = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( !result.contains(""+ch) ){
                result +=ch;
            }

        }
        System.out.println(result);

        String str2 = "qbcqbcqbc";
        String result2 = RemoveDuplicates(str2);
        System.out.println(result2);
    }
    public static String RemoveDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( !result.contains(""+ch) ){
                result +=ch;
            }

        }
        return result;

    }
}
