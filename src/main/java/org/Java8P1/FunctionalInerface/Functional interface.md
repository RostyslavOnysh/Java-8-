У Java ***функціональний інтерфейс*** є інтерфейсом, який має лише 
* один абстрактний метоd  !!
 Це дозволяє його використовувати в якості функціонального типу, тобто типу, який представляє функцію або оператор.
Одним з прикладів функціонального інтерфейсу в Java є ***java.util.function.Function***.

Функціональні інтерфейси в Java використовуються в головному для ***підтримки лямбда-виразів і методів посилань***, що дозволяє зручно передавати функціональність як параметри методам і використовувати їх як значення. Це спрощує роботу з функціональним програмуванням та дозволяє писати більш компактний і зрозумілий код.

Для того, щоб інтерфейс був функціональним, він ***повинен мати лише один абстрактний метод***, але може мати декілька методів за замовчуванням або статичних методів. Наприклад, функціональний інтерфейс ***Function*** має один абстрактний метод *apply()*, який виконує операцію на вхідному аргументі і повертає результат. Такий інтерфейс можна використовувати для передачі функцій, які приймають один аргумент і повертають результат.

#### Основна перевага функціональних інтерфейсів полягає в тому, що вони дозволяють писати більш зрозумілий і компактний код, особливо в поєднанні з *лямбда-виразами*. Наприклад, замість того, щоб писати окремий клас або інтерфейс для кожної функції,можна використовувати функціональні інтерфейси для передачі функцій безпосередньо як параметрів методам або їх використання як значень.

### Отже, функціональний інтерфейс в Java - це інтерфейс з одним абстрактним методом, який використовується для підтримки функціонального програмування, лямбда-виразів та методів посилань. Вони дозволяють передавати функції як параметри і використовувати їх як значення, що робить код більш зрозумілим та компактним.

* Звичайним прикладом використання функціонального інтерфейсу з *лямбда-виразами та компаратором* може бути сортування списку об'єктів за допомогою певного критерію. Для цього ми можемо використовувати функціональний інтерфейс ***Comparator разом з лямбда-виразами***.

* Наприклад, розглянемо список об'єктів Person, які містять ім'я та вік. Ми хочемо відсортувати цей список за ім'ям. Для цього можна створити компаратор, який порівнює імена об'єктів Person. Ось як це можна зробити за допомогою функціонального інтерфейсу та лямбда-виразу:

```java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Alice", 30));
        persons.add(new Person("Bob", 20));

        // Використання лямбда-виразу для створення компаратора
        Comparator<Person> nameComparator = (p1, p2) -> p1.getName().compareTo(p2.getName());

        // Сортування списку за допомогою компаратора
        persons.sort(nameComparator);

        // Виведення відсортованого списку
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

У цьому прикладі ми створили функціональний *інтерфейс*  ***Comparator<Person>*** з допомогою *лямбда-виразу***, який порівнює імена об'єктів Person. Потім ми використали цей компаратор для сортування списку persons за іменами. 
Результатом буде відсортований список, який буде виведений на екран.


* Припустимо, ми маємо клас ***Product***, який представляє товар з властивостями: 
* назва, 
* ціна 
* рейтинг.
Ми хочемо ***відсортувати*** список товарів за декількома критеріями, такими як назва, ціна та рейтинг.

Ось як можна реалізувати це за допомогою функціонального інтерфейсу Comparator та лямбда-виразів:

```java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, 4.5));
        products.add(new Product("Phone", 800, 4.2));
        products.add(new Product("Headphones", 200, 4.8));

        // Сортування за назвою (у алфавітному порядку)
        Comparator<Product> nameComparator = Comparator.comparing(Product::getName);
        products.sort(nameComparator);
        System.out.println("Сортування за назвою:");
        printProducts(products);

        // Сортування за ціною (у порядку зростання)
        Comparator<Product> priceComparator = Comparator.comparingDouble(Product::getPrice);
        products.sort(priceComparator);
        System.out.println("\nСортування за ціною:");
        printProducts(products);

        // Сортування за рейтингом (у порядку спадання)
        Comparator<Product> ratingComparator = Comparator.comparingDouble(Product::getRating).reversed();
        products.sort(ratingComparator);
        System.out.println("\nСортування за рейтингом:");
        printProducts(products);
    }

    private static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getName() + " - Ціна: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }
    }
}

class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
```

* Сортування за назвою (у алфавітному порядку):
Ми створюємо компаратор nameComparator, використовуючи метод Comparator.comparing().
У методі comparing() ми передаємо посилання на метод getName() класу Product, щоб вказати, за яким полем сортувати.
Потім ми використовуємо цей компаратор для сортування списку products за допомогою методу sort() класу List.
Результат виводиться на екран за допомогою методу printProducts().
Сортування за ціною (у порядку зростання):

* Сортування за ціною (у порядку зростання):
Ми створюємо компаратор priceComparator, використовуючи метод Comparator.comparingDouble().
У методі comparingDouble() ми передаємо посилання на метод getPrice() класу Product, щоб вказати, за яким полем сортувати (у нашому випадку - ціна).
Потім ми використовуємо цей компаратор для сортування списку products.
Результат виводиться на екран.
Сортування за рейтингом (у порядку спадання):

* Сортування за рейтингом (у порядку спадання):
Ми створюємо компаратор ratingComparator, використовуючи метод Comparator.comparingDouble() та reversed().
У методі comparingDouble() ми передаємо посилання на метод getRating() класу Product, щоб вказати, за яким полем сортувати (у нашому випадку - рейтинг).
Метод reversed() додає додатковий функціонал до компаратора, щоб виконати сортування у порядку спадання.
Потім ми використовуємо цей компаратор для сортування списку products.
Результат виводиться на екран.
Кожен з цих компараторів використовується для сортування списку за певним критерієм за допомогою методу sort(). Результати сортування виводяться на екран за допомогою методу printProducts().