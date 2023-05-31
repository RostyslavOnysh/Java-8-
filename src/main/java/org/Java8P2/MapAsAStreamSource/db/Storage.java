package org.Java8P2.MapAsAStreamSource.db;

import org.Java8P1.innerClasses.User;
import org.Java8P2.MapAsAStreamSource.model.Author;
import org.Java8P2.MapAsAStreamSource.model.Book;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    public static Map<User, List<Book>> getStatistic() {
        User bob = new User("Bob", 23);
        User alice = new User("Alice", 27);
        User john = new User("John", 32);
        User bill = new User("Bill", 29);

        Author miquelDeCervantes = new Author("Miquel", "de Cervantes");
        Book donQuixote = new Book("Don Quixote", miquelDeCervantes);
        Book espanolaInglesa = new Book("La espanola inglesa", miquelDeCervantes);

        Author markTwain = new Author("Mark", "Twein");
        Book tomSawyer = new Book("The Advantures of Tom Sawyer", markTwain);

        Book thinkingInJava = new Book("Thinking in Java", new Author("Bruce", "Eckel"));
        Book thinkingInC = new Book("Thinking in C++", new Author("Bruce", "Eckel"));
        Book javaEight = new Book("On Java 8", new Author("Bruce", "Eckel"));

        Map<User, List<Book>> statistic = new HashMap<>();
        statistic.put(bob, List.of(donQuixote, espanolaInglesa));
        statistic.put(alice, List.of(tomSawyer));
        statistic.put(john, Collections.emptyList());
        statistic.put(bill, List.of(thinkingInJava, thinkingInC, javaEight));
        return statistic;
    }
}
