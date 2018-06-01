package org.sambaran.library.control;

import org.sambaran.library.model.Book;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public void store(Book book) {
        books.add(book);
    }

    public Book getBookById(int id) {
        return books.stream().filter(b -> b.getId() == id).findAny().orElse(null);
    }
}
