package org.Java8P1.FunctionalInerface.FunctionalInterfaceInJDK.Predicate;

import java.util.function.Predicate;

public class UserPredicate implements Predicate<User> {
    @Override
    public boolean test(User user) {
        return user.getAge() >= 18
                && user.getName().startsWith("B");
    }
}
