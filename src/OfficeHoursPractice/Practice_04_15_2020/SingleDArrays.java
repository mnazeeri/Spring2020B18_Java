package OfficeHoursPractice.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArrays {
    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100, 200, 300};
        //             0    1    2
        //System.out.println(arr[1]);

        for(int i = 0; i < 3; i++) {
            // System.out.println(i);
            int num = arr[i];
            System.out.println(num);
        }
        System.out.println("=============================================");
        int j = 0;
        while (j<3){
            int num2 = arr[j];
            System.out.println(num2);
            j++;
        }
        System.out.println("=============================================");

        String [] name = {"John", "Aaron", "Luis", "Murtaza", "Messi"};
        //                  0        1        2        3         4
        int length =name.length;
        String [] nameRev = new String[length]; //{null, null, null}
        //                                          0      1     2
        //         i         k
        // nameRev[0] = name[2];
        // nameRev[1] = name[1];
        // nameRev[2] = name[0];

       /*
        int k = length-1;
        for(int i = 0; i < length; i++){
            nameRev [i] = name [k];
            nameRev[i] = name[k]
            k--;
        }
        System.out.println(Arrays.toString(nameRev));

        */
        int i = 0;
        int k = length-1;
        while ( i <length){
            nameRev [i] = name[k];

            i++;
            k--;

        }
        System.out.println(Arrays.toString(nameRev));

    }
}
