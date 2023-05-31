package org.Java8P2.MapAsAStreamSource.service;

import org.Java8P2.MapAsAStreamSource.db.Storage;
import org.Java8P2.MapAsAStreamSource.model.Author;
import org.Java8P2.MapAsAStreamSource.model.Book;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService{
    @Override
    public List<Author> getMostPopularBook(int fromAge, int toAge) {
        return Storage.getStatistic().entrySet().stream()
                .filter(e -> e.getKey().getAge() > fromAge && e.getKey().getAge() < toAge)
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}
