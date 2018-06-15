package org.sambaran.library.ejb;

import org.sambaran.library.model.Book;
import org.sambaran.library.model.BookAdded;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookService {

    @PersistenceContext(name = "libraryPU")
    EntityManager entityManager;

    @Inject
    private Event<BookAdded> bookAddedEvent;

//    public List<Book> getBooks() {
//        return bookRepository.getAllBooks();
//    }

    public Book addBook(Book book) {
        Book b = store(book);
        bookAddedEvent.fire(new BookAdded(b.getId(), b.getName()));
        return b;
    }

    public Book store(Book book) {
        entityManager.persist(book);
        return book;
    }

    public Book getBookById(int id) {
        return entityManager.find(Book.class, id);
    }

}
