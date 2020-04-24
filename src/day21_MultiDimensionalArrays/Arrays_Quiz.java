package day21_MultiDimensionalArrays;


import java.util.Arrays;

public class Arrays_Quiz {
    public static void main(String[] args) {
        char[] array = {'D','C','A','B'};
        Arrays.sort(array);

        for(char each: array){
            System.out.print(each+" ");
            if(each=='D'){
                continue;
            }
        }

        System.out.println("===============================================");

        int[] num1 = new int[3];
        int [] num2 = {1,2,3,4,5};
        num1= num2;
        for(int i =0; i<num1.length; i++){
            System.out.print(num1[i]);
        }

        System.out.println("===============================================");

        int[]intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4]=90;
        System.out.println(Arrays.toString(intArr));

        System.out.println("===============================================");


        String[]planets= {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x+" "+y);

        System.out.println("===============================================");

        int arr[] ={1,2,3,4};
        int i = 0;
        do{
            System.out.print(arr[i]+" ");
            i++;
        }while (i<arr.length-1);

        System.out.println("===============================================");
        int wd = 0; // -1+1+2+2-1 = 3
        String[] days = {"sun", "mon","wed","sat"};


        for(int j=0; i < days.length; j++){

            switch(days[j]){
                case "sat":
                case "sun":
                    wd -= 1;
                    break;

                case "mon":
                    wd++;

                case "wed":
                    wd +=2;
            }

        }

        System.out.println(wd);

    }
}
