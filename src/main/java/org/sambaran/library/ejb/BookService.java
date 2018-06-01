package org.sambaran.library.ejb;

import org.sambaran.library.control.BookRepository;
import org.sambaran.library.model.Book;
import org.sambaran.library.model.BookAdded;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BookService {

    @Inject
    private BookRepository bookRepository;

    @Inject
    private Event<BookAdded> bookAddedEvent;

    public List<Book> getBooks() {
        return bookRepository.getAllBooks();
    }

    public Book addBook(Book book) {
        bookRepository.store(book);
        bookAddedEvent.fire(new BookAdded(book.getName()));
        return book;
    }

    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }
}
