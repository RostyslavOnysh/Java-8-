package org.Java8P2.MapAsAStreamSource;

import org.Java8P2.MapAsAStreamSource.model.Author;
import org.Java8P2.MapAsAStreamSource.service.AuthorService;
import org.Java8P2.MapAsAStreamSource.service.AuthorServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Stream API: How to wirk with Map(K, V) ?

        /* There is a Map <User, List<Book>>
        that represent  the list of books by each User
        Find the most popular Authors for users whose age between 25 and 35
         */

        AuthorService authorService = new AuthorServiceImpl();
        List<Author> authors = authorService.getMostPopularBook(25,35);
        for (Author author : authors) {
            System.out.println( author);
        }
    }
}
