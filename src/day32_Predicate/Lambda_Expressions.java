package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
        list. addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list );

        System.out.println("===============================================");

        Predicate<Integer> lessThan5 = Y -> Y <5;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2. addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("===============================================");

        Predicate<String> startWithM = H -> !H.startsWith("M"); // remove those that don't have "M"
        //Predicate<String> startWithM = H -> H.startsWith("M"); // remove those that do have "M"

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Mohammed", "Boris", "Sha", "Bilal"));

        System.out.println(names); //current names
        names.removeIf(startWithM);
        System.out.println(names); // desired names

        System.out.println("===============================================");

        //remove names that start with M or A

        Predicate<String> StartsWithMorA = T -> T.contains("M") || T.contains("A");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar", "Alex", "Asiya", "Dilnaz", "Radu"));

        nameList.removeIf(StartsWithMorA);
        System.out.println(nameList);

        System.out.println("===============================================");

        Predicate<Character> digits = each -> each >= 48 && each <= 57;
        ArrayList<Character>  chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','B','3','4','5','@','$','Z'));

        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("===============================================");

        Predicate<Integer> greaterThan5 = p-> p >5;
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       // nums.removeIf(p-> p >5);
        nums.removeIf(greaterThan5);
        System.out.println(nums);

    }
}
