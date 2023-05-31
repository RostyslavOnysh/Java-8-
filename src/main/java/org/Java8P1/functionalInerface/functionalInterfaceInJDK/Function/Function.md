In Java, a 
## functional interface is an interface that contains only one abstract method. Functional interfaces are used to enable functional programming in Java, allowing methods to be treated as first-class objects. The Java Development Kit (JDK) provides several built-in functional interfaces that are commonly used:

***Function:***
The Function functional interface represents a function that takes an input and produces a result. It has a method called apply that accepts an argument of a specific type and returns a result of another type.
```java
import java.util.function.Function;

public class FunctionExample {
public static void main(String[] args) {
Function<Integer, String> convertToString = (num) -> "The number is: " + num;
String result = convertToString.apply(10);
System.out.println(result);  // Output: The number is: 10
}
}
```
***Predicate:***
The Predicate functional interface represents a boolean-valued function that takes an input and returns a boolean result. It has a method called test that accepts an argument and evaluates a condition.
```java
import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {
Predicate<Integer> isEven = (num) -> num % 2 == 0;
boolean result = isEven.test(6);
System.out.println(result);  // Output: true
}
}
```
***Consumer:***
The Consumer functional interface represents an operation that takes an input but does not return any result. It has a method called accept that accepts an argument and performs some operation on it.
```java
import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
Consumer<String> printMessage = (message) -> System.out.println("Message: " + message);
printMessage.accept("Hello, World!");  // Output: Message: Hello, World!
}
}
```
***Supplier:***
The Supplier functional interface represents a supplier of results, providing a value without taking any input. It has a method called get that returns a result.
```java
import java.util.function.Supplier;

public class SupplierExample {
public static void main(String[] args) {
Supplier<Double> getRandomNumber = () -> Math.random();
double number = getRandomNumber.get();
System.out.println(number);  // Output: a random number between 0 and 1
}
}
```
These functional interfaces provided by the JDK allow you to work with functional programming concepts in Java by treating methods as objects. They provide a way to write more concise and expressive code for common programming patterns.