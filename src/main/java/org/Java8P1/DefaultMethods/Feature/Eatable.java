package org.Java8P1.DefaultMethods.Feature;

public interface Eatable {
    void acceptFoor (String food);

    default void printInfo () {
        System.out.println("This is eatable message ...");
    }
}
