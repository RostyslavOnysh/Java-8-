package org.Java8P1.defaultMethods;

public class ArrayList<T> implements Iterable<T> {
    private T[] values;

    public ArrayList(T[] values) {
        this.values = values;
    }



    @Override
    public T[] getAll() {
        return values;
    }
}
