package org.Java8P2.MapAsAStreamSource.service;

import org.Java8P2.MapAsAStreamSource.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getMostPopularBook(int age, int toAge);
}
