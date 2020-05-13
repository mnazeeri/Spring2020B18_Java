package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        // Item item1 = new Item();
        // Item item1 = new Item(2.5);

        Item item1 = new Item("Toilet Paper", 1.5, 100);
        Item item2 = new Item("Banana", 0.5, 8);
        Item item3 = new Item("Apple", 0.8, 10);
        Item item4 = new Item("Orange", 0.6, 12);
        Item item5 = new Item("Egg", 0.1, 30);

        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4, item5));

        double totalCost = 0;

        //Solution 1:
/*
        for ( Item  each : shoppingList){ //each: item1, item2, item3, item4, item5
            totalCost += each.calcCost();
        }

 */

        //Solution 2:

        for (int i = 0; i<shoppingList.size(); i++){
           totalCost += shoppingList.get(i).calcCost();
        }

        System.out.println("Total: $"+totalCost);
    }
}
