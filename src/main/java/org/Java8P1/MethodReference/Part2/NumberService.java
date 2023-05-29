package org.Java8P1.MethodReference.Part2;

public interface NumberService <T extends  Number>{
    T getFromString (String value);
}
