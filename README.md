# Java-8 part 1

* inner class
* Why Java 8 ?
* Lambda
* Lambda Types
* Functional interface
* Default methods
* Same dafault methods in interfaces
* Method reference 
* Method reference types
* Functionals Interfaces in *JDK*
* Predicate
* Consumer
* Supplier
* Working with Exceptions in Functional interface
* Private and static methods



# Static Nested Class 
- це клас, оголошений як статичний член іншого класу. Це означає, що ви можете створити об'єкт статичного вкладеного класу навіть без створення об'єкта зовнішнього класу.

Ось деякі властивості та використання Static Nested Class:

* *Внутрішній доступ:* 
Статичний вкладений клас має доступ до всіх статичних членів зовнішнього класу, включаючи приватні статичні члени.

* *Не потребує інстанціювання зовнішнього класу:*
Ви можете створити об'єкт статичного вкладеного класу без потреби створення об'єкта зовнішнього класу. Наприклад:
```java 
public class OuterClass {
    private static int outerData = 10;

    public static class StaticNestedClass {
        public void display() {
            System.out.println("Outer data: " + outerData);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}
```

* *Простори імен:* Статичний вкладений клас має свій власний простір імен. Це означає, що ви можете мати статичний вкладений клас з таким самим ім'ям, як і інші класи в інших просторах імен.

* *Ізоляція:* Статичний вкладений клас може бути використаний для групування класів, які мають близьку взаємодію та є логічно пов'язаними між собою.

* *Може мати свої власні статичні поля та методи:* Статичний вкладений клас може містити власні статичні поля та методи, які можуть бути використані без створення об'єкта класу.

* *Немає доступу до нестатичних членів зовнішнього класу:* Статичний вкладений клас не має прямого доступу до нестатичних членів зовнішнього класу, оскільки він не має посилання на конкретний об'єкт зовнішнього класу. Але він може мати доступ до них через об'єкт зовнішнього класу, створеного в межах статичного вкладеного класу.

***Статичні вкладені класи корисні для організації і групування пов'язаних класів, коли класи є тісно зв'язаними та є взаємозалежними. Вони можуть полегшити розуміння коду, зберігати простір імен і дати зрозумілу структуру проекту.***

# Non-static inner classes 
## (також відомі як inner classes або member classes)
є класами, вкладеними всередині іншого класу. Основна різниця між ***non-static inner class та static nested class*** полягає в їхній *залежності від зовнішнього класу:*

* *Залежність від зовнішнього класу:*
Non-static inner class має прямий доступ до всіх членів зовнішнього класу, включаючи приватні члени.
Вона може використовувати та змінювати поля та методи зовнішнього класу ***без обмежень***. Завдяки цьому, вона може бути корисною, коли потрібен доступ до внутрішньої структури та функцій зовнішнього класу.
  * ***Залежність від екземпляру зовнішнього класу***: Кожен екземпляр ***non-static inner class*** пов'язаний з конкретним екземпляром зовнішнього класу. Це означає, що ви повинні мати *екземпляр зовнішнього класу*, щоб створити екземпляр inner class. В коді, це показано так: 
  ```java
  LinkedList.Node node = list.new Node();
  ```
* *Ізоляція:*
***Non-static inner class*** може бути корисною для організації та структурування коду. 
Вона дозволяє згуртувати класи, які логічно пов'язані між собою та не мають сенсу без зовнішнього класу.

* *Спадковість:* Non-static inner class може успадковуватися від інших класів та реалізовувати інтерфейси, так само як і звичайні класи.
```java
public class LinkedList {
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public class Node {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key='" + key + '\'' +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node node = list.new Node();
        list.setKey("Key!!!");
        node.setValue("VALUE!!");
        System.out.println(node.toString());
    }
}
```
У цьому прикладі ***Node*** є non-static inner class для класу ***LinkedList***. Ви створюєте екземпляр ***Node*** за допомогою ***list.new Node()***, оскільки він залежить від конкретного екземпляру ***LinkedList***.

В методі ***main*** створюється *екземпляр*  ***LinkedList*** за допомогою :  
```java
LinkedList list = new LinkedList().
 ``` 
Потім створюється екземпляр ***Node*** за допомогою ***list.new Node()***. Ви можете отримати доступ до полів та методів зовнішнього класу з Node. Наприклад, ***node.setValue("VALUE!!")*** встановлює значення value у Node, а ***list.setKey("Key!!!")*** встановлює значення key у LinkedList. При виклику node.toString(), 
буде виведений рядок, що містить обидва значення.

### Non-static inner class може бути корисною, коли ви хочете мати *тісний зв'язок між вкладеними класами та потребуєте доступу до полів та методів зовнішнього класу*. Вона також дозволяє структурувати код та зберігати логічну залежність між класами.



# Java-8 part 2

* Stream API intro
* Stream of primitives
* How to create Streame 
* How to use Streams
* Map vs flatmap example
* Map as Stream Source
* Collect oto Map
* Boxed an mapToObj
* findFirst,findAny and anyMatch
* How to debug Stream API
* Stream API performance
