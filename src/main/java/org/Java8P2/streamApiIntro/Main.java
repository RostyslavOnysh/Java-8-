package org.Java8P2.streamApiIntro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Java 8 : Stream API
        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 23));
        users.add(new User("John", 23));
        users.add(new User("Bruce", 23));

        // use java functional interface "Preducate" with <User> parameters
        // and here is done implementation using Stream API
        users.stream()
                .filter(user -> user.getName().startsWith("A"))
                .forEach(user -> System.out.println(user.getName()));

    }
}
