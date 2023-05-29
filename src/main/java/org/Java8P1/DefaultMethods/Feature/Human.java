package org.Java8P1.DefaultMethods.Feature;

public class Human implements Eatable, Walkable{
    @Override
    public void acceptFoor(String food) {
        System.out.println("Foood" + food);
    }

    @Override
    public void printInfo() {
        System.out.println("custom");
    }

    @Override
    public void walk() {

    }
}
