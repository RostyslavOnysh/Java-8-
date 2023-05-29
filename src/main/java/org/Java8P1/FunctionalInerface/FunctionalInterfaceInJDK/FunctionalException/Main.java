package org.Java8P1.FunctionalInerface.FunctionalInterfaceInJDK.FunctionalException;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                if (s == null) {
                    throw new RuntimeException();
                }
                return s.toUpperCase();
            }
        };
    }
}
