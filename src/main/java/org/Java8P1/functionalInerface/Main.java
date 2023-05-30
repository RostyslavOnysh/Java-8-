package org.Java8P1.functionalInerface;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getAge() - user2.getAge();
            }
        };

        Comparator<User> userComparator1 = (user1,user2) -> user1.getAge() - user2.getAge();

        Set<User> userSet = new TreeSet<>(userComparator1);
        userSet.add(new User("Bob",22));
        userSet.add(new User("John",37));
        userSet.add(new User("Alice",13));
        userSet.add(new User("Bob",43));
        userSet.add(new User("Bob",19));
        System.out.println(userSet);
    }
}
