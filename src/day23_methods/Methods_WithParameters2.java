package day23_methods;

public class Methods_WithParameters2 {
    // 3. create a function that can reverse any string
    // Murtaza ==> azatruM  Messi==> isseM
    public static void main(String[] args) {
        String names = "Murtaza";
        ReverseString(names);

        System.out.println();

        String name2 = "Messi";
        ReverseString(name2);
    }


    public static void ReverseString(String str){

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

// create a function that can print the maximum number from any given array
// create a function that can print the ,minimum number from any given array
// create a function that can print an array in descending order

    }
}
