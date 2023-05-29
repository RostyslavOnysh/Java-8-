# Default methods in Java
## are methods that are defined within an interface and provide a default implementation. They were introduced in Java 8 to support the concept of backward compatibility in existing interfaces.

Before Java 8, when new methods were added to an interface, all implementing classes had to provide an implementation for those methods, even if they were not relevant to the implementing class. This posed a problem when you wanted to add new functionality to an existing interface without breaking the implementation of all the classes that implemented it.

Default methods address this issue by allowing interfaces to provide a default implementation for new methods. Implementing classes can then choose to use the default implementation or override it with their own implementation if needed. This way, existing code that implements the interface remains unaffected.

### Here are some key points about default methods:
* Syntax: Default methods are declared using the default keyword in the interface. The method body contains the default implementation.
* Availability: Default methods can be defined only in interfaces, not in classes or abstract classes.
* Inheritance and Overriding: Default methods can be inherited by subinterfaces and implementing classes. If a class implements multiple interfaces with default methods that have the same signature, the implementing class must provide an implementation for the conflicting method or explicitly override it.
* Use Cases:
  1. Adding new methods to existing interfaces without breaking the existing code.
  2. Providing a default implementation for methods that are common across multiple implementations.
  3. Extending the functionality of interfaces without affecting the implementing classes.


```java
interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Honking the horn!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the motorcycle");
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle doesn't have a horn");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.honk(); // Uses the default implementation

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.honk(); // Overrides the default implementation
    }
}
```

In this example, we have an interface Vehicle with a default method honk(). The Vehicle interface also declares an abstract method start(). The Car class implements the Vehicle interface and provides an implementation for the start() method. The default implementation of honk() is used.

The Motorcycle class also implements the Vehicle interface, but it overrides the honk() method with its own implementation. When calling honk() on a Motorcycle object, it uses the overridden implementation instead of the default one.

Default methods allow interfaces to evolve without breaking existing implementations, providing more flexibility and backward compatibility in Java.
