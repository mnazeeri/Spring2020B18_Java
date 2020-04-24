package day19_Arrays;

/*

write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
 */
public class Frequency {
    public static void main(String[] args) {
        String str = "AABCC";

        String result = ""; //A2B1C2

        String nonDuplicates = ""; //ABC

        for (int i = 0; i<=str.length()-1; i++){
            if (!nonDuplicates.contains( ""+str.charAt(i))){ // if the character at index i is not contain in nonDup, then it will be concated
                nonDuplicates +=str.charAt(i);
            }
        }
        // System.out.println(nonDuplicates);
        // nonDup = "ABC";      str="AABCC"; ==>result = "A2B1C2"

        for (int j = 0; j <=nonDuplicates.length()-1; j++){
            char ch = nonDuplicates.charAt(j);
            int count = 0; //count the total number rof occurrence of each character from str.
            for (int i =0; i <=str.length()-1; i++){
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            result +=""+ch+count;

        }





        System.out.println(result);
    }
}
