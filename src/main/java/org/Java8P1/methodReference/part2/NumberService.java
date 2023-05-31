package org.Java8P1.methodReference.part2;

public interface NumberService <T extends  Number>{
    T getFromString (String value);
}
