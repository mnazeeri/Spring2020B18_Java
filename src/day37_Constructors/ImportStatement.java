package day37_Constructors;

// import java.util.Arrays; only imports Arrays class from java util

import java.util.*; // imports all the classes that are in "java.util" class.

//import static day37_Constructors.Data.staticvariable;

//import static day37_Constructors.Data.staticMethod;

import static day37_Constructors.Data.*;

public class ImportStatement {

    public static void main(String[] args) {

        int [] arr = {4,3,2,1};
        Arrays.sort(arr);

        System.out.println(staticvariable);

        staticMethod();
    }

}