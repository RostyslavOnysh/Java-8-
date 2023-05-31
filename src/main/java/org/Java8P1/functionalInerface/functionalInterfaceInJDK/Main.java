package org.Java8P1.functionalInerface.functionalInterfaceInJDK;

import org.Java8P1.functionalInerface.functionalInterfaceInJDK.Function.StudentsGradeFunction;
import org.Java8P1.functionalInerface.functionalInterfaceInJDK.Supplier.Supplier;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Functional interface JDK example

        /*
        - Function
        - Predicate
        - Consumer
        - Supplier
         */

        StudentsGradeFunction studentsGradeFunction = new StudentsGradeFunction();
        String result = studentsGradeFunction.apply(98);
        System.out.println(result);

        Supplier<Integer> randomGenerator = () -> new Random().nextInt();
        System.out.println(randomGenerator.get());
    }
}
