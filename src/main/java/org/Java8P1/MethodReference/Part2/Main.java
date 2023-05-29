package org.Java8P1.MethodReference.Part2;

import org.Java8P1.InnerClasses.User;
import org.Java8P1.MethodReference.UserService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // JAVA 8 : method reference
        /*
        There are four kinds of methods regference :
         1. Static method
         2.Instance methods of particular object
         3. Instance methods of an arbitrary object of a particular type
         4.Constructor
         */

        NumberService<Integer>integerNumberService = Integer::parseInt;
        Integer fromString = integerNumberService.getFromString("123");
        System.out.println(fromString);


        String[] names = {"Barbara","John","Robert","Bob","Linda"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
