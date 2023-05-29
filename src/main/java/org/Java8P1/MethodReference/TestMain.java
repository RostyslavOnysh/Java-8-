package org.Java8P1.MethodReference;

import org.Java8P1.FunctionalInerface.User;

public class TestMain {
    public static void main(String[] args) {
        Test test1 = new Test() {
            @Override
            public void print(String value) {
                System.out.println(value);
            }
        };

        Test test2 = System.out::println;
        test2.print("Hello");

        UserService userService = user -> user.getName();
        UserService userService1 = User::getName;
        UserService userService2 = user -> {
            if (user == null) {
                return null;
            }
            return user.getName();
        };

        User bob = new User("Bob", 23);
        System.out.println(userService1.doAction(bob));
    }
}
