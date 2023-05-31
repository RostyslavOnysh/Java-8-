package org.Java8P1.methodReference;

import org.Java8P1.functionalInerface.User;


@FunctionalInterface
public interface UserService {
    String doAction(User user);
}
