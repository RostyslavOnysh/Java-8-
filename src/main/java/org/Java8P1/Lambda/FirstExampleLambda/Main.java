package org.Java8P1.Lambda.FirstExampleLambda;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    // lambda example
    public static void main(String[] args) {
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getAge() - user2.getAge();
            }
        };

        // (parameters) -> (sout(param));

        Set<User> users = new TreeSet<>(userComparator);
        users.add(new User("Bob", 23));
        users.add(new User("Alice", 28));
        users.add(new User("John", 33));
        users.add(new User("Bob", 19));
        users.add(new User("John", 31));
        System.out.println(users);
    }
}
