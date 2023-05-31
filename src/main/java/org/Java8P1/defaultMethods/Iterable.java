package org.Java8P1.defaultMethods;

public interface Iterable<T> {
    default void printAll () {
        for (T t : getAll()){
            System.out.println(t);
        }
    }
    T[] getAll();
}
