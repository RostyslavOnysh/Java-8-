package org.Java8P2.BoxedAndMapToObj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> cities = List.of("Kyiv", "London", "Paris", "Oslo");
        // select all uniques char
        Set<Character> uniqueChar = cities.stream()
                .map(String::chars)
                .flatMap(IntStream::boxed)
                .mapToInt(i -> i)
                .mapToObj(i -> (char) i)
                .collect(Collectors.toSet());
        System.out.println(uniqueChar);
    }
}
