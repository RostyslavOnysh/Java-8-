package org.Java8P3.optional.howToUse;

import java.util.Optional;

public class DataBase {
    public Optional<User> getById(Long id) {
        if (id == 10) {
            return Optional.of(new User("Bob"));
        }
        return Optional.empty();
    }
}
