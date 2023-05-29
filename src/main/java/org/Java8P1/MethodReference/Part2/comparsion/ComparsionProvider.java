package org.Java8P1.MethodReference.Part2.comparsion;

import org.Java8P1.FunctionalInerface.User;

public class ComparsionProvider {
    public int compareByName (User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
