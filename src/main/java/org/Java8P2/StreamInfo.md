# Метод Stream API

в Java надає можливість виконувати операції зі списками даних
з використанням функціонального підходу. Він дозволяє здійснювати операції,
такі як ***фільтрація, сортування, трансформація, обмеження, агрегація*** і багато інших,
на елементах ***стріму*** безпосередньо без необхідності висновувати результати в іншу колекцію.

За допомогою методу ***Stream API*** можна скорочувати та спрощувати код при роботі з колекціями даних.
Він підтримує функціональне програмування, що дозволяє використовувати ***лямбда-вирази та методи посилання*** для
зручної обробки даних.

Загалом, ***метод Stream API*** забезпечує потужний та ефективний спосіб маніпулювання даними в Java,
спрощуючи роботу зі списками та колекціями.

### Java 8 introduced the Stream API, which provides several powerful features for working with collections and processing data. Here are some key features of the Java 8 Stream API:

* ***Functional Programming:*** The Stream API enables a functional programming approach by allowing operations to be
  performed on streams using lambda expressions or method references. This promotes a more concise and declarative
  coding style.

* ***Pipeline Operations:*** Streams support a series of pipeline operations that can be chained together to perform
  complex data processing tasks. These operations include filtering, mapping, sorting, reducing, and collecting
  elements.

***Laziness and Short-circuiting:*** Stream operations are lazy, which means they are only executed when needed.
Intermediate operations are evaluated on-demand, and terminal operations are short-circuiting, meaning they may not
process the entire stream if the result is determined early.

***Parallel Processing:*** The Stream API provides built-in support for parallel processing. By invoking the parallel()
method on a stream, the processing can be automatically parallelized, potentially improving performance on multi-core
systems.

***Integration with Existing APIs:*** The Stream API seamlessly integrates with existing Java collections and APIs. It
can be used with lists, sets, maps, arrays, and I/O channels, allowing for a consistent and unified approach to data
processing.

* ***Improved Readability and Maintainability***: The Stream API helps in writing more readable and maintainable code by
  providing a higher level of abstraction. Complex operations can be expressed in a clear and concise manner, making the
  code easier to understand and maintain.

Overall, the Java 8 Stream API offers a powerful and expressive way to manipulate collections and process data in a
functional and efficient manner. It has become an essential tool for working with data in modern Java applications.

## The ***stream()*** method in Java

is a terminal operation that is used to obtain a stream from a collection or array.
It is available on various collection types, such as List, Set, and Map, as well as on arrays.

Once you have a stream, you can perform various intermediate and terminal operations on it to manipulate the
collection's elements. However, it's important to note that the stream() method itself is a terminal operation because
it marks the end of the stream pipeline and returns a stream object.

Here's an example of using the stream() method and a terminal operation:

```java
List<Integer> numbers=Arrays.asList(1,2,3,4,5);

// Get a stream from the list of numbers
        Stream<Integer> numberStream=numbers.stream();

// Perform an intermediate operation (e.g., filtering)
        Stream<Integer> filteredStream=numberStream.filter(n->n%2==0);

// Perform a terminal operation (e.g., summing the filtered elements)
        int sum=filteredStream.sum();

        System.out.println("Sum of even numbers: "+sum);
```

In this example, the stream() method is called on the numbers list to obtain a stream of integers. Then, an intermediate
operation filter() is applied to the stream to retain only the even numbers. Finally, a terminal operation sum() is
called on the filtered stream to calculate the sum of the even numbers.

Terminal operations are operations that produce a result or a side-effect. They consume the elements of the stream and
produce a final output or perform an action. Some common terminal operations include forEach(), collect(), reduce(),
min(), max(), and count().

It's important to note that once a terminal operation is called on a stream, the stream cannot be reused. If you need to
perform multiple operations on the same stream, you can chain them together before calling a terminal operation.

### To convert an IntStream to a Stream<String>

***(conversion to String)***,
you can use the mapToObj method along with the Integer.toString method reference:

```java
IntStream intStream=IntStream.of(1,2,3,4,5);

        Stream<String> stringStream=intStream.mapToObj(Integer::toString);

// Example usage: printing the converted strings
        stringStream.forEach(System.out::println);
```

In the above example, IntStream.of(1, 2, 3, 4, 5) creates an IntStream containing the numbers 1 to 5. The mapToObj
method is then used to convert each int element to a String using the Integer.toString method reference.

### To convert a Stream<String> to an IntStream

***(conversion to int)***, you can use the mapToInt method along with the Integer.parseInt method:

```java
Stream<String> stringStream=Stream.of("1","2","3","4","5");

        IntStream intStream=stringStream.mapToInt(Integer::parseInt);

// Example usage: calculating the sum of converted integers
        int sum=intStream.sum();
        System.out.println("Sum of converted integers: "+sum);
```

In this example, Stream.of("1", "2", "3", "4", "5") creates a Stream<String> with the strings "1" to "5". The mapToInt
method is then used to convert each String element to an int using the Integer.parseInt method.

Remember to consider proper error handling when performing these conversions, as the conversion methods may throw a
NumberFormatException if the string cannot be parsed as an integer or if the integer is outside the valid range.