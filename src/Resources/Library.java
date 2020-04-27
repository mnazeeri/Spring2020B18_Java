package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        /*
                      i        j
               RevArr[0] = arr[3]
               RevArr[1] = arr[2]
               RevArr[2] = arr[1];
               RevArr[3] = arr[0];
         */

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    // Remove duplicates from String
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

    // Frequency of string

    public static int Frequency(String str1, String str2){
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }

    public static String FrequencyOfChars(String str){
        String NonDup =  Library.RemoveDuplicates(str)  ;             //ABC
        String result = ""; //coantisn the frequency of chars

        for(int i =0; i < NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);//  "A"
            int num =  Library.Frequency(str, ch);
            result += ch+num;
        }

        return result;
    }
    //Merge two arrays and return third one
    // Max & Min numbers from arrays

    public static int max(ArrayList<Integer> list){
        int maximum = list.get(0);
        for (int i = 0; i<list.size();i++){ // i: 0,1,2,3,4
            if (list.get(i)>maximum){
                maximum = list.get(i);
            }
        }
        return maximum;
    }

}