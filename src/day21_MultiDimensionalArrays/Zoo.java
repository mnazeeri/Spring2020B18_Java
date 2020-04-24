package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String [] wildAnimals = {"Tiger", "Lion", "Cheetah", "Wolf", "Shark"};
        String [] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        //                    0       1          2          3
        String [] [] zoo = {wildAnimals, birds};
                      //        0          1
        String kfc = zoo [1] [3]; //Chicken

        System.out.println(kfc);
        System.out.println("===================================");

        for(  String eachBirds  : zoo [1]    ){  // it will be executed 4 times only
            if (eachBirds.equals("Chicken")) {
                continue;
            }
            System.out.println(eachBirds);
        }
        System.out.println("===================================");
        for ( String each  : zoo [0] ){
            if (each.equals("Shark")) {
                continue;
            }
            System.out.println(each);
        }


    }
}
