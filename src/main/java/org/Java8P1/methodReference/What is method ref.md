# Method reference in Java

is a shorthand syntax for referring to a method without invoking it. It allows you to treat a method as a first-class
entity and pass it as an argument, assign it to a variable, or use it in functional interfaces.

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

In this example, we have a ***Main*** class with a static method ***compareByLength()*** that compares two strings based
on their lengths.
We also have a ***StringConcatenator*** class with an instance method ***concatenate()*** that concatenates two strings
and returns the length of the concatenated string.

In the ***main()*** method, we use method reference to pass the ***compareByLength()*** method as an argument to
***Arrays.sort()***. This allows us to sort the names array based on the lengths of the strings.

We also use method reference to pass the ***concatenate()*** method of the ***StringConcatenator object*** as an
argument to *Arrays.sort()*. This allows us to sort the names array based on the lengths of the concatenated strings.

Method references provide a concise and readable way to refer to methods. They promote code reusability and can simplify
code when working with functional interfaces. By using method references, you avoid the need to write boilerplate code
for lambda expressions that simply delegate to a method. Additionally, method references can improve code
maintainability by encapsulating the logic of the method in a separate class or function.

Each method reference is unique because it refers to a specific method or constructor. The uniqueness allows the
compiler to determine the appropriate method based on the context in which the method reference is used, making method
references type-safe and reliable.

# Method references in Java can be categorized into four types based on the reference type and the method being referenced:

* Reference to a static method:
  In this type, a method reference refers to a static method of a class.
  The syntax is ***ClassName::staticMethodName***. For example:

```java
Function<Integer, Double> squareRoot=Math::sqrt;
```

* Reference to an instance method of a particular object: 
Here, a method reference refers to an instance method of a
specific object. The *syntax* is ***objectName::instanceMethodName***. For example:

```java
List<String> names=Arrays.asList("Alice","Bob","Charlie");
        names.forEach(System.out::println);
```

* Reference to an instance method of an arbitrary object of a particular type:
This type of method reference refers to an instance method of an object whose type 
is determined at runtime. The syntax is ***ClassName::instanceMethodName***. For
example:

```java
Comparator<String> stringComparator=String::compareToIgnoreCase;
```

* Reference to a constructor: In this case, a method reference refers to a constructor of a class.
The syntax is
***ClassName::new***. For example:

```java
Supplier<List<String>>listSupplier=ArrayList::new;
```

These different types of method references allow for flexible and concise coding when working with functional
interfaces, lambda expressions, and streams. They provide a way to refer to methods directly, promoting code reusability
and readability.

It's worth noting that method references are a powerful feature introduced in Java 8 that enable more expressive and
functional programming style. They provide a compact and intuitive way to refer to methods without explicitly writing
lambda expressions.


### Static Method:
A static method is a method that belongs to the class itself rather than an instance of the class. It can be accessed directly using the class name without creating an object of the class. Static methods are commonly used for utility functions or operations that don't require access to instance variables.

```java
public class MathUtils {
  public static int add(int a, int b) {
    return a + b;
  }
}

  int result = MathUtils.add(5, 3);
System.out.println(result);  // Output: 8
```
### Instance Methods of a Particular Object:
Instance methods are methods that are bound to an instance of a class. They have access to the instance variables and can perform operations specific to that instance.
```java
public class Car {
  private String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  public void drive() {
    System.out.println("Driving the " + brand + " car.");
  }
}

  Car myCar = new Car("Toyota");
myCar.drive();  // Output: Driving the Toyota car.
```
### instance Methods of an Arbitrary Object of a Particular Type:
These methods are similar to instance methods of a particular object, but they can operate on any object of the same class. They are typically used for class-level operations that don't require access to specific instance variables.
```java
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static Circle create(double diameter) {
        double radius = diameter / 2;
        return new Circle(radius);
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

Circle circle1 = Circle.create(10);  // Creating a circle with radius 5
double area1 = circle1.area();
System.out.println(area1);  // Output: 78.5

Circle circle2 = Circle.create(8);  // Creating a circle with radius 4
double area2 = circle2.area();
System.out.println(area2);  // Output: 50.24
```



### Constructor:
A constructor is a special method used to initialize an object when it is created. It is typically called automatically when creating a new instance of a class. In Python, the constructor method is named __init__.
```java 
public class Person {
private String name;
private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Person person = new Person("John", 30);
System.out.println(person.name);  // Output: John
System.out.println(person.age);   // Output: 30
```
These different kinds of methods allow you to perform various operations on objects and classes, catering to different requirements in your code.