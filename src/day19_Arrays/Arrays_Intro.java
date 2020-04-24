package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        // int scores = 90, 10, 20; Regular variables can only hav eon data
        /*
        Declariation:

       DataType [] variableName = {dat1, dat2, dat3};
                    // 70, 75, 85, 90, 95, 100
         */

        int [] scores = {70, 75, 85, 90, 95, 100};

        //retrive: variableName[index]

        int num1 = scores[2]; //int
        System.out.println(num1);

        int num2 = scores [5]; // 100, int
        System.out.println( num2);

    }
}
