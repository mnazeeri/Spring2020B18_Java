package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str = "MeSSi is a soccer player, MeSSi is the GOAT!".toLowerCase(); //ABCD

        int count = 0; //2 ==> +1 +1

        String word = "s".toLowerCase();

        while (str.contains("s")){
            count++;
            str = str.replaceFirst(word, " ");



        }
        System.out.println(count);









    }
}
