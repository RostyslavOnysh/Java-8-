package org.Java8P3.optional.howToCreateOptional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        Java 8 : How to create Optional ?
         of
         empty
         ofNullable
         */

        Optional<String> optional = Optional.of("abc");


        Optional<String> empty = Optional.empty();
        /*
          public static<T> Optional<T> empty() {
        @SuppressWarnings("unchecked")
        Optional<T> t = (Optional<T>) EMPTY;
        return t;                                         ///return empty optional.
    }
         */

        Optional<Object> o = Optional.ofNullable(null);


    }
}
