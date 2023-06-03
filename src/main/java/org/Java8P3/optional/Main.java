package org.Java8P3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User [] users = new User[] {new User("Bob")};
        Optional<User> userWrapper = getElementByIndex(users, 0);
        userWrapper.ifPresent(System.out::println);
    }

    public static Optional<User> getElementByIndex (User[] values, int index) {
        if (index >= values.length || index < 0) {
            return Optional.empty();
        }
        return Optional.of(values[index]);
    }
}
