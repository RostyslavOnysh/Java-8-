package org.Java8P3.optional.HW;

import java.util.NoSuchElementException;
import java.util.Optional;

public class GetOptionalValue {
    public Integer getOptionalValue(int randomNumber) {
        Optional<Integer> optional = generateRandomOptional(randomNumber);


        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NoSuchElementException();
        }
    }

    public Optional<Integer> generateRandomOptional(int randomNumber) {
        if (randomNumber % 2 == 0) {
            return Optional.empty();
        }
        return Optional.of(randomNumber);
    }
}

