package org.Java8P1.MethodReference;

import org.Java8P1.FunctionalInerface.User;


@FunctionalInterface
public interface UserService {
    String doAction(User user);
}
