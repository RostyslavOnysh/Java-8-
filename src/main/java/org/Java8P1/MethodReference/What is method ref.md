# Method reference in Java
is a shorthand syntax for referring to a method without invoking it. It allows you to treat a method as a first-class entity and pass it as an argument, assign it to a variable, or use it in functional interfaces.

## The syntax for method reference is as follows:

* ***Class::methodName***

OR

* ***object::methodName***
#### There are four types of method references in Java:

1. Reference to a static method:***ClassName::staticMethodName***
2. Reference to an instance method of a particular object: ***objectName::instanceMethodName***
3. Reference to an instance method of an arbitrary object of a particular type: ***ClassName::instanceMethodName***
4. Reference to a constructor: ***ClassName::new***

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Dave"};

        // Reference to a static method
        Arrays.sort(names, Main::compareByLength);
        System.out.println(Arrays.toString(names));

        // Reference to an instance method of a particular object
        StringConcatenator concatenator = new StringConcatenator();
        Arrays.sort(names, concatenator::concatenate);
        System.out.println(Arrays.toString(names));
    }

    public static int compareByLength(String a, String b) {
        return a.length() - b.length();
    }
}

class StringConcatenator {
    public int concatenate(String a, String b) {
        return (a + b).length();
    }
}
```

In this example, we have a ***Main*** class with a static method ***compareByLength()*** that compares two strings based on their lengths.
We also have a ***StringConcatenator*** class with an instance method ***concatenate()*** that concatenates two strings and returns the length of the concatenated string.

In the ***main()*** method, we use method reference to pass the ***compareByLength()*** method as an argument to ***Arrays.sort()***. This allows us to sort the names array based on the lengths of the strings.

We also use method reference to pass the ***concatenate()*** method of the ***StringConcatenator object*** as an argument to *Arrays.sort()*. This allows us to sort the names array based on the lengths of the concatenated strings.

Method references provide a concise and readable way to refer to methods. They promote code reusability and can simplify code when working with functional interfaces. By using method references, you avoid the need to write boilerplate code for lambda expressions that simply delegate to a method. Additionally, method references can improve code maintainability by encapsulating the logic of the method in a separate class or function.

Each method reference is unique because it refers to a specific method or constructor. The uniqueness allows the compiler to determine the appropriate method based on the context in which the method reference is used, making method references type-safe and reliable.