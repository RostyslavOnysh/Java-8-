package org.Java8P1.Lambda.FirstExampleLambda;

public class TestMain {
    public static void main(String[] args) {
        Test test = new TestImpl(){
            @Override
            public void print(String value) {
                System.out.println("heLLo!");
            }
        };


        Test test2 =  (value) -> System.out.println(value);
          test2.print("Hello!");
        }
    }