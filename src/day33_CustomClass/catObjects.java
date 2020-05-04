package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes", "White", 2, "Sasha");

       // System.out.println(cat1); //Sasha, breed is Siemesn, color is

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottis", "Black", 10, "Bobo");

        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico", "Brown-White", 5, "Cinnamon");

        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3));

        for (int i = 0; i<catList.size(); i++){
            System.out.println(catList.get(i));
        }
        System.out.println("=====================================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("=====================================================");

        cat1.eat("cat treats");
        cat2.eat("Fish");
        cat1.eat("Shish Kebob");

        System.out.println("=====================================================");

        cat1.drink("Water");
        cat2.drink("Milk");
        cat3.drink("Coffee");
    }
}
