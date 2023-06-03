package org.Java8P3.optional.howToUse;

import org.Java8P3.optional.User;

import java.util.function.Consumer;

public class Wrapper<T> {
    T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public static Wrapper<User> empty() {
        return new Wrapper<>(null);
    }

    public T getValue() {
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public void ifPresent(Consumer<T> consumer) {
        if (value != null) {
            consumer.accept(value);
        }
    }
}

