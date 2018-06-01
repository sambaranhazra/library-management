package org.sambaran.library.ejb;

import org.sambaran.library.control.BookRepository;
import org.sambaran.library.model.Book;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateless
public class BookService {
    @Inject
    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }

    public void addBook(Book book) {
        bookRepository.store(book);
    }

    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }
}
