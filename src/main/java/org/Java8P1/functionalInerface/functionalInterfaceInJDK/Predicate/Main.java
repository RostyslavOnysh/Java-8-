package org.Java8P1.functionalInerface.functionalInterfaceInJDK.Predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Bob", 27));
        users.add(new User("Alice", 25));
        users.add(new User("John",23));
        users.add(new User("Ros",21));
        users.add(new User("Bruce", 18));


        UserPredicate userPredicate = new UserPredicate();
        for (User user : users) {
            if (userPredicate.test(user)) {
                System.out.println(user.getName());
            }
        }

    }
}
