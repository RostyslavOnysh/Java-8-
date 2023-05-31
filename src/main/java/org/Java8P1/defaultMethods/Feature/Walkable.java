package org.Java8P1.defaultMethods.Feature;

public interface Walkable {
    void walk ();

    default void printInfo () {
        System.out.println("this is walkable message ...");
    }
}
