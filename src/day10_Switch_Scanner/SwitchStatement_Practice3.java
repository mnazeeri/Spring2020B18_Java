package day10_Switch_Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        char ch ='A';
        String result = "";

        switch (ch){
            case 'A':
                //System.out.println("A");
                result += "A";
                //break;
            case 'B':
               // System.out.println("B");
                result += "B";
                //break;
            case 'C':
               // System.out.println("C");
                result += "C";
                //break;
            case 'D':
               // System.out.println("D");
                result += "D";
               // break;
            case 'E':
               // System.out.println("E");
                result += "E";
                //break;
            default:
               // System.out.println("Invalid");
                result += "INVALID";
               // break; // not necessary

        }
        System.out.println(result);
    }
}
