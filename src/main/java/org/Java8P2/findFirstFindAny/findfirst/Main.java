package org.Java8P2.findFirstFindAny.findfirst;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFirst('p'));
    }

    private static boolean getFirst (char letter) {
        List<String> cities = List.of("Kyiv","Kyoto", "London", "Paris", "Oslo");

      /*
        Optional<String> first = cities.stream()
                .filter(s -> s.charAt(0) == letter)
                .findAny();
                //.findFirst();
        return first.orElseThrow(() -> new RuntimeException("Can`t find the city !!"));
        Any match below
       */

        boolean exist = cities.stream().anyMatch(s -> s.charAt(0) == letter);
        return exist; // true or false
    }

}
