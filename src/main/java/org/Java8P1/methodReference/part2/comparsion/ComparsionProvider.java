package org.Java8P1.methodReference.part2.comparsion;

import org.Java8P1.functionalInerface.User;

public class ComparsionProvider {
    public int compareByName (User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
