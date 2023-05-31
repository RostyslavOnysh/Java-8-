package org.Java8P2.howToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Alice", "John");
        // 1. using .strem() method from Collection
        names.stream().forEach(System.out::println);
        // 2. Stream.of()
        Stream.of("Bob", "Alice", "John").forEach(System.out::println);
        String[] cities = new String[]{"Kiev", "London", "Paris"};
        Arrays.stream(cities).forEach(System.out::println);


        String value = "Hello";
        IntStream chars = value.chars();

       Stream.generate(new Random():: nextInt).limit(5).forEach(System.out::println);

        Stream.iterate(0, i -> i + 2 ).limit(5).forEach(System.out::println);

        IntStream.range(4,10).forEach(System.out::println);
    }
}

