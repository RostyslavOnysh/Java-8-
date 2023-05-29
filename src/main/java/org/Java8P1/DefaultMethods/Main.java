package org.Java8P1.DefaultMethods;

public class Main {
    public static void main(String[] args) {
        String[] name = new String[]{"Bob", "Alice", "John"};
        Iterable<String> strings = new ArrayList<>(name);
        strings.printAll();
    }
}
