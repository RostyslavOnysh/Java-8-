package org.Java8P1.MethodReference.Part2.comparsion;

import org.Java8P1.FunctionalInerface.User;

import java.util.Arrays;

public class ComparsionMain {
    public static void main(String[] args) {
        User[] people = new User[3];
        people[0] = new User("Bob",23);
        people[1] = new User("John",12);
        people[2] = new User("Alice",32);

        ComparsionProvider comparsionProvider = new ComparsionProvider();
        Arrays.sort(people,comparsionProvider::compareByName);
        System.out.println(Arrays.toString(people));

    }
}
