package org.Java8P1.FunctionalInerface.FunctionalInterfaceInJDK;

import org.Java8P1.FunctionalInerface.FunctionalInterfaceInJDK.Function.StudentsGradeFunction;

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
    }
}
