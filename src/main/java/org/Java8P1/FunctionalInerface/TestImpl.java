package org.Java8P1.FunctionalInerface;

public class TestImpl implements Test{
    @Override
    public void print(String value) {
        System.out.println("Hello wrld");
    }

    @Override
    public void say(String value) {
        System.out.println("say hello wrld");
    }
}
