package org.Java8P2.primitiveStream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Java 8 : Stream API of primitives

        // можемо параметризувати тіки певним типом,не можемо використовувати примітиви
        List<String> names = List.of("Alice","Bob","John");
        // викликаємо метод і отримуємо stream String
        Stream<String> namesString = names.stream();

        //Three interfaces afford us to work with primitives
        /*
        Stream int long double
         */;
        IntStream intStream = namesString.mapToInt(String::length);
        OptionalInt max = intStream.max(); // the biggest numb
        OptionalInt min = intStream.min(); // the lowest numb
        int sum = intStream.sum(); // sum of all numb
    }
}
